/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbAbstractFactory2;

/**
 *
 * @author Yusuf
 */
public class FurnitureFactoryVictorian implements FurnitureFactory{
    
    Chair chair;
    public Chair createChair(int legs, boolean sitOn){
        chair = new ChairVictorian(legs, sitOn);
        return chair;
    }
    
    
    CoffeeTable coffeeTable;
    @Override
    public CoffeeTable createCoffeeTable(int legs, boolean sitOn) {
        coffeeTable = new CoffeeTableVictorian(legs, sitOn);
        return coffeeTable;
    }

    
    Sofa sofa;
    @Override
    public Sofa createSofa(int legs, boolean sitOn) {
        sofa = new SofaVictorian(legs, sitOn);
        return sofa;
        
    }
    
}
