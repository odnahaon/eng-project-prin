package main.java;

public enum TypeOfObs {
    BIRD_0(0),
    BIRD_1(1),
    BIRD_2(2),
    INVALID(69);
    


    public final int typeOfObs;

    TypeOfObs(int typeOfObs) {
        this.typeOfObs = typeOfObs;
    }
    
    public static TypeOfObs toObstacle(int typeOf) {
        switch (typeOf) {
            case 0:
                return TypeOfObs.BIRD_0;
            case 1:
                return TypeOfObs.BIRD_1;
            case 2:
                return TypeOfObs.BIRD_2;
            default:
                return TypeOfObs.INVALID;
        }
    }
}
