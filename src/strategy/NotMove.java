package strategy;

public class NotMove implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("I do not move!");
    }
}
