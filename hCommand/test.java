/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hCommand;

/**
 *
 * @author Yusuf
 */
public class test {
    
    public static void main(String[] args) {
        
        SingleRemoteControl remote = new SingleRemoteControl();
        Light light = new Light();
        
        LightOnCommand on = new LightOnCommand(light);
        LightOffCommand off = new LightOffCommand(light);
        
        remote.setCommand(on);
        remote.show();
    }
    
}
