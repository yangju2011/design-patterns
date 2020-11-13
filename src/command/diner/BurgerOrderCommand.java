package command.diner;

public class BurgerOrderCommand implements Command {

    BurgerCookReceiver burgerCookReceiver;

    public BurgerOrderCommand(BurgerCookReceiver burgerCookReceiver){
        this.burgerCookReceiver = burgerCookReceiver;
    }

    @Override
    public void execute() {
        burgerCookReceiver.cook();
    }
}
