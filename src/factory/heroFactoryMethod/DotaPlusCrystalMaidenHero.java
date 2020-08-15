package factory.heroFactoryMethod;


import factory.heroSimpleFactory.Hero;

public class DotaPlusCrystalMaidenHero extends Hero {
    public DotaPlusCrystalMaidenHero(){
        name = "[Dota Plus] Crystal Maiden";
        attribute = "Intelligence";
        position = "Hard Support";
        abilities.add("[Dota Plus] Crystal Nova");
        abilities.add("[Dota Plus] Frostbite");
        abilities.add("[Dota Plus] Arcane Aura");
        abilities.add("[Dota Plus] Freezing Field");
        extraVoiceLines.add("I've got goosebumps!");
        extraVoiceLines.add("Is it cold in here or is it just me?");
    }

    public void display() {
        System.out.println("...Displaying \n[Dota Plus] I'm Crystal Maiden! My primary attribute is " + attribute);
    }
}
