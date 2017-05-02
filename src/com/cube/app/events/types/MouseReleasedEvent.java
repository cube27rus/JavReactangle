package com.cube.app.events.types;

import com.cube.app.events.Event;

/**
 * Created by Cube27 on 29.04.2017.
 */
public class MouseReleasedEvent extends MouseButtonEvent{

    public MouseReleasedEvent(int keyCode, int x, int y) {
        super(Type.MOUSE_RELEASED, keyCode, x, y);
    }
}
