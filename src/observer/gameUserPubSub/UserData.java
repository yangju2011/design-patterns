package observer.gameUserPubSub;

public class UserData {
    private int level;
    private String tier;
    private float goldPerMinute;
    private float experiencePerMinute;

    public UserData(
            int level,
            String tier,
            float goldPerMinute,
            float experiencePerMinute){
        this.level = level;
        this.tier = tier;
        this.goldPerMinute = goldPerMinute;
        this.experiencePerMinute = experiencePerMinute;
    }

    public int getLevel(){return level;}
    public String getTier(){return tier;}
    public float getGPM(){return goldPerMinute;}
    public float getXPM(){return experiencePerMinute;}
}
