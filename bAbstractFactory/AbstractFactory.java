
package bAbstractFactory;

public interface AbstractFactory {
    
    Car createCar(String color, int price);
    Motorcycle createMotorcycle(String type, int price);
    
}
