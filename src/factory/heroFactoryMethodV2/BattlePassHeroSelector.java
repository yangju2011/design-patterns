package factory.heroFactoryMethodV2;

import factory.heroFactoryMethod.HeroSelector;
import factory.heroSimpleFactory.Hero;
import factory.heroSimpleFactory.NonHero;

public class BattlePassHeroSelector extends HeroSelector {
    public Hero createHero(String heroName){
        Hero hero;
        if (heroName == "sven"){
            hero = new BattlePassSvenHero();
        }
        else if (heroName == "sniper"){
            hero = new BattlePassSniperHero();
        }
        else if (heroName == "crystal maiden") {
            hero = new BattlePassCrystalMaidenHero();
        }
        else {
            hero = new NonHero();
        }
        return hero;
    }
}
