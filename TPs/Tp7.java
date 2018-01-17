
/**
    Streams are a concept of a functional programming design pattern for processing sequences of elements sequentially or in parallel.

    Stream LifeCycle:
    - Creation : Streams get creted from a source object such as a collection, file or generator.
    - Configuration : Streams get configured with a collection of pipleline operations.
    - Execution : Streams terminal operation is invoked which starts pulling objects through the operations pipeline of the stream.
    - Cleanup : Streams can only be used once.



 */
import java.util.*;
import java.util.stream.Stream;

public class Tp7{


    public static void main(String args[]){

        List<Integer> list =  Arrays.asList(1,2,3,4,5);
        list.stream().forEach(System.out::println);
    

        String line = "1 2 3 4 5 6 7";

        int[] arr = Arrays.asList(line.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        // or
        arr = Stream.of(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Total values: " + arr.length);

    }



}