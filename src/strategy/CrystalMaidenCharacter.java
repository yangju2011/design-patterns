package strategy;

public class CrystalMaidenCharacter extends Character {
    public CrystalMaidenCharacter(){
        name = "crystal maiden";
        attribute = "Intelligence";
        moveBehavior = new MoveNormal();
        attackBehavior = new RangedAttack();
        abilities.add("Crystal Nova");
        abilities.add("Frostbite");
        abilities.add("Arcane Aura");
        abilities.add("Freezing Field");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Crystal Maiden! My primary attribute is " + attribute);
    }

    public void disable() {
        System.out.println("I can disable!");
    }
}
