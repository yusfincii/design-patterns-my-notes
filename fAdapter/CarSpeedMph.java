/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fAdapter;

/**
 *
 * @author Yusuf
 */
public class CarSpeedMph implements MileRadar{
    
    private String plate;
    private double speed;
    
    public CarSpeedMph(String plate, double speed){
        this.plate = plate;
        this.speed = speed;
    }
    
    public double getMphSpeed(){
        return speed;
    }

    @Override
    public void showPaymentCount() {
         Adapter adapter = new Adapter(this);
         
         if(adapter.getKmhSpeed() > CarSpeedKmh.MAX_KMH_SPEED){
             PaymentCalculator calculator = new PaymentCalculator();
             
             double willPay = calculator.calculate(adapter);
             
             System.out.println(plate + " cezasi: " + willPay);
         }
         else{
             System.out.println("Ceza yok.");
         }
    }
    
    
    
}
