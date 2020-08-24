package observer.gameUserObservable;

import java.util.Observable;
import java.util.Observer;

public class SmurfDetectionDisplay implements Observer, DisplayInfo {
    private float historicalXPM = 0.0f;
    private float currentXPM;
    private float sumXPM = 0.0f;
    private int numGames = 0;
    private Observable observable;

    public SmurfDetectionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof UserData){
            UserData userData = (UserData) observable;
            if (numGames > 0){
                historicalXPM = sumXPM / numGames;
            }
            currentXPM = userData.getXPM();
            sumXPM += userData.getXPM();
            numGames ++;
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Simple Smurf Detection: "
                + "\n\tHistorical user XPM: "  + historicalXPM
                + "\n\tCurrent user XPM: "  + currentXPM
                + "\n");
        if (isSmurf(historicalXPM, currentXPM, numGames)==true){
            System.out.println("This user account is probably a smurf!");
        }
        else {
            System.out.println("This user account is normal.");
        }

    }

    private Boolean isSmurf(float historicalXPM, float currentXPM, int numGames){
        return (numGames > 1) && (currentXPM > 2 * historicalXPM);
    }
}
