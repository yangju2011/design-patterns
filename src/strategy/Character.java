package strategy;

import java.util.ArrayList;

public abstract class Character {
    public String name;
    public String attribute;
    public MoveBehavior moveBehavior;
    public AttackBehavior attackBehavior;
    public ArrayList<String> abilities = new ArrayList();

    public Character() {}

    public void move() {
        moveBehavior.move();
    }

    public void attack() {
        attackBehavior.attack();
    }

    // all characters display
    public void display(){};

    // only some characters can disable
    public void disable(){}

    public void setMoveBehavior (MoveBehavior mb) {
        System.out.println("-- set move behavior");
        moveBehavior = mb;
    }

    public void setAttackBehavior (AttackBehavior ab) {
        System.out.println("-- set attack behavior");
        attackBehavior = ab;
    }

    public String getName() {return name;}
}
