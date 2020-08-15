package factory.heroAbstractFactory;

public class BootsHero extends Hero {
    HeroBuildFactory factory;
    public BootsHero(HeroBuildFactory factory) {
        this.factory = factory;
    }

    void load(){
        System.out.println("...Loading hero from database");
        position = factory.createPosition();
        startItems = factory.createStartItems();
        boots = factory.createBoosts();
    }

    public void display() {
        System.out.println("...Displaying \nI have a build with boots!");
    }
}
