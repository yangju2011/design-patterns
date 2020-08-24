package observer.gameUserPubSub;

public class UserPanel {
    public static void main(String[] args) {
        UserData userDataRanked1 = new UserData(10, "Regular", 100f, 200f);
        UserData userDataRanked2 = new UserData(11, "Battle Pass", 200f, 300f);
        UserData userDataRanked3 = new UserData(11, "Regular", 200f, 1000f);

        UserData userDataUnranked1 = new UserData(11, "Regular", 500f, 900f);

        String TOPIC_RANKED = "RANKED";
        String TOPIC_UNRANKED = "UNRANKED";

        Publisher userDataPublisherRanked = new PublisherImpl();
        Publisher userDataPublisherUnranked = new PublisherImpl();

        Subscriber currentInfoDisplaySubscriberRanked = new CurrentInfoDisplaySubscriber();
        Subscriber currentInfoDisplaySubscriberUnranked = new CurrentInfoDisplaySubscriber();
        Subscriber currentInfoDisplaySubscriberAll = new CurrentInfoDisplaySubscriber();

        Subscriber statisticsInfoDisplaySubscriberRanked = new StatisticsInfoDisplaySubscriber();
        Subscriber smurfDetectionDisplaySubscriberRanked = new SmurfDetectionDisplaySubscriber();

        PubSubService pubSubService = new PubSubService();

        Message userDataMsgRanked1 = new Message(TOPIC_RANKED, userDataRanked1);
        Message userDataMsgUnranked1 = new Message(TOPIC_UNRANKED, userDataUnranked1);
        userDataPublisherRanked.publish(userDataMsgRanked1, pubSubService);
        userDataPublisherUnranked.publish(userDataMsgUnranked1, pubSubService);

        currentInfoDisplaySubscriberRanked.addSubscriber(TOPIC_RANKED, pubSubService);
        currentInfoDisplaySubscriberUnranked.addSubscriber(TOPIC_UNRANKED, pubSubService);
        currentInfoDisplaySubscriberAll.addSubscriber(TOPIC_RANKED, pubSubService);
        currentInfoDisplaySubscriberAll.addSubscriber(TOPIC_UNRANKED, pubSubService);

        statisticsInfoDisplaySubscriberRanked.addSubscriber(TOPIC_RANKED, pubSubService);
        smurfDetectionDisplaySubscriberRanked.addSubscriber(TOPIC_RANKED, pubSubService);
        
        pubSubService.broadcast();

        System.out.println(">>> Messages of currentInfoDisplaySubscriberRanked are: ");
        currentInfoDisplaySubscriberRanked.printMessages();
        System.out.println(">>> Messages of currentInfoDisplaySubscriberUnranked are: ");
        currentInfoDisplaySubscriberUnranked.printMessages();
        System.out.println(">>> Messages of currentInfoDisplaySubscriberAll are: ");
        currentInfoDisplaySubscriberAll.printMessages();

        System.out.println(">>> Messages of statisticsInfoDisplaySubscriberRanked are: ");
        statisticsInfoDisplaySubscriberRanked.printMessages();
        System.out.println(">>> Messages of smurfDetectionDisplaySubscriberRanked are: ");
        smurfDetectionDisplaySubscriberRanked.printMessages();


        System.out.println("\n...Publishing 1 more userData Message");
        Message userDataMsgRanked2 = new Message(TOPIC_RANKED, userDataRanked2);
        userDataPublisherRanked.publish(userDataMsgRanked2, pubSubService);

        //broadcast so everything is updated
        pubSubService.broadcast();

        System.out.println(">>> Messages of currentInfoDisplaySubscriberRanked are: ");
        currentInfoDisplaySubscriberRanked.printMessages();
        System.out.println(">>> Messages of currentInfoDisplaySubscriberUnranked are: ");
        currentInfoDisplaySubscriberUnranked.printMessages();
        System.out.println(">>> Messages of currentInfoDisplaySubscriberAll are: ");
        currentInfoDisplaySubscriberAll.printMessages();

        System.out.println(">>> Messages of statisticsInfoDisplaySubscriberRanked are: ");
        statisticsInfoDisplaySubscriberRanked.printMessages();
        System.out.println(">>> Messages of smurfDetectionDisplaySubscriberRanked are: ");
        smurfDetectionDisplaySubscriberRanked.printMessages();

        System.out.println("\n...Publishing 1 more userData Message but not broadcasting");
        Message userDataMsgRanked3 = new Message(TOPIC_RANKED,userDataRanked3);

        //send message to subscribers separately
        userDataPublisherRanked.publish(userDataMsgRanked3, pubSubService);
        currentInfoDisplaySubscriberRanked.getMessagesOfTopic(TOPIC_RANKED, pubSubService);
        userDataPublisherRanked.publish(userDataMsgRanked3, pubSubService);
        statisticsInfoDisplaySubscriberRanked.getMessagesOfTopic(TOPIC_RANKED, pubSubService);
        userDataPublisherRanked.publish(userDataMsgRanked3, pubSubService);
        smurfDetectionDisplaySubscriberRanked.getMessagesOfTopic(TOPIC_RANKED, pubSubService);

        System.out.println(">>> Messages of currentInfoDisplaySubscriberRanked are: ");
        currentInfoDisplaySubscriberRanked.printMessages();
        System.out.println(">>> Messages of currentInfoDisplaySubscriberAll are: ");
        currentInfoDisplaySubscriberAll.printMessages();

        System.out.println(">>> Messages of statisticsInfoDisplaySubscriberRanked are: ");
        statisticsInfoDisplaySubscriberRanked.printMessages();
        System.out.println(">>> Messages of smurfDetectionDisplaySubscriberRanked are: ");
        smurfDetectionDisplaySubscriberRanked.printMessages();
    }
}
