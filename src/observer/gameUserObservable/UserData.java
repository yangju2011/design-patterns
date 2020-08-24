package observer.gameUserObservable;

import java.util.Observable;

public class UserData extends Observable {
    private int level;
    private String tier;
    private float goldPerMinute;
    private float experiencePerMinute;

    public UserData(){ }

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
        setChanged(); //must call this to signify the state has been changed
        notifyObservers();
    }

    public int getLevel(){return level;}
    public String getTier(){return tier;}
    public float getGPM(){return goldPerMinute;}
    public float getXPM(){return experiencePerMinute;}
}
