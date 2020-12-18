package singleton.budget;

public class BudgetPool {
    private int budget;

    private static BudgetPool uniqueInstance;

    private BudgetPool() {
        System.out.println("Creating a new BudgetPool object");
        budget = 0;
    }

    public static BudgetPool getInstance(String thread){
        System.out.println(thread);
        if (uniqueInstance == null){
            uniqueInstance = new BudgetPool();
        }
        return uniqueInstance;
    }

    public void refillBudget(String thread){
        System.out.println(thread);
        if (!hasBudget()){
            System.out.println("Refill budget to 10");
            budget = 10; // set full budget as 10
            System.out.println("Current budget: " + budget);
        }
        else {
            System.out.println("Still have budget left, not refill");
            System.out.println("Current budget: " + budget);
        }
    }

    public void useBudget(String thread){
        System.out.println(thread);
        if (hasBudget()){
            System.out.println("Use budget of 1");
            budget -= 1; //decrement current budget
            System.out.println("Current budget: " + budget);
        }
        else {
            System.out.println("No budget left, cannot use");
            System.out.println("Current budget: " + budget);
        }
    }

    public void resetBudget(String thread){
        System.out.println(thread);
        if (hasBudget()){
            System.out.println("Reset budget");
            budget = 0; //decrement current budget
            System.out.println("Current budget: " + budget);
        }
        else {
            System.out.println("No budget left, cannot reset");
            System.out.println("Current budget: " + budget);
        }
    }

    public boolean hasBudget(){
        return budget > 0;
    }

    public int getBudget(){
        return budget;
    }
}
