package aFactory;

public class Volkswagen implements ICar{
    
    private String color;
    private int price;
    
    public Volkswagen(String color, int price)
    {
        this.color = color;
        this.price = price;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getPrice(){
        return this.price;
    }
    
}
