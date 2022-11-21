package creational.prototype;

public class Client {
    public static void main(String[] args) {
        Colour colour = new Colour("Red");
        Colour colour1 = colour.clone();
        System.out.println(colour == colour1);
    }
}
