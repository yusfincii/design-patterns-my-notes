package cBuilder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yusuf
 */
public class test {
    
    public static void main(String[] args) {
        
        Person basicInfoPerson = BuilderPerson.basicPersonBuild("Ahmet Burak", "DINC").build();
        
        Person intermediateInfoPerson = BuilderPerson.intermediatePersonBuild("Furkan", "YUREKLI", 20, 1.70, 60.2).build();
        
        Person advancedInfoPerson = BuilderPerson.advancedPerson("Yusuf", "INCI", 22, 1.91, 84.7, "Brown", "Football").build();
        
        System.out.println(basicInfoPerson.toString());
        System.out.println(intermediateInfoPerson.toString());
        System.out.println(advancedInfoPerson.toString());
        
    }
    
}
