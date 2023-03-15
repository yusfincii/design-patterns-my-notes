package aFactory;

public class test {

    public static void main(String[] args) {

        try {
            ICar car1 = Factory.createCar("Ford", "Sky Blue", 19000);
            ICar car2 = Factory.createCar("Volkswagen", "Orange", 17500);
//            ICar car3 = Factory.createCar("Volvo", "black", 18000);

            System.out.println(car1.getColor());
            System.out.println(car2.getPrice());
        }catch(Exception e){
            System.out.println(e);
        }

    }

}
