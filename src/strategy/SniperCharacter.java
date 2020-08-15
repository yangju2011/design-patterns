package strategy;

public class SniperCharacter extends Character{
    public SniperCharacter(){
        name = "sniper";
        attribute = "Agility";
        moveBehavior = new MoveNormal();
        attackBehavior = new RangedAttack();
        abilities.add("Shrapnel");
        abilities.add("Headshot");
        abilities.add("Take Aim");
        abilities.add("Assassinate");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Sniper! My primary attribute is " + attribute);
    }
}