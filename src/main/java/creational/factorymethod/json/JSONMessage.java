package creational.factorymethod.json;

import creational.factorymethod.Message;

public class JSONMessage extends Message {
    @Override
    public String getMessage() {
        return "JSON:{}";
    }
}
