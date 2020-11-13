package command.jobQueue;

import command.diner.Command;

public class BurgerOrder implements Command {

    BurgerCook burgerCookReceiver;

    public BurgerOrder(BurgerCook burgerCookReceiver){
        this.burgerCookReceiver = burgerCookReceiver;
    }

    @Override
    public void execute() {
        burgerCookReceiver.cook();
    }
}
