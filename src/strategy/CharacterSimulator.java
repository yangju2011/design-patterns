package strategy;

public class CharacterSimulator {
    public static void main(String[] args) {
        Character sven = new SvenCharacter();
        Character sniper = new SniperCharacter();
        Character crystalMaiden = new CrystalMaidenCharacter();
        Character courier = new CourierCharacter();
        Character seller = new SellerCharacter();

        sven.display();
        sven.attack();
        sven.move();
        sven.disable();

        sniper.display();
        sniper.attack();
        sniper.move();
        sniper.disable();

        crystalMaiden.display();
        crystalMaiden.attack();
        crystalMaiden.move();
        crystalMaiden.disable();
        crystalMaiden.setMoveBehavior(new MoveBurst());
        crystalMaiden.move();

        courier.display();
        courier.attack();
        courier.move();
        courier.disable();

        courier.setMoveBehavior(new MoveBurst());
        courier.move();

        courier.setAttackBehavior(new RangedAttack());
        courier.attack();

        seller.display();
        seller.attack();
        seller.move();
        seller.disable();


    }
}
