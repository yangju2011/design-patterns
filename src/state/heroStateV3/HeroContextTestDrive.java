package state.heroStateV3;

public class HeroContextTestDrive {
    public static void main(String[] args) {
        //alive
        HeroContext heroContext = new HeroContext(10);
        System.out.println(heroContext);

        heroContext.attacked(5);
        System.out.println(heroContext);

        heroContext.attack();
        System.out.println(heroContext);

        //alive
        heroContext.appear();
        heroContext.recovered();
        heroContext.revived(10);

        //alive->invisible
        heroContext.disappear();
        System.out.println(heroContext);

        //invisible
        heroContext.disappear();
        heroContext.attacked(10);
        heroContext.silenced();
        heroContext.recovered();
        heroContext.revived(10);

        heroContext.attack();
        System.out.println(heroContext);
        heroContext.appear();
        System.out.println(heroContext);

        //alive->dead
        heroContext.attacked(10);
        System.out.println(heroContext);

        //dead
        heroContext.appear();
        heroContext.disappear();
        heroContext.attack();
        heroContext.attacked(5);
        heroContext.recovered();
        heroContext.silenced();

        //dead->alive
        heroContext.revived(10);
        System.out.println(heroContext);

        //alive->silenced
        heroContext.silenced();
        System.out.println(heroContext);

        //silenced
        heroContext.appear();
        heroContext.attack();
        heroContext.silenced();
        heroContext.revived(10);

        //silenced
        heroContext.disappear();
        System.out.println(heroContext);

        heroContext.appear();
        heroContext.attacked(5);
        System.out.println(heroContext);

        //silenced->alive
        heroContext.recovered();
        System.out.println(heroContext);

        //alive->silenced->dead
        heroContext.silenced();
        heroContext.attacked(10);
        System.out.println(heroContext);

        //silenced->alive
        heroContext.revived(10);
        System.out.println(heroContext);
    }
}
