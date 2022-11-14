package creational.factorymethod.text;

import creational.factorymethod.Message;

public class TextMessage extends Message {
    @Override
    public String getMessage() {
        return "Text:";
    }
}
