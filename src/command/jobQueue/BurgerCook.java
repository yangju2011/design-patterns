package command.jobQueue;

public class BurgerCook {

    String doneness;

    public BurgerCook(String doneness){this.doneness=doneness;}

    public void cook() {
        System.out.println("...\nBurger is being cooked at " + doneness);
    }
}
