package factory.heroAbstractFactory;


public abstract class HeroSelector {
    public abstract Hero createHero(String buildName);

    public Hero selectHero(String buildName){
        Hero hero;
        hero = createHero(buildName);
        hero.load();
        hero.render();
        hero.display();
        return hero;
    }
}
