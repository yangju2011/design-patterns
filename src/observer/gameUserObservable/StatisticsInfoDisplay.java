package observer.gameUserObservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsInfoDisplay implements Observer, DisplayInfo {
    private float sumGPM = 0.0f;
    private float sumXPM = 0.0f;
    private float maxGPM = 0.0f;
    private float maxXPM = 0.0f;
    private int numGames = 0;
    private Observable observable;

    public StatisticsInfoDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof UserData) {
            UserData userData = (UserData) observable;
            float GPM = userData.getGPM();
            float XPM = userData.getXPM();
            sumGPM += GPM;
            sumXPM += XPM;
            numGames++;

            if (GPM > maxGPM) {
                maxGPM = GPM;
            }
            if (XPM > maxXPM) {
                maxXPM = XPM;
            }

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("User statistics info: " + "\n\tAverage user GPM: " + (sumGPM/numGames)
                + "\n\tAverage user XPM: "  + (sumXPM/numGames)
                + "\n\tMaximum user GPM: " + maxGPM
                + "\n\tMaximum user XPM: " + maxXPM);
    }
}
