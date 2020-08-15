package factory.heroSimpleFactory;

public class SimpleHeroFactory {
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
        else if (heroName == "mirana") {
            hero = new MiranaHero();
        }
        else if (heroName == "tidehunter") {
            hero = new TidehunterHero();
        }
        else {
            hero = new NonHero();
        }
        return hero;
    }
}
