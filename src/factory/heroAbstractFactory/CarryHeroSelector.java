package factory.heroAbstractFactory;

public class CarryHeroSelector extends HeroSelector {
    public Hero createHero(String buildName){
        Hero hero = null;
        HeroBuildFactory factory = new CarryHeroBuildFactory();
        if (buildName == "basic"){
            hero = new BasicHero(factory);
            hero.setName("Basic Carry Build");
        }
        else if (buildName == "boots"){
            hero = new BootsHero(factory);
            hero.setName("Carry Build with Boots");
        }
        else if (buildName == "weapon") {
            hero = new WeaponHero(factory);
            hero.setName("Carry Build with Weapon");
        }
        return hero;
    }
}
