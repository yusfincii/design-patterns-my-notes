/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fAdapter;

/**
 *
 * @author Yusuf
 */
public class PaymentCalculator {
    
    private static double KMH_PAYMENT_RATE = 26.85;
    
    public double calculate(Radar radar){
        double x = radar.getKmhSpeed() - CarSpeedKmh.MAX_KMH_SPEED;
        return x * KMH_PAYMENT_RATE;
    }
    
}
