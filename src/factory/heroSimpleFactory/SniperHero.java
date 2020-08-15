package factory.heroSimpleFactory;

public class SniperHero extends Hero {
    public SniperHero(){
        name = "Sniper";
        attribute = "Agility";
        position = "Mid Lane";
        abilities.add("Shrapnel");
        abilities.add("Headshot");
        abilities.add("Take Aim");
        abilities.add("Assassinate");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Sniper!");
    }
}