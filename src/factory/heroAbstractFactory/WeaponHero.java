package factory.heroAbstractFactory;

public class WeaponHero extends Hero {
    HeroBuildFactory factory;
    public WeaponHero(HeroBuildFactory factory) {
        this.factory = factory;
    }

    void load(){
        System.out.println("...Loading hero from database");
        position = factory.createPosition();
        startItems = factory.createStartItems();
        weapon = factory.createWeapon();
    }

    public void display() {
        System.out.println("...Displaying \nI have a build with weapon!");
    }
}
