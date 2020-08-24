package observer.gameUserPubSub;

import java.util.ArrayList;

public class CurrentInfoDisplaySubscriber extends SubscriberImpl {
    ArrayList<Message> messages = this.getMessages();

    @Override
    public void printMessages() {
        for (Message message : messages) {
            System.out.println("Topic -> " + message.getTopic());
            UserData payload = message.getPayload();
            System.out.println("Current user info: \n\tlevel: " + payload.getLevel()
                    + "\n\ttier: " + payload.getTier()
                    + "\n\tGPM: " + payload.getGPM()
                    + "\n\tXPM: " + payload.getXPM());
        }
    }
}
