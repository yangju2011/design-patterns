package observer.gameUserPubSub;

import java.util.ArrayList;

public class SmurfDetectionDisplaySubscriber extends SubscriberImpl {
    ArrayList<Message> messages = this.getMessages();

    @Override
    public void printMessages() {
        float historicalXPM = 0.0f;
        float currentXPM = 0.0f;
        float sumXPM = 0.0f;
        int numGames = 0;
        if (!messages.isEmpty()){
            System.out.println("Topic -> " + messages.get(0).getTopic());
        }
        for (Message message : messages) {
            UserData payload = message.getPayload();
            if (numGames > 0){
                historicalXPM = sumXPM / numGames;
            }
            currentXPM = payload.getXPM();
            sumXPM += payload.getXPM();
            numGames ++;
        }

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
