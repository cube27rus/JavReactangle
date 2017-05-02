package com.cube.app.sandbox;

import com.cube.app.events.Dispatcher;
import com.cube.app.events.Event;
import com.cube.app.events.EventHandler;
import com.cube.app.events.types.MouseMotionEvent;
import com.cube.app.events.types.MousePressedEvent;
import com.cube.app.events.types.MouseReleasedEvent;
import com.cube.app.layers.Layer;
import javafx.scene.paint.*;

import java.awt.*;
import java.awt.Color;
import java.util.Random;

/**
 * Created by Cube27 on 29.04.2017.
 */
public class Example extends Layer {

    private String name;
    private Color color;
    private Rectangle rect;
    private boolean dragging = false;
    private int px,py;

    private final static Random random = new Random();

    public Example(String name, Color color){

        this.name = name;
        this.color = color;
        this.rect = new Rectangle(random.nextInt(100)+150,random.nextInt(100)+250,120,240);

    }



    @Override
    public void onEvent(Event e) {
        Dispatcher dispatcher = new Dispatcher(e);
        dispatcher.dispatch(Event.Type.MOUSE_PRESSED, new EventHandler() {
            @Override
            public boolean handle(Event e) {
                return onPressed((MousePressedEvent)e);
            }
        });
        dispatcher.dispatch(Event.Type.MOUSE_RELEASED, new EventHandler() {
            @Override
            public boolean handle(Event e) {
                return onReleased((MouseReleasedEvent)e);
            }
        });
        dispatcher.dispatch(Event.Type.MOUSE_MOVED, new EventHandler() {
            @Override
            public boolean handle(Event e) {
                return onMoved((MouseMotionEvent)e);
            }
        });

    }

    public void onRender(Graphics g){
        g.setColor(color);
        g.fillRect(rect.x,rect.y,rect.width,rect.height);
        g.setColor(Color.WHITE);
        g.drawString(name,rect.x+15,rect.y+35);
    }

    private boolean onPressed(MousePressedEvent event){
        if(rect.contains(new Point(event.getX(),event.getY()))){
            dragging = true;

        }
        return dragging;

    }
    private boolean onReleased(MouseReleasedEvent event){
        dragging = false;
        System.out.println("Mouse released ");
        return dragging;
    }
    private boolean onMoved(MouseMotionEvent event){
        //???
        if(dragging){
            rect.x+= event.getX()-px;
            rect.y+=event.getY()-py;
        }
        px=event.getX();
        py=event.getY();
        return dragging;
    }

}

