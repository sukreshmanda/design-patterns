package creational.factorymethod.text;

import creational.factorymethod.Message;
import creational.factorymethod.MessageCreator;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
