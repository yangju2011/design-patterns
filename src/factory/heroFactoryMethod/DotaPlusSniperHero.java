package factory.heroFactoryMethod;

import factory.heroSimpleFactory.Hero;

public class DotaPlusSniperHero extends Hero {
    public DotaPlusSniperHero(){
        name = "[Dota Plus] Sniper";
        attribute = "Agility";
        position = "Mid Lane";
        abilities.add("[Dota Plus] Shrapnel");
        abilities.add("[Dota Plus] Headshot");
        abilities.add("[Dota Plus] Take Aim");
        abilities.add("[Dota Plus] Assassinate");
        extraVoiceLines.add("Target practice, payin' off!");
        extraVoiceLines.add("Ho ho ha ha!");
    }

    public void display() {
        System.out.println("...Displaying \n[Dota Plus] I'm Sniper! My primary attribute is " + attribute);
    }
}