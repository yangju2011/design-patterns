package state.heroStateV3;

public interface State {
    void attack();
    void attacked(int damage);
    void silenced();
    void recovered();
    void revived(int hp);
    void disappear();
    void appear();
}
