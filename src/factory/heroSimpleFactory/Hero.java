package factory.heroSimpleFactory;

import java.util.ArrayList;

public abstract class Hero {
    public String name;
    public String attribute;
    public String position;
    public ArrayList<String> abilities = new ArrayList();
    public ArrayList<String> extraVoiceLines = new ArrayList();

    public Hero() {}

    public void load(){
        System.out.println("...Loading hero from database");
        System.out.println("Hero name: " + name);
        if (attribute != null & position!=null) {
            System.out.println("Hero attribute: " + attribute);
            System.out.println("Hero position: " + position);
        }
        if (abilities.size()>0) {
            System.out.println("Hero abilities: ");
            for (int i = 0; i < abilities.size(); i++) {
                System.out.println("   " + abilities.get(i));
            }
        }
        if (extraVoiceLines.size()>0) {
            System.out.println("Extra voice lines: ");
            for (int i = 0; i < extraVoiceLines.size(); i++) {
                System.out.println("   " + extraVoiceLines.get(i));
            }
        }
    }
    public void render(){
        System.out.println("...Rendering");
    }

    public void display(){};

    public String getName() {return name;}
}
