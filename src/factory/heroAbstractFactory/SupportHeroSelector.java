package factory.heroAbstractFactory;

public class SupportHeroSelector extends HeroSelector {
    public Hero createHero(String buildName){
        Hero hero = null;
        HeroBuildFactory factory = new SupportHeroBuildFactory();
        if (buildName == "basic"){
            hero = new BasicHero(factory);
            hero.setName("Basic Support Build");
        }
        else if (buildName == "boots"){
            hero = new BootsHero(factory);
            hero.setName("Support Build with Boots");
        }
        else if (buildName == "weapon") {
            hero = new WeaponHero(factory);
            hero.setName("Support Build with Weapon");
        }
        return hero;
    }
}
