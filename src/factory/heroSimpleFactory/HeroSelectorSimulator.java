package factory.heroSimpleFactory;

public class HeroSelectorSimulator {
    public static void main(String[] args) {
        System.out.println("=========== Without factory ===========" + "\n");
        HeroSelector heroSelector = new HeroSelector();

        Hero hero = heroSelector.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = heroSelector.selectHero("mirana");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = heroSelector.selectHero("dazzle");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        System.out.println("=========== With simple factory ===========" + "\n");
        SimpleHeroFactory factory = new SimpleHeroFactory();
        HeroSelectorWithSimpleFactory heroSelectorWithFactory = new HeroSelectorWithSimpleFactory(factory);

        hero = heroSelectorWithFactory.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = heroSelectorWithFactory.selectHero("mirana");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = heroSelectorWithFactory.selectHero("dazzle");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        System.out.println("=========== With static simple factory ===========" + "\n");
        HeroSelectorWithSimpleFactoryStatic heroSelectorWithFactoryStatic = new HeroSelectorWithSimpleFactoryStatic();

        hero = heroSelectorWithFactoryStatic.selectHero("crystal maiden");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = heroSelectorWithFactoryStatic.selectHero("mirana");
        System.out.println("-- Selected hero " + hero.getName() + "\n");

        hero = heroSelectorWithFactoryStatic.selectHero("dazzle");
        System.out.println("-- Selected hero " + hero.getName() + "\n");


    }
}
