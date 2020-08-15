package factory.heroSimpleFactory;

public class CrystalMaidenHero extends Hero {
    public CrystalMaidenHero(){
        name = "Crystal Maiden";
        attribute = "Intelligence";
        position = "Hard Support";
        abilities.add("Crystal Nova");
        abilities.add("Frostbite");
        abilities.add("Arcane Aura");
        abilities.add("Freezing Field");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Crystal Maiden!");
    }
}
