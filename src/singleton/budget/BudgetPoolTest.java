package singleton.budget;

public class BudgetPoolTest {
    public static void main(String[] args) {
        String thread = "";
        BudgetPool budgetPool = BudgetPool.getInstance(thread);
        System.out.println("...");
        budgetPool.useBudget(thread);
        System.out.println("...");
        budgetPool.resetBudget(thread);
        System.out.println("...");
        budgetPool.refillBudget(thread);
        System.out.println("...");
        budgetPool.useBudget(thread);
        System.out.println("...");
        budgetPool.refillBudget(thread);
        System.out.println("...");
        budgetPool.resetBudget(thread);
    }
}
