
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

public class Tp3{

    private static final Tp3 instance = new Tp3();
    private List<Integer> prices = Arrays.asList(1,2,3,4,5,6);
    private int rate = 1;

    public static void main(String args[]){
        instance.doWork();
    }


    public static void doWork(){

        List<Apple> apples = new ArrayList<Apple>();

        prices.forEach(x -> new Apple(){
            int value = x * this.rate;
            System.out.println("Anonymous value:" + value);
        });

    }



    private class Apple{

        public int price;

        @Override
        public String toString(){
            return "[price:"+price+"]";
        }

    }






}