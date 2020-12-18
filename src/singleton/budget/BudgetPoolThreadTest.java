package singleton.budget;

public class BudgetPoolThreadTest {
    public static void main(String[] args) {
        // multithreading
        Runnable r = new BudgetPoolRunnable();
        Thread t = new Thread(r);
        Runnable r2 = new BudgetPoolRunnable();
        Thread t2 = new Thread(r2);

        t.start();
        t2.start();
    }
}
