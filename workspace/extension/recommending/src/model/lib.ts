export class Lib {
    public lib: String[] | undefined;

    constructor(lib: String[]) {
        this.lib = lib;
    }

    getLib(): any {
        return this.lib;
    }

    setLib(lib: String[]) {
        this.lib = lib;
    }
}