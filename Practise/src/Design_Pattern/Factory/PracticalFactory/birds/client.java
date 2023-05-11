package Design_Pattern.Factory.PracticalFactory.birds;

import java.util.ArrayList;
import java.util.List;

public class client {
    public void haveRaceOfBirds(List<birdType> typeOFbirds){ // another way of taking input from list ....
        List<bird> birds= new ArrayList<>();
        for( birdType type: typeOFbirds){
            birds.add(birdFACTORY.crateBirdOfType(type));
        }
    }
    public static void main(String[] args) {
        birdType BIRDtype = null;//you  can give any type of bi
        bird brdOBJ;
//        if(BIRDtype.equals(birdType.HEN)){
//            brd= new hen();
//        }else if(BIRDtype.equals(birdType.CROW)){
//            brd= new crow();
//        } violate OCP, SRP
        brdOBJ=birdFACTORY.crateBirdOfType(BIRDtype);
    }
}
