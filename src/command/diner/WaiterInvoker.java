package command.diner;

public class WaiterInvoker {
    Command order;

    public WaiterInvoker(){}

    public void setCommand(Command command) {
        this.order = command;
    }

    public void orderWasPlaced(){
        order.execute();
    }
}
