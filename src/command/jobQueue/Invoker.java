package command.jobQueue;

import command.diner.Command;

import java.util.LinkedList;

public class Invoker {

    // list of commands
    LinkedList<Command> jobQueue;

    public Invoker(){
        jobQueue = new LinkedList();
    }

    public void addCommand(Command command) {
        jobQueue.add(command);
    }

    public void executeCommandsSequential() {
        System.out.println("Commands executed in sequence");
        while (!jobQueue.isEmpty()) {
            Command todo = jobQueue.pop();
            executeCommand(todo);
        }
    }

    public void executeCommandsParallel() {
        System.out.println("Commands executed in parallel");
        jobQueue.parallelStream().forEach(todo -> {
            System.out.println("Command runs in thread " + Thread.currentThread());
            try {
                Thread.sleep(5000);
                executeCommand(todo); }
            catch (InterruptedException e) {}
        });
    }

    public void executeCommand(Command command){
        command.execute();
    }
}
