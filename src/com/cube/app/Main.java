package com.cube.app;

import com.cube.app.core.Window;
import com.cube.app.sandbox.Example;

import java.awt.*;

public class Main{
    public static void  main(String[] args){
        Window window = new Window("Window",960,640);
        window.addLayer(new Example("Layer-1", Color.ORANGE));
        window.addLayer(new Example("Layer-2", Color.BLUE));
    }
}