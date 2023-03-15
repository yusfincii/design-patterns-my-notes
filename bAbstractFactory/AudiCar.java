
package bAbstractFactory;

public class AudiCar implements Car{
    
    private String color;
    private int price;
    
    public AudiCar(String color, int price){
        
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
