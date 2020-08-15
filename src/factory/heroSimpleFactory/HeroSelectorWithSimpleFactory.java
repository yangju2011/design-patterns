package factory.heroSimpleFactory;

public class HeroSelectorWithSimpleFactory {
    SimpleHeroFactory factory;

    public HeroSelectorWithSimpleFactory(SimpleHeroFactory factory){
        this.factory = factory;
    }
    public Hero selectHero(String heroName){
        Hero hero;
        hero = factory.createHero(heroName);
        hero.load();
        hero.render();
        hero.display();
        return hero;
    }
}
