package Design_Pattern.PrototypeRegistery.sol2;

public class MAIN {
    public static void main(String[] args) {
        student s1= null;
        student duplicate;
        if(s1 instanceof intelligentStudent){
            duplicate = new intelligentStudent((intelligentStudent) s1);
            // type casting not good solution
        }else if (s1 instanceof student){
            duplicate = new student(s1);
        }
    }
}
