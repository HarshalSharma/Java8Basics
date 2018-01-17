
/*
    'this' within the anonymous functional class refers to the object on which functional method is called.
    This is a useful way we can access the variables and methods of the object.

    Lambda vs Anonymous Inner Class:
    - Inner classes can have state in the form of class level instance variables lambdas can not.
    - Inner classes can have multiple methods but lambdas only have one single method body.
    - 'this' points to the object instance for an anonymous inner class but points to the enclosing object for a lambda.
    - lambda != Anonymous innner class

    See this in the example.
    Here we will convert a list of numbers to the apples of there respective prices.
*/
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Tp3{

    private static final Tp3 instance = new Tp3();
    private List<Integer> prices = Arrays.asList(1,2,3,4,5,6);
    private int rate = 2;

    public static void main(String args[]){
        instance.doWork();
        instance.doOtherWork();
    }


    public void doWork(){

        prices.forEach(new Consumer<Integer>(){

            int customValue = 1;

            @Override
            public void accept(Integer x){                
                int value = x * Tp3.this.rate + this.customValue;
                System.out.println("x is " + x);
                System.out.println("Anonymous value:" + value);
            }
        });

    }

    public void doOtherWork(){
        prices.forEach(x->{
            if(this == instance){
                System.out.println("Within the lambda body this refers to the this of the enclosing object.");
            }
        });
    }

}