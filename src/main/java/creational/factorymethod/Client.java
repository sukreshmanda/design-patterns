package creational.factorymethod;

import creational.factorymethod.json.JSONMessageCreator;
import creational.factorymethod.text.TextMessageCreator;
import creational.factorymethod.xml.XMLMessageCreator;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
        printMessage(new XMLMessageCreator());
    }

    private static void printMessage(MessageCreator messageCreator) {
        System.out.println(messageCreator.getMessage().getMessage());
    }
}
