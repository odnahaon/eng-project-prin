package main.java;

import java.io.Serializable;

public class Obstacles implements Serializable {

    private static final long serialVersionUID = 1L;
    public int pos;
    public TypeOfObs typeOf;

    public Obstacles(int pos, TypeOfObs typeOf) {
        this.pos = pos;
        this.typeOf = typeOf;
    }

    public final int getPos() {
        return pos;
    }
    
    public final TypeOfObs getTypeOfObs() {
        return typeOf;
    }

    public String toString() {
        return "Obstacle position: " + pos + " and obstacle type: " + typeOf.toString();
    }
}
