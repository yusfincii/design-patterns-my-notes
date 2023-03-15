/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dSingleton;

/**
 *
 * @author Yusuf
 */
public class Instance {
    
    public static Instance instance;
    
    private Instance(){
        
    }
    
    
    public static Instance create(){
        if(instance == null){
            instance = new Instance();
            System.out.println("Ornek nesne olustu !");
        }
        return instance;
    }
}
