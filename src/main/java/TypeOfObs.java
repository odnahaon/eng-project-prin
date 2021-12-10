package main.java;

public enum TypeOfObs {
    BIRD_0(0),
    BIRD_1(1),
    BIRD_2(2),
    CACTUS_BIG_1(3),
    CACTUS_BIG_2(4),
    CACTUS_BIG_3(5),
    CACTUS_SMALL_1(6),
    CACTUS_SMALL_2(7),
    CACTUS_SMALL_3(8),
    INVALID(69);
    
    public final int typeOfObs;

    TypeOfObs(int typeOfObs) {
        this.typeOfObs = typeOfObs;
    }
    
    public static TypeOfObs toObstacle(int typeOf) {
        switch (typeOf) {
            case 0:
                return BIRD_0;
            case 1:
                return BIRD_1;
            case 2:
                return BIRD_2;
            case 3:
                return CACTUS_BIG_1;
            case 4:
                return CACTUS_BIG_2;
            case 5:
                return CACTUS_BIG_3;
            case 6:
                return CACTUS_SMALL_1;
            case 7:
                return CACTUS_SMALL_2;
            case 8:
                return CACTUS_SMALL_3;
            default:
                return INVALID;
        }
    }
    
    public static String toString(TypeOfObs typeOfObs1) {
        switch (typeOfObs1) {
            case BIRD_0:
                return "Bird 0";
            case BIRD_1:
                return "Bird 1";
            case BIRD_2:
                return "Bird 2";
            case CACTUS_BIG_1:
                return "Big Cactus 1";
            case CACTUS_BIG_2:
                return "Big Cactus 2";
            case CACTUS_BIG_3:
                return "Big Cactus 3";
            case CACTUS_SMALL_1:
                return "Small Cactus 1";
            case CACTUS_SMALL_2:
                return "Small Cactus 2";
            case CACTUS_SMALL_3:
                return "Small Cactus 3";
            default:
                return "Invalid";
        }
        
    }
}
