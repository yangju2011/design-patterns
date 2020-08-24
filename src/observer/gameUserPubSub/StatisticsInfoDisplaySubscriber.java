package observer.gameUserPubSub;

import java.util.ArrayList;

public class StatisticsInfoDisplaySubscriber extends SubscriberImpl {
    ArrayList<Message> messages = this.getMessages();

    @Override
    public void printMessages() {
        float sumGPM = 0.0f;
        float sumXPM = 0.0f;
        float maxGPM = 0.0f;
        float maxXPM = 0.0f;
        int numGames = 0;
        if (!messages.isEmpty()){
            System.out.println("Topic -> " + messages.get(0).getTopic());
        }
        for (Message message : messages) {
            UserData payload = message.getPayload();
            float GPM = payload.getGPM();
            float XPM = payload.getXPM();
            sumGPM += GPM;
            sumXPM += XPM;
            numGames++;
            if (GPM > maxGPM) {
                maxGPM = GPM;
            }
            if (XPM > maxXPM) {
                maxXPM = XPM;
            }
        }
        System.out.println("User statistics info: " + "\n\tAverage user GPM: " + (sumGPM/numGames)
                + "\n\tAverage user XPM: "  + (sumXPM/numGames)
                + "\n\tMaximum user GPM: " + maxGPM
                + "\n\tMaximum user XPM: " + maxXPM);
    }
}
