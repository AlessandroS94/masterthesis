export class PortionCode {
    public compilationUnit: String | undefined;

    constructor(compilationUnit: String) {
        this.compilationUnit = compilationUnit;
    }

    getLib(): any {
        return this.compilationUnit;
    }

    setLib(compilationUnit: String) {
        this.compilationUnit = compilationUnit;
    }
}
