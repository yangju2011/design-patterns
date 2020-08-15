package factory.heroSimpleFactory;

public class NonHero extends Hero {
    public NonHero(){
        name = "not a hero";
    }
    
    public void display() {
        System.out.println("I'm not a hero!");
    }
}
