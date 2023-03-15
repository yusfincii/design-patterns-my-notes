/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gCompositeTree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yusuf
 */
public class Folder implements File{
    
    String name;
    
    public Folder(String name){
        this.name = name;
    }
    
    private ArrayList<File> contains = new ArrayList<>();
    
    public void addFolder(Folder folderName){
        contains.add(folderName);
    }
    
    public void addDocument(Document documentName){
        contains.add(documentName);
    }
    
    @Override
    public void showContent(){
        for(File file:contains){
            if(file.getClass() == Folder.class){
                System.out.println("Klasor Ismi: " + name);
            }
            else if(file.getClass() == Document.class){
                file.showContent();
            }
        }
        
    }
    
}
