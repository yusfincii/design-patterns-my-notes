/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ePrototype;

/**
 *
 * @author Yusuf
 */
public class test {
    
    public static void main(String[] args) {
        
        Soldier soldier = new Soldier("Yusuf", "Gun", 21, 100, true);
        
        Soldier cloneSoldier = soldier.clone();
        cloneSoldier.setName("Clone Yusuf");
        cloneSoldier.setHealth(80);
        
        Soldier cloneSoldier2 = soldier.clone();
        cloneSoldier2.setName("Clone Yusuf 2");
        cloneSoldier2.setHealth(80);
        cloneSoldier2.setIsAvailableForWar(false);
        
        soldier.showInfo();
        cloneSoldier.showInfo();
        cloneSoldier2.showInfo();
        
    }
    
}
