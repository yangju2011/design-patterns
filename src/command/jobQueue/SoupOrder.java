package command.jobQueue;

import command.diner.Command;

public class SoupOrder implements Command {

    SoupCook soupCook;

    public SoupOrder(SoupCook soupCook){
        this.soupCook = soupCook;
    }

    @Override
    public void execute() {
        soupCook.cook();
    }
}
