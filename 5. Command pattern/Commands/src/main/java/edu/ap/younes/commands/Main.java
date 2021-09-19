/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.younes.commands;

/**
 *
 * @author Younes
 */
public class Main {
    public static void main(String[] args) {
        Lights light = new Lights();
        LightsOnCommand command1 = new LightsOnCommand();
        LightsOffCommand command2 = new LightsOffCommand();
        DimLightsCommand command3 = new DimLightsCommand();
        BrightLightsCommand command4 = new BrightLightsCommand();
        
        SimpleController controller1 = new SimpleController();
        controller1.setCommand(command1);
        controller1.pressButton();
        System.out.println("");
        
        MultiController controller2 = new MultiController();
        controller2.setCommand(command1, command2, 0);
        controller2.setCommand(command3, command4, 1);
        controller2.onButten(0);
        controller2.offButten(2);
        controller2.offButten(0);
        controller2.onButten(1);
        controller2.undoButton();
        
        System.out.println(controller2.toString());
        System.out.println("");
        Fan fan = Fan.HIGH;
        HighFanCommand command5 = new HighFanCommand(fan);
        LowFanCommand command6 = new LowFanCommand(fan);
        MidFanCommand command7 = new MidFanCommand(fan);
        controller2.setCommand(command5, command6, 2);
        controller2.setCommand(command5, command7, 3);
        controller2.offButten(2);
        controller2.undoButton();
        controller2.offButten(2);
        controller2.offButten(3);
        controller2.undoButton();
    }
}
