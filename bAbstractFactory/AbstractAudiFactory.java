
package bAbstractFactory;

public class AbstractAudiFactory implements AbstractFactory{
    
    @Override
    public AudiCar createCar(String color, int price){
        
        AudiCar object = new AudiCar(color, price);
        return object;
        
    }
    
    @Override
    public AudiMotorcycle createMotorcycle(String type, int price){
        AudiMotorcycle object = new AudiMotorcycle(type, price);
        return object;
    }
}
