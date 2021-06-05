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
####################################################################
#
#  The data here includes:
#
# Msyn        -> M matrix for the synechocystis PCC 6803 metabolic network.
# NODESsyn    -> Metabolite represented by each node in the Msyn network.
# M243273     -> M matrix for the PPI network of Mycoplasma genitalium.
# NODES243273 -> Protein represented by each node of the M243273 network.
# Mtoy        -> Toy M matrix with 14 nodes (two size 4 cliques connected by a 3-path.
# partsToy    -> 1336 different partitions of the toy graph.
# surpsToy    -> Surprise value for the 1336 partitions in partsToy.
#
# For details in the construction of the metabolic (Msyn) and PPI (M243273) networks, see
# D. Gamermann, J. Triana-Dopico, R. Jaime,
# A comprehensive statistical study of metabolic and protein–protein interaction network properties,
# Physica A: Statistical Mechanics and its Applications, Volume 534, 2019
# https://doi.org/10.1016/j.physa.2019.122204 
#
######################################################################

import pkgutil
from Surpriser.randoms import drand, stats
from functools import reduce

def partToComs(partm):
    """ Transforms a partition into a list of communities. The partition is a list
    indicating the corresponding community of each vertex. 
    Usage: coms = partToComs( partition )
    """
    Nc = max(partm)+1
    comunities = [[] for ii in range(Nc)]
    for ii, ele in enumerate(partm):
        comunities[ele].append(ii)
    return comunities

def comsToPart(coms):
    """ Transforms a list of communities into a partition.
    Usage: partition = comsTopPart( coms )
    """
    K = max([max(ele) for ele in coms])
    part = [0 for ii in range(K+1)]
    for ii, com in enumerate(coms):
        for jj in com:
            part[jj] = ii
    return part

def check(sur):
    """ This was programmed for debugging purposes. It should always return True.
    This checks the information in a Surpriser instance.
    Usage: TrueOrFalse = check( Sur )
    If False, it will print a message indicating the test that failed.
    """
    coms = [sur.community(ii) for ii in range(sur.Nc)]
    nodes = reduce(lambda x, y:x+y, coms)
    nodes.sort()
    if not nodes==list(range(len(nodes))):
        print("Nodes Lost or created!")
        return False
    lens = [len(ele) for ele in coms]
    if 0 in lens:
        print("There is an empty community!")
        return False
    M = sum([ele*(ele-1)/2 for ele in lens])
    if M!=sur.M:
        print("M diferent (%i)!"%M)
        return False
    p = 0
    for com in coms:
        for ii, ele1 in enumerate(com):
            for ele2 in com[ii+1:]:
                p += sur.connected(ele1, ele2)
    if p!=sur.p:
        print("p diferent (%i)!"%p)
        return False
    part = sur.partition()
    for ii, com in enumerate(coms):
        for ele in com:
            if part[ele] != ii:
                print("Parition problem! Comunity %i, node %i."%(ii, ele))
                return False
    return True





def surStats(sur, pprint=False):
    """ Evaluates statistics over a Surpriser instance.
    Usage: p, q, r, cliques, ps = surStats( Sur, pprint=False )
    Returns p -> average fration of missing links inside communities.
            q -> fraction of exting links between communities.
            r -> fraction of nodes alone in their own communities
            cliques -> communities with more than one node.
            ps -> list with the fraction of of missing links for each clique.
    If pprint is True, it also prints information on screen in which case,
      pbar is the statistics of the ps list.
    """
    coms = [sur.community(ii) for ii in range(sur.Nc)]
    sizes = [len(ele) for ele in coms]
    internal = sum([ele*(ele-1)/2 for ele in sizes])
    external = sum([ele1*ele2 for ii, ele1 in enumerate(sizes) for ele2 in sizes[ii+1:]])
    clicks = [ele for ii, ele in enumerate(coms) if sizes[ii]>1]
    clicksize = [ele for ele in sizes if ele>1]
    bla = [sur.linksin(com) for com in coms]
    tots = [ele*(ele-1)/2 for ele in clicksize]
    bla2 = [ele[0] for ii, ele in enumerate(bla) if len(coms[ii])>1]
    ps = [1.-ele*1./tots[ii] for ii, ele in enumerate(bla2)]
    inc = sum([ele[0] for ele in bla])
    bec = sum([ele[1] for ele in bla])/2
    rr = (sur.K-sum(clicksize))*1./sur.K
    pp = 1.-inc*1./internal
    qq = bec*1./external
    if pprint:
        print("# Comunities : %i"%sur.Nc)
        print("# Cliques    : %i"%len(clicks))
        print("av click size: %f +- %f"%(stats(clicksize)))
        print("p            : %f"%(pp))
        print("pbar         : %f +- %f"%stats(ps))
        print("q            : %f"%(qq))
        print("r            : %f"%(rr))
    return pp, qq, rr, clicks, ps




Mtoy = [[0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0],
        [1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0],
        [1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0],
        [1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0],
        [0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0],
        [0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1],
        [0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1],
        [0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1],
        [0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0]]

Msyn = pkgutil.get_data(__package__, "data/syn.txt").decode('ascii').splitlines()
Msyn = [[int(ele2) for ele2 in ele.split(" ")] for ele in Msyn]
NODESsyn = pkgutil.get_data(__package__, "data/mets_syn.txt").splitlines()

M243273 = pkgutil.get_data(__package__, "data/243273.txt").decode('ascii').splitlines()
M243273 = [[int(ele2) for ele2 in ele.split(" ")] for ele in M243273]
NODES243273 = pkgutil.get_data(__package__, "data/243273_prots.txt").splitlines()

bla = [ele.split(" & ") for ele in pkgutil.get_data(__package__, "data/parts.dat").decode('ascii').splitlines()]
surpsToy = [float(ele[0]) for ele in bla]
partsToy = [eval(ele[1]) for ele in bla]
del bla
del pkgutil



