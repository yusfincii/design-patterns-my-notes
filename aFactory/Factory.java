package aFactory;

public class Factory {

    // Factory Method
    public static ICar createCar(String brand, String color, int price) throws Exception{

        ICar car;

        switch (brand) {
            case "Ford" -> car = new Ford(color, price);
            case "Volkswagen" -> car = new Volkswagen(color, price);
            default -> throw new Exception("Does not support product as brand of "+ brand + ".");
        }
        
        return car;
    }
}
