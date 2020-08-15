package factory.heroFactoryMethodV2;


import factory.heroSimpleFactory.Hero;

public class BattlePassCrystalMaidenHero extends Hero {
    public BattlePassCrystalMaidenHero(){
        name = "[Battle Pass] Crystal Maiden";
        attribute = "Intelligence";
        position = "Hard Support";
        abilities.add("[Battle Pass] Crystal Nova");
        abilities.add("[Battle Pass] Frostbite");
        abilities.add("[Battle Pass] Arcane Aura");
        abilities.add("[Battle Pass] Freezing Field");
        extraVoiceLines.add("I've got goosebumps!");
        extraVoiceLines.add("Is it cold in here or is it just me?");
    }

    public void display() {
        System.out.println("...Displaying \n[Battle Pass] I'm Crystal Maiden! My primary attribute is " + attribute);
    }
}
