
package bAbstractFactory;

public class BmwMotorcycle implements Motorcycle{
    
    private String type;
    private int price;
    
    public BmwMotorcycle(String type, int price){
        
        this.type = type;
        this.price = price;
    }
    
    @Override
    public String getType(){
        return this.type;
    }
    
    @Override
    public int getPrice(){
        return this.price;
    }
    
}
