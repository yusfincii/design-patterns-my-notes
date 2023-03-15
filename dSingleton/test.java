/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dSingleton;

/**
 *
 * @author Yusuf
 */
public class test {
    
    public static void main(String[] args) {
        
        Instance object1 = Instance.create();
        Instance object2 = Instance.create();
        
        if(object1 == object2){
            System.out.println("AYNI");
        }
        else{
            System.out.println("FARKLI");
        }
    }
    
}
