package observer.gameUserPubSub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class PubSubService {
    Map<String, Set<Subscriber>> subscriberTopicMap = new HashMap<>();
    Queue<Message> messageQueue = new LinkedList<>();

    public void addMessageToQueue(Message message){
        messageQueue.add(message);
    }

    public void addSubscriber(String topic, Subscriber subscriber){
        if (subscriberTopicMap.containsKey(topic)){
            Set<Subscriber> subscribers = subscriberTopicMap.get(topic);
            subscribers.add(subscriber);
            subscriberTopicMap.put(topic,subscribers);
        }
        else{
            Set<Subscriber> subscribers = new HashSet<>();
            subscribers.add(subscriber);
            subscriberTopicMap.put(topic,subscribers);
        }
    }
    public void removeSubscriber(String topic, Subscriber subscriber){
        if (subscriberTopicMap.containsKey(topic)){
            Set<Subscriber> subscribers = subscriberTopicMap.get(topic);
            subscribers.remove(subscriber);
            subscriberTopicMap.put(topic,subscribers);
        }
    }

    //Sends messages about a topic for a subscriber. messagesQueue will be empty after broadcasting
    public void getMessagesOfTopic(String topic, Subscriber subscriber){
        if (messageQueue.isEmpty()){
            System.out.println("No messages from publishers to display");
        }
        else {
            while (!messageQueue.isEmpty()){
                Message message = messageQueue.remove();
                if (message.getTopic() == topic){
                    Set<Subscriber> subscribers = subscriberTopicMap.get(topic);
                    for (Subscriber sub: subscribers) {
                        if (sub.equals(subscriber)) {
                            ArrayList<Message> messages = sub.getMessages();
                            messages.add(message);
                            sub.setMessages(messages);
                        }
                    }
                }
            }
        }
    }

    //Broadcast new messages added in queue to All subscribers of the topic.
    public void broadcast(){
        if (messageQueue.isEmpty()){
            System.out.println("No messages from publishers to display");
        }
        else{
            while (!messageQueue.isEmpty()){
                Message message = messageQueue.remove();
                String topic = message.getTopic();
                Set<Subscriber> subscribers = subscriberTopicMap.get(topic);
                for (Subscriber subscriber: subscribers){
                    ArrayList<Message> messages = subscriber.getMessages();
                    messages.add(message);
                    subscriber.setMessages(messages);
                }
            }
        }
    }
}
