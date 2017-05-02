package com.cube.app.events.types;

import com.cube.app.events.Event;

/**
 * Created by Cube27 on 29.04.2017.
 */
public class MousePressedEvent extends MouseButtonEvent {

    public  MousePressedEvent(int keyCode, int x, int y) {
        super(Event.Type.MOUSE_PRESSED, keyCode, x, y);
    }
}
