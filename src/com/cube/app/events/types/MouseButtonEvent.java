package com.cube.app.events.types;

import com.cube.app.events.Event;

/**
 * Created by Cube27 on 29.04.2017.
 */
public class MouseButtonEvent extends Event {

    private int x,y,keyCode;

    protected MouseButtonEvent(Type type,int keyCode, int x , int y  ) {
        super(type);
        this.x = x;
        this.y=y;
        this.keyCode=keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getKeyCode() {
        return keyCode;
    }
}
