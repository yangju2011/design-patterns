package factory.heroFactoryMethod;


import factory.heroSimpleFactory.Hero;

public abstract class HeroSelector {
    public abstract Hero createHero(String heroName);

    public Hero selectHero(String heroName){
        Hero hero;
        hero = createHero(heroName);
        hero.load();
        hero.render();
        hero.display();
        return hero;
    }
}
