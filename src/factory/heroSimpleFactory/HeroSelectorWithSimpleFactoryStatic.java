package factory.heroSimpleFactory;

public class HeroSelectorWithSimpleFactoryStatic {
    public HeroSelectorWithSimpleFactoryStatic(){
    }
    public Hero selectHero(String heroName){
        Hero hero;
        hero = SimpleHeroFactoryStatic.createHero(heroName);
        hero.load();
        hero.render();
        hero.display();
        return hero;
    }
}
