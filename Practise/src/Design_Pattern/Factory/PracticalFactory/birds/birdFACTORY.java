package Design_Pattern.Factory.PracticalFactory.birds;

public class birdFACTORY {
    public static bird crateBirdOfType(birdType brd){
        return switch (brd){
            case HEN -> new hen();
            case CROW -> new crow();
            case SPARROW -> new sparrow();
            case PEACOCK -> new peacock();
            default -> new bird();
        };
    }
    public static bird createObjectFromStringType(String bird){
        if(bird.equalsIgnoreCase("hen")){//.equalsIgnore case take both upper case and lower
            return new hen();
        }else if(bird.equalsIgnoreCase("peacock")){
            return new peacock();
        }else if (bird.equalsIgnoreCase("crow")){
            return new crow();
        }
        return null;
    }
    public static  bird createBirdOfSeason(seasons typeSeason){
        return null;
    }
}
