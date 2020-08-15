package strategy;

public class SellerCharacter extends Character {
    public SellerCharacter(){
        name = "seller";
        moveBehavior = new NotMove();
        attackBehavior = new NotAttack();
    }
    
    public void display() {
        System.out.println("...Displaying \nI'm Seller!");
    }
}
