package aFactory;

class Ford implements ICar {
    
    private String color;
    private int price;
    
    public Ford(String color, int price){
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
