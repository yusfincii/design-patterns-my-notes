/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ePrototype;

/**
 *
 * @author Yusuf
 */
public class Soldier implements Cloneable{
    
    private String name;
    private String weaponType;
    
    private int age;
    private int health;
    
    private boolean isAvailableForWar;
    
    public Soldier(String name, String weaponType, int age, int health, boolean isAvailableForWar){
        this.name = name;
        this.weaponType = weaponType;
        this.age = age;
        this.health = health;
        this.isAvailableForWar = isAvailableForWar;
    }
    
    public void showInfo()
    {
        System.out.println("----------" + "\nName: " + getName() + "\nWeapon Type: " + getWeaponType() + "\nAge: " + 
                getAge() + "\nHealth: " + getHealth() + "\nWar Availability: " + isIsAvailableForWar() + "\n----------");
    }
    
    
    @Override
    public Soldier clone(){
        
        Soldier soldierClone = null;
        
        try {
            soldierClone = (Soldier) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Kopyalama Hatasi !");
        }
        
        return soldierClone;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weaponType
     */
    public String getWeaponType() {
        return weaponType;
    }

    /**
     * @param weaponType the weaponType to set
     */
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the isAvailableForWar
     */
    public boolean isIsAvailableForWar() {
        return isAvailableForWar;
    }

    /**
     * @param isAvailableForWar the isAvailableForWar to set
     */
    public void setIsAvailableForWar(boolean isAvailableForWar) {
        this.isAvailableForWar = isAvailableForWar;
    }
    
    
    
    
    
}
