/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbAbstractFactory2;

/**
 *
 * @author Yusuf
 */
public class FurnitureFactoryArtDeco implements FurnitureFactory{
    
    Chair chair;
    @Override
    public Chair createChair(int legs, boolean sitOn){
        chair = new ChairArtDeco(legs, sitOn);
        return chair;
    }
    
    
    CoffeeTable coffeeTable;
    @Override
    public CoffeeTable createCoffeeTable(int legs, boolean sitOn) {
        coffeeTable = new CoffeeTableArtDeco(legs, sitOn);
        return coffeeTable;
    }

    
    Sofa sofa;
    @Override
    public Sofa createSofa(int legs, boolean sitOn) {
        sofa = new SofaArtDeco(legs, sitOn);
        return sofa;
        
    }
    
}
