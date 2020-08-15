package strategy;

public class SvenCharacter extends Character {
    public SvenCharacter(){
        name = "sven";
        attribute = "Strength";
        moveBehavior = new MoveNormal();
        attackBehavior = new MeleeAttack();
        abilities.add("Storm Hammer");
        abilities.add("Great Cleave");
        abilities.add("Warcry");
        abilities.add("God's Strength");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Sven! My primary attribute is " + attribute);
    }

    public void disable() {
        System.out.println("I can disable!");
    }
}
