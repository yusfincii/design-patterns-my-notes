/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fAdapter;

/**
 *
 * @author Yusuf
 */
public class Adapter implements Radar{
    
    private CarSpeedMph carSpeedMph;
    private static double RATE = 0.6213;
    
    public Adapter(CarSpeedMph carSpeedMph){
        this.carSpeedMph = carSpeedMph;
    }
    
    @Override
    public void showPaymentCount(){
        
    }

    @Override
    public double getKmhSpeed() {
        return (carSpeedMph.getMphSpeed() / RATE);
    }
    
}
