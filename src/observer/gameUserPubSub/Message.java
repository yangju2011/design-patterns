package observer.gameUserPubSub;

public class Message {
    private String topic;
    private UserData payload;

    public Message() {}
        public Message(String topic, UserData payload){
        this.topic=topic;
        this.payload=payload;
    }
    public UserData getPayload(){
        return this.payload;
    }
    public void setPayload(UserData payload){
        this.payload=payload;
    }

    public String getTopic(){
        return this.topic;
    }
    public void setTopic(String topic){
        this.topic=topic;
    }
}
