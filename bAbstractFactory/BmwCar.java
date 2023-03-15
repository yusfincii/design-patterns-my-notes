
package bAbstractFactory;

public class BmwCar implements Car{
    
    private String color;
    private int price;
    
    public BmwCar(String color, int price){
        
        this.color = color;
        this.price = price;
    }
    
    @Override
    public String getColor(){
        return this.color;
    }
    
    @Override
    public int getPrice(){
        return this.price;
    }
    
}
