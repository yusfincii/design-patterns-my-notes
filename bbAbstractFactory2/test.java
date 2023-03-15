/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbAbstractFactory2;

/**
 *
 * @author Yusuf
 */
public class test {
    
    public static void main(String[] args) {
        
        FurnitureFactory artDecoFactory = new FurnitureFactoryArtDeco();
        FurnitureFactory modernFactory = new FurnitureFactoryModern();
        FurnitureFactory victorianFactory = new FurnitureFactoryModern();
        
        Chair artDecoChair = artDecoFactory.createChair(1, true);
        artDecoFactory.createCoffeeTable(2, true);
        artDecoFactory.createSofa(4, false);
        
        modernFactory.createChair(1, true);
        CoffeeTable modernCoffeetable = modernFactory.createCoffeeTable(2, false);
        modernFactory.createSofa(4, false);
        
        victorianFactory.createChair(1, true);
        victorianFactory.createCoffeeTable(2, true);
        Sofa victorianSofa = victorianFactory.createSofa(6, false);
        
        System.out.println(artDecoChair.hasLegs()); // 1
        System.out.println(modernCoffeetable.sitOn()); // false
        System.out.println(victorianSofa.hasLegs()); // 6
        
    }
}
