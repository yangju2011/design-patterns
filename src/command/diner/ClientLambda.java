package command.diner;

public class ClientLambda {
    public static void main(String[] args){
        // 1. Client creates a Receiver, not a command object
        BurgerCookReceiver burgerCookReceiver = new BurgerCookReceiver();

        // 2. Client calls setCommand in Waiter and passes a lambda expression instead of a Command object
        WaiterInvoker waiterInvoker = new WaiterInvoker();
        // lambda expression
        waiterInvoker.setCommand(() -> burgerCookReceiver.cook());

        // 3. Some time later, Client asks Waiter to execute() in the Command object, which calls the Receiver action() to cook the burger.
        waiterInvoker.orderWasPlaced();
    }
}
