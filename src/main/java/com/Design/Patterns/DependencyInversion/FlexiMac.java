package com.Design.Patterns.DependencyInversion;

public class FlexiMac {
    KeyBoard keyBoard;
    Mouse mouse;
    FlexiMac(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }
}
