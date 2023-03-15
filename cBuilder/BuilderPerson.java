package cBuilder;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yusuf
 */
public class BuilderPerson {
    
    private String name;
    private String surname;
    
    private int age;
    
    private double height;
    private double weight;
    
    private String eyeColor;
    private String favSportBranch;
    
    
    public static BuilderPerson basicPersonBuild(String name, String surname){
        
        BuilderPerson basicPerson = new BuilderPerson();
        
        basicPerson.name = name;
        basicPerson.surname = surname;
        
        return basicPerson;
    }
    
    public static BuilderPerson intermediatePersonBuild(String name, String surname, int age, double height, double weight){
        
        BuilderPerson intermediatePerson = new BuilderPerson();
        
        intermediatePerson.name = name;
        intermediatePerson.surname = surname;
        intermediatePerson.age = age;
        intermediatePerson.height = height;
        intermediatePerson.weight = weight;
        
        return intermediatePerson;
    }
    
    public static BuilderPerson advancedPerson(String name, String surname, int age, double height, double weight, String eyeColor, String favSportBranch){
        
        BuilderPerson advancedPerson = new BuilderPerson();
        
        advancedPerson.name = name;
        advancedPerson.surname = surname;
        advancedPerson.age = age;
        advancedPerson.height = height;
        advancedPerson.weight = weight;
        advancedPerson.eyeColor = eyeColor;
        advancedPerson.favSportBranch = favSportBranch;
        
        return advancedPerson;
    }
    
    public Person build(){
        
        Person person = new Person();
        
        person.setName(name);
        person.setSurnmae(surname);
        person.setAge(age);
        person.setWeight(weight);
        person.setHeight(height);
        person.setEyeColor(eyeColor);
        person.setFavSportBranch(favSportBranch);
        
        return person;
    }
    
}
