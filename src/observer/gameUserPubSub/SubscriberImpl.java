package observer.gameUserPubSub;

public class SubscriberImpl extends Subscriber{

    @Override
    public void printMessages() {
    }

    @Override
    public void addSubscriber(String topic, PubSubService pubSubService) {
        pubSubService.addSubscriber(topic, this);
    }

    @Override
    public void removeSubscriber(String topic, PubSubService pubSubService) {
        pubSubService.removeSubscriber(topic, this);
    }

    @Override
    public void getMessagesOfTopic(String topic, PubSubService pubSubService) {
        pubSubService.getMessagesOfTopic(topic, this);
    }
}
