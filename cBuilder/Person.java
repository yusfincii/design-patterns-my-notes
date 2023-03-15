package cBuilder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yusuf
 */
public class Person {
    
    private String name;
    private String surname;
    
    private int age;
    
    private double height;
    private double weight;
    
    private String eyeColor;
    private String favSportBranch;

   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurnmae(String surname){
        this.surname = surname;
    }
    
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    public String getEyeColor() {
        return eyeColor;
    }
    
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    
    
    public String getFavSportBranch() {
        return favSportBranch;
    }
    
    public void setFavSportBranch(String favSportBranch) {
        this.favSportBranch = favSportBranch;
    }
    
    
    @Override
    public String toString(){
        
        return "------------\n" + " Isim: " + this.name + "\n Soyisim: " + this.surname + 
                "\n Yas: " + this.age + "\n Boy: " + this.height + "\n Kilo: " + 
                this.weight + "\n Goz Rengi: " + this.eyeColor + "\n Favori Spor Dali: "
                + this.favSportBranch + "\n------------";
    }
}
