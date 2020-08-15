package factory.heroFactoryMethodV2;

import factory.heroSimpleFactory.Hero;

public class BattlePassSniperHero extends Hero {
    public BattlePassSniperHero(){
        name = "[Battle Pass] Sniper";
        attribute = "Agility";
        position = "Mid Lane";
        abilities.add("[Battle Pass] Shrapnel");
        abilities.add("[Battle Pass] Headshot");
        abilities.add("[Battle Pass] Take Aim");
        abilities.add("[Battle Pass] Assassinate");
        extraVoiceLines.add("Target practice, payin' off!");
        extraVoiceLines.add("Ho ho ha ha!");
    }

    public void display() {
        System.out.println("...Displaying \n[Battle Pass] I'm Sniper! My primary attribute is " + attribute);
    }
}