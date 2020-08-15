package factory.heroSimpleFactory;

public class TidehunterHero extends Hero {
    public TidehunterHero(){
        name = "Tidehunter";
        attribute = "Strength";
        position = "Offline";
        abilities.add("Gush");
        abilities.add("Kraken Shell");
        abilities.add("Anchor Smash");
        abilities.add("Ravage");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Tidehunter!");
    }
}
