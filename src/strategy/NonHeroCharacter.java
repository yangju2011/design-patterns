package strategy;

public class NonHeroCharacter extends Character {
    public NonHeroCharacter(){
        name = "not a hero";
        moveBehavior = new NotMove();
        attackBehavior = new NotAttack();
    }
    
    public void display() {
        System.out.println("I'm not a hero!");
    }
}
