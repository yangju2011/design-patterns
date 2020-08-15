package factory.heroFactoryMethodV2;


import factory.heroFactoryMethod.DotaPlusHeroSelector;
import factory.heroFactoryMethod.RegularHeroSelector;
import factory.heroSimpleFactory.Hero;

public class HeroSelectorSimulator {
    public static void main(String[] args) {
        RegularHeroSelector regularHeroSelector = new RegularHeroSelector();
        DotaPlusHeroSelector dotaPlusHeroSelector = new DotaPlusHeroSelector();
        BattlePassHeroSelector battlePassHeroHeroSelector = new BattlePassHeroSelector();

        Hero hero = regularHeroSelector.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = dotaPlusHeroSelector.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = battlePassHeroHeroSelector.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

    }
}
