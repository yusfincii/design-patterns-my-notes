/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fAdapter;

/**
 *
 * @author Yusuf
 */
public class test {
    
    public static void main(String[] args) {
        
        CarSpeedKmh car1 = new CarSpeedKmh("49 YSF 49", 135);
        car1.showPaymentCount();
        
        CarSpeedKmh car2 = new CarSpeedKmh("35 ABD 35", 100);
        car2.showPaymentCount();
        
        CarSpeedMph carx1 = new CarSpeedMph("49 YSX 49", 84);
        carx1.showPaymentCount();
        
    }
}
