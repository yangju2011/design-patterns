package factory.heroAbstractFactory;

public class BasicHero extends Hero {
    HeroBuildFactory factory;
    public BasicHero(HeroBuildFactory factory) {
        this.factory = factory;
    }

    void load(){
        System.out.println("...Loading hero from database");
        position = factory.createPosition();
        startItems = factory.createStartItems();
    }

    public void display() {
        System.out.println("...Displaying \nI have a basic build!");
    }
}
