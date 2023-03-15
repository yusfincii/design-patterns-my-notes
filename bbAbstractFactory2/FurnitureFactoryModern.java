/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbAbstractFactory2;

/**
 *
 * @author Yusuf
 */
public class FurnitureFactoryModern implements FurnitureFactory{
    
    Chair chair;
    public Chair createChair(int legs, boolean sitOn){
        chair = new ChairModern(legs, sitOn);
        return chair;
    }
    
    
    CoffeeTable coffeeTable;
    @Override
    public CoffeeTable createCoffeeTable(int legs, boolean sitOn) {
        coffeeTable = new CoffeeTableModern(legs, sitOn);
        return coffeeTable;
    }

    
    Sofa sofa;
    @Override
    public Sofa createSofa(int legs, boolean sitOn) {
        sofa = new SofaModern(legs, sitOn);
        return sofa;
        
    }
    
}
