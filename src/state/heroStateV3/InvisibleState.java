package state.heroStateV3;

public class InvisibleState implements State {
    HeroContext heroContext;

    public InvisibleState(HeroContext heroContext) {
        this.heroContext = heroContext;
    }

    @Override
    public void attack() {
        System.out.println("\n...Hero is attacking others.");
    }

    @Override
    public void attacked(int damage) {
        System.out.println("\n...Hero is invisible and cannot be attacked.");
    }

    @Override
    public void silenced() {
        System.out.println("\n...Hero is invisible and cannot be silenced.");
    }

    @Override
    public void recovered() {
        System.out.println("\n...Hero is already recovered, and cannot be recovered.");
    }

    @Override
    public void revived(int hp) {
        System.out.println("\n...Hero is already alive, and cannot be revived.");
    }

    @Override
    public void disappear() {
        System.out.println("\n...Hero is already invisible, and cannot disappear.");
    }

    @Override
    public void appear() {
        System.out.println("\n...Hero appears.");
        heroContext.setState(heroContext.getAliveState());
    }

    public String toString() {
        return "invisible";
    }
}
