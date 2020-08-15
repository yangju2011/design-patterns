package strategy;

public class MoveNormal implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("I move!");
    }
}
