package observer.gameUserObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentInfoDisplay implements Observer, DisplayInfo {
    private int level;
    private String tier;
    private float goldPerMinute;
    private float experiencePerMinute;
    private Observable observable;

    public CurrentInfoDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current user info: \n\tlevel: " + level + "\n\ttier: "+tier
                + "\n\tGPM: " + goldPerMinute + "\n\tXPM: "+experiencePerMinute);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof UserData){
            UserData userData = (UserData) observable;
            this.level = userData.getLevel();
            this.tier = userData.getTier();
            this.goldPerMinute = userData.getGPM();
            this.experiencePerMinute = userData.getXPM();
            display();
        }
    }
}
