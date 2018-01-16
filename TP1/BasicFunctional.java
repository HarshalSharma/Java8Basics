public class BasicFunctional{

    public static void main(String args[]){

        BasicFunctionalInterface bfi = () -> {
            return "Hello World!!";
        };

        String message = bfi.basicFPMethod();
        System.out.println(message);

    }
}