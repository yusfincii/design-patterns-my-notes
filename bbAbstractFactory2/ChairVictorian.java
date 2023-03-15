/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbAbstractFactory2;

/**
 *
 * @author Yusuf
 */
public class ChairVictorian implements Chair{
    
    private int legs;
    private boolean sitOn;
    
    public ChairVictorian(int legs, boolean sitOn){
        this.legs = legs;
        this.sitOn = sitOn;
    }

    @Override
    public int hasLegs() {
        return this.legs;
    }

    @Override
    public boolean sitOn() {
        return this.sitOn;
    }
    
}
