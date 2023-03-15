/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gCompositeTree;

/**
 *
 * @author Yusuf
 */
public class test {
    
    public static void main(String[] args) {
        
        Folder folder1 = new Folder("Folder-1"); // root
        Folder folder2 = new Folder("Folder-2"); // inside Folder-1
        
        Document doc1 = new Document("Document-1"); // inside Folder-1
        Document doc2 = new Document("Document-2"); // inside Folder-2
        
        folder1.addDocument(doc1);
        folder1.addFolder(folder2);
        folder2.addDocument(doc2);
        
        folder1.showContent();
        System.out.println("----------");
        folder2.showContent();
        
    }
    
}
