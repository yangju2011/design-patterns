package observer.gameUser;

public class SmurfDetectionDisplay implements Observer, DisplayInfo {
    private float historicalXPM = 0.0f;
    private float currentXPM;
    private float sumXPM = 0.0f;
    private int numGames;
    private Subject userData;

    public SmurfDetectionDisplay(Subject userData){
        this.userData = userData;
        userData.registerObserver(this);
    }

    @Override
    public void update(int level, String tier, float goldPerMinute, float experiencePerMinute) {
        if (numGames>0) {
            historicalXPM = sumXPM / numGames;
        }
        currentXPM = experiencePerMinute;
        sumXPM += experiencePerMinute;
        numGames ++;
        display();
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
