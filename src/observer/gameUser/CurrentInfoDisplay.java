package observer.gameUser;

public class CurrentInfoDisplay implements Observer, DisplayInfo {
    private int level;
    private String tier;
    private float goldPerMinute;
    private float experiencePerMinute;
    private Subject userData;

    public CurrentInfoDisplay(Subject userData){
        this.userData = userData;
        userData.registerObserver(this);
    }

    @Override
    public void update(int level, String tier, float goldPerMinute, float experiencePerMinute) {
        this.level = level;
        this.tier = tier;
        this.goldPerMinute = goldPerMinute;
        this.experiencePerMinute = experiencePerMinute;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current user info: \n\tlevel: " + level + "\n\ttier: "+tier
                + "\n\tGPM: " + goldPerMinute + "\n\tXPM: "+experiencePerMinute);
    }
}
