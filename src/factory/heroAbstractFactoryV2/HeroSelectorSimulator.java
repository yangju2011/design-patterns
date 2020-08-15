package factory.heroAbstractFactoryV2;

import factory.heroAbstractFactory.CarryHeroSelector;
import factory.heroAbstractFactory.Hero;
import factory.heroAbstractFactory.HeroSelector;
import factory.heroAbstractFactory.SupportHeroSelector;

public class HeroSelectorSimulator {
    public static void main(String[] args) {
        HeroSelector carryHeroSelector = new CarryHeroSelector();
        HeroSelector supportHeroSelector = new SupportHeroSelector();
        HeroSelector offLaneHeroSelector = new OffLaneHeroSelector();

        Hero hero = carryHeroSelector.selectHero("basic");
        System.out.println("...Selected Hero Build" + hero + "\n");

        hero = offLaneHeroSelector.selectHero("basic");
        System.out.println("...Selected Hero Build" + hero + "\n");

        hero = offLaneHeroSelector.selectHero("boots");
        System.out.println("...Selected Hero Build" + hero + "\n");

        hero = offLaneHeroSelector.selectHero("weapon");
        System.out.println("...Selected Hero Build" + hero + "\n");
    }
}
