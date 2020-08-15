package factory.heroFactoryMethod;
import factory.heroSimpleFactory.CrystalMaidenHero;
import factory.heroSimpleFactory.Hero;
import factory.heroSimpleFactory.MiranaHero;
import factory.heroSimpleFactory.NonHero;
import factory.heroSimpleFactory.SniperHero;
import factory.heroSimpleFactory.SvenHero;
import factory.heroSimpleFactory.TidehunterHero;

public class RegularHeroSelector extends HeroSelector {
    public Hero createHero(String heroName){
        Hero hero;
        if (heroName == "sven"){
            hero = new SvenHero();
        }
        else if (heroName == "sniper"){
            hero = new SniperHero();
        }
        else if (heroName == "crystal maiden") {
            hero = new CrystalMaidenHero();
        }
        else {
            hero = new NonHero();
        }
        return hero;
    }
}
