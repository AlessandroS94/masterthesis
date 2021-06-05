#    Copyright (C) 2020 Daniel Gamermann <gamermann@gmail.com>
#
#    This file is part of Surpriser
#
#    Surpriser is free software: you can redistribute it and/or modify
#    it under the terms of the GNU General Public License as published by
#    the Free Software Foundation, either version 3 of the License, or
#    (at your option) any later version.
#
#    Surpriser is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU General Public License for more details.
#
#    You should have received a copy of the GNU General Public License
#    along with Surpriser.  If not, see <http://www.gnu.org/licenses/>.
#
#    
#    Please, cite us in your reasearch!
#
from Surpriser.randoms import drand
from math import log



def Pielou(com):
    """ Pielou index for the numbers in com (a list of integers representing community sizes).
    """
    tot = sum(com)
    pis = [ele*1./tot for ele in com]
    if len(pis)==1:
        S = 0.
    else:
        S = -sum([ele*log(ele) for ele in pis])/log(len(com))
    return S


def Pielouer(Nc, pie, imin=1, imax=100, Nt=100, eps=.01):
    """ Generates Nc integers between imin and imax with pielou index equal to pie up to an interval
    of size eps. Nt*Nc is the number of times it will try to fix the list in order to achieve the 
    goal value.
    """
    if pie>1. or pie<0.:
        print("Alert: pielou index should be between 0 and 1!")
        return None
    nums = [int(drand()*(imax-imin))+imin for ii in range(Nc)]
    piea = Pielou(nums)
    tries = 0
    nl = nums[:]
    while abs(piea-pie)>eps and tries<Nt*Nc:
        tries += 1
        ir = int(drand()*Nc)
        ns = nums[ir]
        nl[ir] = int(drand()*(imax-imin))+imin
        npie = Pielou(nl)
        if abs(npie-pie)<abs(piea-pie):
            nums[ir] = nl[ir]
            piea = npie
        else:
            nl[ir] = ns
    if tries>=Nt*Nc:
        print("Best pielou achieved after %i tries is %f."%(Nc*Nt, piea))
    return nums


def PielouerNodes(Nc, pie, Nmin, Nmax, imin=1, imax=100, Nt=100, eps=.01):
    """ Generates Nc integers between imin and imax with pielou index equal to pie up to an interval
    of size eps and whose sum is between Nmin and Nmax. Nt*Nc is the number of times it will try to 
    fix the list in order to achieve the goal value.
    """
    if pie>1. or pie<0.:
        print("Alert: pielou index should be between 0 and 1!")
        return None
    nums = [int(drand()*(imax-imin))+imin for ii in range(Nc)]
    piea = Pielou(nums)
    Na = sum(nums)
    tries = 0
    nl = nums[:]
    while (abs(piea-pie)>eps or Na>Nmax or Na<Nmin) and tries<Nt*Nc:
        tries += 1
        if Na<Nmin:
            ir = nums.index(min(nums))
            nn = int(drand()*(imax-imin))+imin
            Na -= nums[ir] - nn
            nums[ir] = nn
            nl[ir] = nn
            piea = Pielou(nums)
        if Na>Nmax:
            ir = nums.index(max(nums))
            Na -= nums[ir] - imin
            nums[ir] = imin
            nl[ir] = imin
            piea = Pielou(nums)
        ir = int(drand()*Nc)
        ns = nums[ir]
        nl[ir] = int(drand()*(imax-imin))+imin
        npie = Pielou(nl)
        nN = sum(nums)
        if abs(npie-pie)<abs(piea-pie):
            Na -= nums[ir] - nl[ir]
            nums[ir] = nl[ir]
            piea = npie
        else:
            nl[ir] = ns
    if tries>=Nt*Nc:
        print("Best pielou achieved after %i tries is %f."%(Nc*Nt, piea))
    return nums





class MBenchmark:
    
    """ Benchmarked network.
    Usage bench = MBenchmark( cliques, r=0.01, cycle=False )
    
    cliques is a list of integers with cliquesizes, r the fraction of nodes in the graph
    alone in their communities and cycle=True will tell the benchmark to connect all cliques
    in a ring.
    """
    
    def __init__(self, cliques, r=0.01, cycle=False):
        """ Benchmarked network.
        Usage bench = MBenchmark( cliques, r=0.01, cycle=False )
        
        cliques is a list of integers with cliquesizes, r the fraction of nodes in the graph
        alone in their communities and cycle=True will tell the benchmark to connect all cliques
        in a ring.
        """
        # sets nodes and M matrix
        Nc = len(cliques)
        N = sum(cliques)
        N1 = int(r*N/(1.-r))
        partition = []
        M = [[0 for ii in range(N+N1)] for jj in range(N+N1)]
        incliques = 0
        betweenc = 0
        pos = 0
        # Connections....
        for ii, clique in enumerate(cliques):
            cs = clique
            partition += [ii for jj in range(clique)]
            for jj in range(pos, pos+clique):
                for kk in range(jj+1, pos+clique):
                    incliques += 1
                    M[jj][kk] = 1
                    M[kk][jj] = 1
            pos += clique
        # isolated nodes with single connections.
        for kk in range(N1):
            ii = kk + N
            jj = int(N*drand())
            com = Nc+kk
            partition.append(com)
            betweenc += 1
            M[ii][jj] = 1
            M[jj][ii] = 1
        # single connection between cliques (cycle)
        if cycle:
            pos = 0
            for clique in cliques:
                if not M[pos-1][pos]:
                    betweenc += 1
                M[pos-1][pos] = 1
                M[pos][pos-1] = 1
                pos += clique
        self.Nc = Nc + N1
        self.K = N + N1
        self.N1 = N1
        self.incliques = incliques
        self.betweenc = betweenc
        self.M = M
        self.partition = partition
        self.cliques = cliques
        self.Ncliques = Nc
        self.NinCliques = N
        self.r = r
        self.cycle = cycle
        self.func1 = lambda cs, pars:0.
        self.params1 = ()
        self.func2 = lambda cs1, cs2, pars:0.
        self.params2 = ()
    
    def __repr__(self):
        einc = sum([(1.-self.func1(ele, self.params1))*ele*(ele-1)/2 for ele in self.cliques])
        ebec = sum([self.func2(ele1, ele2, self.params2)*ele1*ele2 for ii, ele1 in enumerate(self.cliques) for ele2 in self.cliques[ii+1:]]) + self.r*self.K
        pbar = self.incliques*1./sum([ele*(ele-1)/2 for ele in self.cliques])
        qbar = self.betweenc*1./(sum([ele1*ele2 for ii, ele1 in enumerate(self.cliques) for ele2 in self.cliques[ii+1:]])  \
                                + sum([ele1*self.N1 for ele1 in self.cliques]) )
        kis = [sum(ele) for ele in self.M]
        nl = sum(kis)/2 # Number of links
        stri = "< Benchmark:\n"
        stri += " Number of nodes     : %i\n"%self.K
        stri += " Total links         : %i (%f)\n"%(nl, einc+ebec)
        stri += " Inside cliques      : %i (%f)\n"%(self.incliques, einc)
        stri += " Between communities : %i (%f)\n"%(self.betweenc, ebec)
        stri += " pbar                : %f \n"%(1.-pbar)
        stri += " qbar                : %f >"%(qbar)
        return stri

    def degradP(self, func1=lambda cs, pars:.8, params1=()):
        """ Removes links inside cliques with probability controlled by func1 and params1.
        Usage: MBenchmark.degradP( func1=lambda cs, pars:.8, params1=() )
        each link inside a clique os size cs will be removed with probability func1(cs, params1).
        """
        pos = 0
        self.incliques = 0
        M = [ele[:] for ele in self.M]
        for ii, clique in enumerate(self.cliques):
            cs = clique
            for jj in range(pos, pos+clique):
                for kk in range(jj+1, pos+clique):
                    # ... inside cliques
                    if drand()>func1(cs, params1):
                        self.incliques += 1
                        M[jj][kk] = 1
                        M[kk][jj] = 1
                    else:
                        M[jj][kk] = 0
                        M[kk][jj] = 0
            pos += clique
        self.M = M
        self.func1 = func1
        self.params1 = params1
    
    def degradQ(self, func2=lambda cs1, cs2, pars:.01, params2=(), singles=True):
        """ Creates links between communities with probability controlled by func2 and params2.
        May not affect communities with single nodes if singles=False.
        Usage: MBenchmark.degradQ( func2=lambda cs, pars:.01, params2=(), singles=True )
        each possible link between two communities of sizes cs1 and cs2 will be created
        with probability func2(cs1, cs2, params2).
        """
        self.betweenc = int(self.r*self.K)
        M = [ele[:] for ele in self.M]
        # Connections between cliques
        for jj in range(self.NinCliques):
            cs1 = self.cliques[self.partition[jj]]
            for kk in range(jj+1, self.NinCliques):
                cs2 = self.cliques[self.partition[kk]]
                if self.partition[jj]!=self.partition[kk]:
                    if drand()<func2(cs1, cs2, params2):
                        self.betweenc += 1
                        M[jj][kk] = 1
                        M[kk][jj] = 1
                    else:
                        M[jj][kk] = 0
                        M[kk][jj] = 0
            if singles:
                for kk in range(self.NinCliques, self.K):
                    cs2 = 1
                    if self.partition[jj]!=self.partition[kk]:
                        if drand()<func2(cs1, cs2, params2):
                            self.betweenc += 1
                            M[jj][kk] = 1
                            M[kk][jj] = 1
                        else:
                            M[jj][kk] = 0
                            M[kk][jj] = 0
        self.M = M
        self.func2 = func2
        self.params2 = params2
    
    def saveEdges(self, fil="edges.txt"):
        """ Saves all edges in the benchmark to a file.
        """
        edges = []
        for i in range(self.K):
            for j in range(i+1, self.K):
                if self.M[i][j]:
                    edges.append( (i, j) )
        print("\n".join(["%i    %i"%(link[0], link[1]) for link in edges]), file=open(fil, "w"))
    
    def savePartition(self, fil="partition.txt"):
        """ Saves the partition of the benchmark to a file.
        """
        print("\n".join(["%i    %i"%(ii, part) for ii, part in enumerate(self.partition)]), file=open(fil, "w"))





