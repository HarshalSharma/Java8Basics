
/*
IDEA:
You can return lamda expression from the method with multiple values as done here in buildEncoder method. 
The multiple value lamda expression in java is acutally not a data type of its own like in python we have tuple.
In java it is a FunctionalInterface. A Functional interface only have a single method which is referred by this way of using lambdas.
*/
public class Tp2{

    public static void main(String[] args){
        PasswordEncoder encoder = buildEncoder();
        String password = getEncodedPassword("harshal","123",encoder);
        System.out.println("Encoded password:" + password);
    }



    private static String getEncodedPassword(String password, String salt, PasswordEncoder encoder){
        return encoder.encode(password,salt);
    }

    private static PasswordEncoder buildEncoder(){
        return (String password,String salt)->{
            //Do here something complex to make this password string un-guessable.
            return (password + salt).toUpperCase();
        };
    }


    @FunctionalInterface
    private interface PasswordEncoder{

        public String encode(String password,String salt);
    
    }
}