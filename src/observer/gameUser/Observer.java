package observer.gameUser;

public interface Observer {
    void update(int level, String tier, float goldPerMinute, float experiencePerMinute);
}
