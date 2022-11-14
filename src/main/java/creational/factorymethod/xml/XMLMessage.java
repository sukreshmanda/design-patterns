package creational.factorymethod.xml;

import creational.factorymethod.Message;

public class XMLMessage extends Message {
    @Override
    public String getMessage() {
        return "XML:<>";
    }
}
