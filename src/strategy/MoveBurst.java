package strategy;

public class MoveBurst implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I move at a speed burst!");
    }
}
