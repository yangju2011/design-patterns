package command.jobQueue;

public class ClientParallel {
    public static void main(String[] args){
        // 1. different types of receivers (cook)
        BurgerCook burgerCook1 = new BurgerCook("medium");
        BurgerCook burgerCook2 = new BurgerCook("rare");
        BurgerCook burgerCook3 = new BurgerCook("medium rare");

        SoupCook soupCook1 = new SoupCook("chicken");
        SoupCook soupCook2 = new SoupCook("beef");

        FriesCook friesCook1 = new FriesCook("large");
        FriesCook friesCook2 = new FriesCook("small");

        // 2. invoker stores commands
        Invoker invoker = new Invoker();

        // customer1 orders 3 things
        invoker.addCommand(burgerCook1::cook);
        invoker.addCommand(soupCook1::cook);
        invoker.addCommand(friesCook1::cook);

        // customer2 orders 3 things
        invoker.addCommand(burgerCook2::cook);
        invoker.addCommand(soupCook2::cook);
        invoker.addCommand(friesCook2::cook);

        // customer 3 orders 1 thing
        invoker.addCommand(burgerCook3::cook);

        // 3. Some time later, Client asks Invoker to execute() in the Command objects, which calls the Receiver action() to cook
        invoker.executeCommandsParallel();
    }
}
