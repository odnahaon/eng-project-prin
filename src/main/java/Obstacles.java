package main.java;

import java.io.Serializable;

public class Obstacles implements Serializable {

    private static final long serialVersionUID = 1L;
    public static Position pos;
    public static TypeOfObs typeOf;

    public Obstacles(Position pos, TypeOfObs typeOf) {
        this.pos = pos;
        this.typeOf = typeOf;
    }

    public static final Position getPos() {
        return pos;
    }
    
    public static final TypeOfObs getTypeOfObs() {
        return typeOf;
    }
    
    public static String getTypeToString() {
        return typeOf.toString();
    }

    public final String toString() {
        return "Obstacle position: " + pos + " and obstacle type: " + typeOf.toString();
    }
}
