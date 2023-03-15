/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fAdapter;

/**
 *
 * @author Yusuf
 */
public class CarSpeedKmh implements Radar{
    
    private String plate;
    private double speed;
    
    public static double MAX_KMH_SPEED = 120;
    
    public CarSpeedKmh(String plate, double speed){
        this.plate = plate;
        this.speed = speed;
    }
    
    @Override
    public double getKmhSpeed() {
        return speed;
    }

    @Override
    public void showPaymentCount() {
        
        if(speed > MAX_KMH_SPEED){
            PaymentCalculator calculator = new PaymentCalculator();
            double willPay = calculator.calculate(this);
            
            System.out.println(plate + " cezasi : " + willPay);
        }
        else{
            System.out.println("Ceza yok.");
        }
    }
    
    
    
}
