package factory.heroSimpleFactory;

public class SvenHero extends Hero {
    public SvenHero(){
        name = "Sven";
        attribute = "Strength";
        position = "Safe Lane";
        abilities.add("Storm Hammer");
        abilities.add("Great Cleave");
        abilities.add("Warcry");
        abilities.add("God's Strength");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Sven!");
    }
}
