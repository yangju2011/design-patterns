package factory.heroAbstractFactory;

public class HeroSelectorSimulator {
    public static void main(String[] args) {
        HeroSelector carryHeroSelector = new CarryHeroSelector();
        HeroSelector supportHeroSelector = new SupportHeroSelector();

        Hero hero = carryHeroSelector.selectHero("basic");
        System.out.println("...Selected Hero Build" + hero + "\n");

        hero = supportHeroSelector.selectHero("boots");
        System.out.println("...Selected Hero Build" + hero + "\n");

        hero = carryHeroSelector.selectHero("weapon");
        System.out.println("...Selected Hero Build" + hero + "\n");

        hero = supportHeroSelector.selectHero("weapon");
        System.out.println("...Selected Hero Build" + hero + "\n");

        hero = carryHeroSelector.selectHero("magic");
        System.out.println("...Selected Hero Build" + hero + "\n");
    }
}
