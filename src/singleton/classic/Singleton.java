package singleton.classic;

public class Singleton {
    private static Singleton uniqueInstance;

    // private constructor
    private Singleton(){
        System.out.println("Creating a new Singleton object");
    }

    // static class method, do not need to instantiate the class to use the method
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
