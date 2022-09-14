package com.Eisen.daily.testCoding.command_pattern.client;


import com.Eisen.daily.testCoding.command_pattern.command.BathRoomLightsOnCommand;
import com.Eisen.daily.testCoding.command_pattern.command.Command;
import com.Eisen.daily.testCoding.command_pattern.command.LivingRoomLightsOnCommand;
import com.Eisen.daily.testCoding.command_pattern.command.TerraceLightsOnCommand;
import com.Eisen.daily.testCoding.command_pattern.invoker.Shiri;
import com.Eisen.daily.testCoding.command_pattern.receiver.BathRoomLights;
import com.Eisen.daily.testCoding.command_pattern.receiver.LivingRoomLights;
import com.Eisen.daily.testCoding.command_pattern.receiver.TerraceLights;

public class Client {
    public static void main(String[] args) {
        // Receiver
        LivingRoomLights livingRoom = new LivingRoomLights();
        BathRoomLights bathRoom = new BathRoomLights();
        TerraceLights terrace = new TerraceLights();

        // Command
        Command livingRoomCmd = new LivingRoomLightsOnCommand(livingRoom);
        Command bathRoomCmd = new BathRoomLightsOnCommand(bathRoom);
        Command terraceCmd = new TerraceLightsOnCommand(terrace);

        // Invoker
        Shiri shiri = new Shiri(livingRoomCmd);
        shiri.order();
        shiri.setCommand(bathRoomCmd);
        shiri.order();
        shiri.setCommand(terraceCmd);
        shiri.order();
    }
}
