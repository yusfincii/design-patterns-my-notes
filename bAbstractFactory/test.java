
package bAbstractFactory;

public class test {
    
    public static void main(String[] args) {
        
        AbstractFactory audiFactory = new AbstractAudiFactory();
        AbstractFactory bmwfactory = new AbstractBmwFactory();
        
        Car audiCar = audiFactory.createCar("Red", 18750);
        Car bmwCar = bmwfactory.createCar("Black", 11200);
        
        Motorcycle audiMotorcycle = audiFactory.createMotorcycle("K-250", 9000);
        Motorcycle bmwMotorcycle = bmwfactory.createMotorcycle("Isuka", 14000);
        
        System.out.println(audiCar.getColor() + " - " + audiCar.getPrice());
        System.out.println(bmwCar.getColor() + " - " + bmwCar.getPrice());
        System.out.println(audiMotorcycle.getType() + " - " + audiMotorcycle.getPrice());
        System.out.println(bmwMotorcycle.getType() + " - " + bmwMotorcycle.getPrice());
        
        
    }
    
} 
