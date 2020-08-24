package observer.gameUser;

public class UserPanel {
    public static void main(String[] args){
        UserData userData = new UserData();

        CurrentInfoDisplay currentInfoDisplay = new CurrentInfoDisplay(userData);
        StatisticsInfoDisplay statisticsInfoDisplay = new StatisticsInfoDisplay(userData);
        SmurfDetectionDisplay smurfDetectionDisplay = new SmurfDetectionDisplay(userData);

        userData.setInfo(10, "Regular", 100f, 200f);
        userData.setInfo(11, "Battle Pass", 200f, 300f);
        userData.setInfo(11, "Regular", 200f, 1000f);
    }
}
