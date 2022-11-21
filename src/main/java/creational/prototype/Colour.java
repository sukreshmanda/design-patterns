package creational.prototype;

public class Colour implements Cloneable{
   String colourName;

   public Colour(String colourName){
        this.colourName = colourName;
   }
    private Colour(Colour colour) {
        this.colourName = colour.colourName;
    }

    @Override
    public Colour clone(){
       return new Colour(this);
    }
}
