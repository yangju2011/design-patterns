package factory.heroAbstractFactoryV2;

import factory.heroAbstractFactory.BasicHero;
import factory.heroAbstractFactory.BootsHero;
import factory.heroAbstractFactory.Hero;
import factory.heroAbstractFactory.HeroBuildFactory;
import factory.heroAbstractFactory.HeroSelector;
import factory.heroAbstractFactory.WeaponHero;

public class OffLaneHeroSelector extends HeroSelector {
    public Hero createHero(String buildName){
        Hero hero = null;
        HeroBuildFactory factory = new OffLaneHeroBuildFactory();
        if (buildName == "basic"){
            hero = new BasicHero(factory);
            hero.setName("Basic Off Lane Build");
        }
        else if (buildName == "boots"){
            hero = new BootsHero(factory);
            hero.setName("Off Lane Build with Boots");
        }
        else if (buildName == "weapon") {
            hero = new WeaponHero(factory);
            hero.setName("Off Lane Build with Weapon");
        }
        return hero;
    }
}
