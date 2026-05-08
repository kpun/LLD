package com.Design.Patterns.DependencyInversion;

public class Mac {
    //Violation of dependency inversion principle directly depencing on concrete classes instead of abstraction( interface)
    WiredKeyBoard keyBoard;
    WiredMouse mouse;

    Mac() {
        keyBoard = new WiredKeyBoard();
        mouse = new WiredMouse();
    }
}
