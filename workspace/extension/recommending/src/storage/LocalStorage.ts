'use strict';
// A memento object that stores state independent of the current opened workspace.
import { Memento } from "vscode";

export class LocalStorage {
    
    constructor(private storage: Memento) { }   
    
    public getValue(key : string) {
        return this.storage.get(key);
    }

    public setValue<T>(key : string, value : T){
        this.storage.update(key, value );
    }
}