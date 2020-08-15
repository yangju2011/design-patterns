package factory.heroSimpleFactory;

public class MiranaHero extends Hero {
    public MiranaHero(){
        name = "Mirana";
        attribute = "Agility";
        position = "Soft Support";
        abilities.add("Starstorm");
        abilities.add("Sacred Arrow");
        abilities.add("Leap");
        abilities.add("Moonlight Shadow");
    }

    public void display() {
        System.out.println("...Displaying \nI'm Mirana!");
    }
}
