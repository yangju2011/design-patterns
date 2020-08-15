package factory.heroFactoryMethodV2;

import factory.heroSimpleFactory.Hero;

public class BattlePassSvenHero extends Hero {
    public BattlePassSvenHero(){
        name = "[Battle Pass] Sven";
        attribute = "Strength";
        position = "Safe Lane";
        abilities.add("[Battle Pass] Storm Hammer");
        abilities.add("[Battle Pass] Great Cleave");
        abilities.add("[Battle Pass] Warcry");
        abilities.add("[Battle Pass] God's Strength");
        extraVoiceLines.add("You look stunned.");
        extraVoiceLines.add("Hm…now what did we learn from this.");
    }

    public void display() {
        System.out.println("...Displaying \n[Battle Pass] I'm Sven!");
    }
}
