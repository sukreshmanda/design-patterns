package creational.factorymethod.json;

import creational.factorymethod.Message;
import creational.factorymethod.MessageCreator;

public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
