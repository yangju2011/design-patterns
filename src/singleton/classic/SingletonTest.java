package singleton.classic;

public class SingletonTest {
    public static void main(String[] args) {
        // cannot call new Singleton()
        // public Singleton mySingleton = new Singleton();

        System.out.println("..Call getInstance");
        Singleton mySingleton1 = Singleton.getInstance();
        System.out.println("..Call getInstance");
        Singleton mySingleton2 = Singleton.getInstance();

        System.out.println("\n..Check if Singleton is unique");
        if (mySingleton1.equals(mySingleton2)) {
            System.out.println("Singleton objects are the same");
        }
        else {
            System.out.println("Singleton objects are the different");
        }
    }
}
