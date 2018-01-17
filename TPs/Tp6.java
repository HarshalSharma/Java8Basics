/**
    Another Feature in java 8 is we can have a interface with a implementation of a method which have the default keyword.
    Just like we have a InterfaceA with a implemented method. 
    if we somehow gets two interfaces with same signature method we will get a compiler error, or we can override that interface. 

    But a functional interface does not have a Default method.
 */

public class Tp6 implements InterfaceA{

    public static void main(String args[]){

        Tp6 tp = new Tp6();
        tp.doSomething();

    }


}