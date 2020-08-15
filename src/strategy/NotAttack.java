package strategy;

public class NotAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("<attack-not-available>");
    }
}
