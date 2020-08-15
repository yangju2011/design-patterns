package strategy;

public class MeleeAttack implements AttackBehavior {
    @Override
    public void attack() {
        System.out.println("I have melee attack!");
    }
}
