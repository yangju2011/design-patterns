package observer.gameUserPubSub;
import java.util.ArrayList;

public abstract class Subscriber {
    private ArrayList<Message> messages = new ArrayList<>();
    public ArrayList<Message> getMessages(){
        return messages;
    }
    public void setMessages(ArrayList<Message> messages){
        this.messages = messages;
    }
    public abstract void printMessages();
    public abstract void addSubscriber(String topic, PubSubService pubSubService);
    public abstract void removeSubscriber(String topic, PubSubService pubSubService);
    public abstract void getMessagesOfTopic(String topic, PubSubService pubSubService);

}
