package observer.gameUserPubSub;

public class PublisherImpl implements Publisher {
    @Override
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}
