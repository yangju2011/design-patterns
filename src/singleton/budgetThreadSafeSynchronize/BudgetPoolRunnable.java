package singleton.budgetThreadSafeSynchronize;

public class BudgetPoolRunnable implements Runnable  {
    public void run(){
        String thread = Thread.currentThread().getName();
        System.out.println("Current thread : " + thread);
        BudgetPool budgetPool = BudgetPool.getInstance(thread);
        System.out.println("...");
        budgetPool.refillBudget(thread);
        System.out.println("...");
        budgetPool.useBudget(thread);
    }
}
