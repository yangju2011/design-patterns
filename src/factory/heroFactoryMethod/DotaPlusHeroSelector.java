package factory.heroFactoryMethod;

import factory.heroSimpleFactory.Hero;
import factory.heroSimpleFactory.NonHero;

public class DotaPlusHeroSelector extends HeroSelector {
    public Hero createHero(String heroName){
        Hero hero;
        if (heroName == "sven"){
            hero = new DotaPlusSvenHero();
        }
        else if (heroName == "sniper"){
            hero = new DotaPlusSniperHero();
        }
        else if (heroName == "crystal maiden") {
            hero = new DotaPlusCrystalMaidenHero();
        }
        else {
            hero = new NonHero();
        }
        return hero;
    }
}
