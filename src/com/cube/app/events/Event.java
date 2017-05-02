package com.cube.app.events;

/**
 * Created by Cube27 on 29.04.2017.
 */
public class Event {

    public enum Type{
        MOUSE_MOVED,
        MOUSE_PRESSED,
        MOUSE_RELEASED
    }

    private Type type;

    public boolean handled;

    protected Event (Type type){
        this.type = type;
    }

    public Type getType(){
        return this.type;
    }

}
