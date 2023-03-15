/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gCompositeTree;

/**
 *
 * @author Yusuf
 */
public class Document implements File{
    
    String name;
    
    public Document(String name){
        this.name = name;
    }
    
    @Override
    public void showContent(){
        System.out.println("Dokuman Ismi: " + name);
    }
    
}
