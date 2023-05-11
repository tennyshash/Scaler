package Design_Pattern.PrototypeRegistery.sol1;

import Design_Pattern.Builder.Student;

public class MAIN {
    public static void main(String[] args) {
        student s1= new intelligentStudent();
        student duplicate;
        if(s1 instanceof  intelligentStudent){
            duplicate= new intelligentStudent();
            //duplicate.iq;
            //unable to access iq eecause iq is of intelligent and duplicate is of student
        } else if (s1 instanceof student) {
            duplicate= new student();
            // unable to access private att.
        }
    }
}
