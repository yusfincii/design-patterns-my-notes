/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hCommand;

/**
 *
 * @author Yusuf
 */
public class SingleRemoteControl {
    
    Command command;
    
    public SingleRemoteControl(){}
    
    public void setCommand(Command command){
        this.command = command;
    }
    
    public void show(){
        command.execute();
    }
    
}
