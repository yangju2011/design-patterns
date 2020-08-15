package factory.heroFactoryMethod;


import factory.heroSimpleFactory.Hero;

public class HeroSelectorSimulator {
    public static void main(String[] args) {
        RegularHeroSelector regularHeroSelector = new RegularHeroSelector();
        DotaPlusHeroSelector dotaPlusHeroSelector = new DotaPlusHeroSelector();

        Hero hero = regularHeroSelector.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = dotaPlusHeroSelector.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = regularHeroSelector.selectHero("sniper");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = dotaPlusHeroSelector.selectHero("dazzle");
        System.out.println("-- Selected hero " + hero.getName() + "\n");
    }
}
