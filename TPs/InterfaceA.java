public interface InterfaceA{

    default void doSomething(){
        System.out.println("WTF! i have a implementation in interface!");
    }
}