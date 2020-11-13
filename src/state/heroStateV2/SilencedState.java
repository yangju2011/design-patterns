package state.heroStateV2;

public class SilencedState implements State {
    HeroContext heroContext;

    public SilencedState(HeroContext heroContext) {
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("\n...Hero is silenced and cannot attack others.");
    }

    @Override
    public void attacked(int damage) {
        System.out.println("\n...Hero is being attacked with damage: " + damage);
        heroContext.hp -= damage;
        if (heroContext.hp <=0 ) {
            heroContext.hp = 0;
            heroContext.setState(heroContext.getDeadState());
        }
    }

    @Override
    public void silenced() {
        System.out.println("\n...Hero is already silenced and cannot be silenced again.");
    }

    @Override
    public void recovered() {
        System.out.println("\n...Hero is being recovered.");
        heroContext.setState(heroContext.getAliveState());
    }

    @Override
    public void revived(int hp) {
        System.out.println("\n...Hero is already alive but silenced, and cannot be revived.");
    }

    public String toString() {
        return "silenced";
    }
}
