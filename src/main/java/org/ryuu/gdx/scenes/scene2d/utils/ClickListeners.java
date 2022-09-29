package org.ryuu.gdx.scenes.scene2d.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;
import org.ryuu.functional.IAction;

import static org.ryuu.gdx.scenes.scene2d.utils.ClickListenerFactory.*;

public class ClickListeners {
    private ClickListeners() {
    }

    public static void addDelayClickListener(Actor actor, IAction onClick) {
        actor.addListener(delayClickListener(actor, onClick, 1 / 60f * 5));
    }

    public static void addDelayClickListener(Actor actor, IAction onClick, float delay) {
        actor.addListener(delayClickListener(actor, onClick, delay));
    }

    public static void addClickListener(Actor actor, IAction onClick) {
        actor.addListener(clickListener(onClick));
    }

    public static <T extends Actor> T addColorChange(T actor, Color color, float intensity) {
        actor.addListener(colorChange(actor, color, intensity));
        return actor;
    }

    public static <T extends Actor> T addSizeChange(T actor) {
        actor.addListener(sizeChange(actor));
        return actor;
    }
}