package factory.heroAbstractFactory;

import java.util.ArrayList;

public abstract class Hero {
    public String name;
    public Position position;
    public Boots boots;
    public Weapon weapon;
    public ArrayList<Item> startItems;

    abstract void load();

    public String toString(){
        StringBuffer result = new StringBuffer();

        result.append("\n---- " + name + " ----\n");
        if (position != null) {
            result.append("Position: " + position);
            result.append("\n");
        }
        if (boots != null) {
            result.append("With boots: " + boots);
            result.append("\n");
        }
        if (weapon != null) {
            result.append("With weapon: " + weapon);
            result.append("\n");
        }
        if (startItems != null) {
            result.append("With start items: ");
            for (int i = 0; i < startItems.size(); i++) {
                result.append(startItems.get(i));
                if (i < startItems.size()-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public void render(){
        System.out.println("...Rendering");
    }
    public void display(){};

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
}
