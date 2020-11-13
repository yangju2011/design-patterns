package command.jobQueue;

import command.diner.Command;

public class FriesOrder implements Command {

    FriesCook friesCook;

    public FriesOrder(FriesCook friesCook){
        this.friesCook = friesCook;
    }

    @Override
    public void execute() {
        friesCook.cook();
    }
}
