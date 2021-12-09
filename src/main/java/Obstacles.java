package main.java;

import java.io.Serializable;

public class Obstacles implements Serializable {

    private static final long serialVersionUID = 1L;
    public int pos;
    public int typeOf;

    public Obstacles(int pos, int typeOf) {
        this.pos = pos;
        this.typeOf = typeOf;
    }

    @Override
    public final String

    @Override
    public java.lang.String toString() {
        return "Obstacle position: " + pos.toString() + " and obstacle type: " + ;
    }
}
