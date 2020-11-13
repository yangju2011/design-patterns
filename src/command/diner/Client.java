package command.diner;

public class Client {
    public static void main(String[] args){
        // 1. Client creates a Command object to order a burger
        BurgerCookReceiver burgerCookReceiver = new BurgerCookReceiver();
        BurgerOrderCommand burgerOrder = new BurgerOrderCommand(burgerCookReceiver);

        // 2. Client calls setCommand in Waiter which stores the Command object (order a burger)
        WaiterInvoker waiterInvoker = new WaiterInvoker();
        waiterInvoker.setCommand(burgerOrder);

        // 3. Some time later, Client asks Waiter to execute() in the Command object, which calls the Receiver action() to cook the burger.
        waiterInvoker.orderWasPlaced();
    }
}
