package observer.gameUser;

public class StatisticsInfoDisplay implements Observer, DisplayInfo {
    private float sumGPM = 0.0f;
    private float sumXPM = 0.0f;
    private float maxGPM = 0.0f;
    private float maxXPM = 0.0f;
    private int numGames = 0;
    private Subject userData;

    public StatisticsInfoDisplay(Subject userData){
        this.userData = userData;
        userData.registerObserver(this);
    }

    @Override
    public void update(int level, String tier, float goldPerMinute, float experiencePerMinute) {
        sumGPM += goldPerMinute;
        sumXPM += experiencePerMinute;
        numGames ++;

        if (goldPerMinute > maxGPM){
            maxGPM=goldPerMinute;
        }
        if (experiencePerMinute > maxXPM){
            maxXPM=experiencePerMinute;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("User statistics info: " + "\n\tAverage user GPM: " + (sumGPM/numGames)
                + "\n\tAverage user XPM: "  + (sumXPM/numGames)
                + "\n\tMaximum user GPM: " + maxGPM
                + "\n\tMaximum user XPM: " + maxXPM);
    }
}
