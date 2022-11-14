package creational.factorymethod.xml;

import creational.factorymethod.Message;
import creational.factorymethod.MessageCreator;

public class XMLMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new XMLMessage();
    }
}
