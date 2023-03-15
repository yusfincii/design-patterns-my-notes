
package bAbstractFactory;

public class AbstractBmwFactory implements AbstractFactory{
    
    @Override
    public BmwCar createCar(String color, int price){
        BmwCar object = new BmwCar(color, price);
        return object;
    }
    
    @Override
    public BmwMotorcycle createMotorcycle(String type, int price){
        BmwMotorcycle object = new BmwMotorcycle(type, price);
        return object;
    }
    
    
}
