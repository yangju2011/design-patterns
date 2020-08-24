package observer.gameUser;

import java.util.ArrayList;

public class UserData implements Subject {
    private ArrayList<Observer> observers;
    private int level;
    private String tier;
    private float goldPerMinute;
    private float experiencePerMinute;

    public UserData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i); //or use remove(o). if not exist return false
        }
    }


    public void setInfo(int level, String tier, float goldPerMinute, float experiencePerMinute) {
        System.out.println("...User info set");
        this.level = level;
        this.tier = tier;
        this.goldPerMinute = goldPerMinute;
        this.experiencePerMinute = experiencePerMinute;
        infoChanged();
    }

    public void infoChanged() {
        System.out.println("...User info changed");
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(level, tier, goldPerMinute, experiencePerMinute);
        }
    }

    public int getLevel(){return level;}
    public String getTier(){return tier;}
    public float getGPM(){return goldPerMinute;}
    public float getXPM(){return experiencePerMinute;}
}
