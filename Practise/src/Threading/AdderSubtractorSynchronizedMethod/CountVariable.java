package Threading.AdderSubtractorSynchronizedMethod;

public class CountVariable {
    int value;

    //to use synchronized method we want to method so that we can do operation int it off adder and sub but we can we place this method so can both
    //adder and subtrac classes can access them, so we places here..
    synchronized void add( int value){
        //here synchronnized method takes lock on adder obj..
        this.value+=value;
    }
    //single method also works or 2 methods also work as..
    synchronized void subtract( int value) {
        //synchronized (this){ here this is of subtractor
        this.value += value;
        //}  equivalent to  synchronised object way..!
    }
}
