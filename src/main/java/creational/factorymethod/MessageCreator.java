package creational.factorymethod;

public abstract class MessageCreator {
    Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }
    public abstract Message createMessage();

}
