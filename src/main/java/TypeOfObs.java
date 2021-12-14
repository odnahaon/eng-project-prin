package main.java;

public enum TypeOfObs {
    CACTUS_BIG_1(1),
    CACTUS_BIG_2(2),
    CACTUS_BIG_3(3),
    CACTUS_SMALL_1(4),
    CACTUS_SMALL_2(5),
    CACTUS_SMALL_3(6),
    BIRD_0(6),
    BIRD_1(7),
    BIRD_2(8),
    INVALID(69);
    
    public final int typeOfObs;

    TypeOfObs(int typeOfObs) {
        this.typeOfObs = typeOfObs;
    }
    
    public static TypeOfObs toObstacle(int typeOf) {
        switch (typeOf) {
            case 0:
                return CACTUS_BIG_1;
            case 1:
                return CACTUS_BIG_2;
            case 2:
                return CACTUS_BIG_3;
            case 3:
                return CACTUS_SMALL_1;
            case 4:
                return CACTUS_SMALL_2;
            case 5:
                return CACTUS_SMALL_3;
            case 6:
                return BIRD_0;
            case 7:
                return BIRD_1;
            case 8:
                return BIRD_2;
            default:
                return INVALID;
        }
    }
    
    public static String toString(TypeOfObs typeOfObs1) {
        switch (typeOfObs1) {
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
            case BIRD_0:
                return "Bird 0";
            case BIRD_1:
                return "Bird 1";
            case BIRD_2:
                return "Bird 2";
            default:
                return "Invalid";
        }
        
    }
}
