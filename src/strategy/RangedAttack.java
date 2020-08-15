package strategy;

public class RangedAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("I have ranged attack!");
    }
}
