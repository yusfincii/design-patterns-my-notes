/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bbAbstractFactory2;

/**
 *
 * @author Yusuf
 */
public interface FurnitureFactory {
    
    Chair createChair(int legs, boolean sitOn);
    CoffeeTable createCoffeeTable(int legs, boolean sitOn);
    Sofa createSofa(int legs, boolean sitOn);
    
}
