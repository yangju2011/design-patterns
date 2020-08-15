package factory.heroFactoryMethod;

import factory.heroSimpleFactory.Hero;
public class DotaPlusSvenHero extends Hero {
    public DotaPlusSvenHero(){
        name = "[Dota Plus] Sven";
        attribute = "Strength";
        position = "Safe Lane";
        abilities.add("[Dota Plus] Storm Hammer");
        abilities.add("[Dota Plus] Great Cleave");
        abilities.add("[Dota Plus] Warcry");
        abilities.add("[Dota Plus] God's Strength");
        extraVoiceLines.add("You look stunned.");
        extraVoiceLines.add("Hm…now what did we learn from this.");
    }

    public void display() {
        System.out.println("...Displaying \n[Dota Plus] I'm Sven!");
    }
}
