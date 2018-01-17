import java.util.function.*;

public class Tp5{

    public static void doSomething(Integer i){
        System.out.println("Accepted value is :" + i);
    }

    public static void main(String args[]){
        Consumer<Integer> consumer = Tp5::doSomething;
        consumer.accept(1);
        consumer.accept(2);


        // Function<String,Integer> fx = x -> new Integer(x);
        //or
        Function<String,Integer> fx = Integer::new;
        System.out.println(fx.apply("50"));


        Consumer<String> c1 = System.out::println;
        c1.accept("Type me anything!!");

        Function<String,String> fx2 = String::toUpperCase;
        System.out.println(fx2.apply("i will be uppercased!!"));

    }
}