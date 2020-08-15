package strategy;

public class CourierCharacter extends Character {
    // courier cannot attack but can move
    public CourierCharacter(){
        name = "courier";
        moveBehavior = new MoveNormal();
        attackBehavior = new NotAttack();
    }
    public void display() {
        System.out.println("...Displaying \nI'm Courier!");
    }
}
