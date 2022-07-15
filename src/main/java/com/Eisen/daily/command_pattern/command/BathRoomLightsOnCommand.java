package com.Eisen.daily.command_pattern.command;


import com.Eisen.daily.command_pattern.receiver.BathRoomLights;

public class BathRoomLightsOnCommand implements Command {

    private BathRoomLights bathRoom;

    public BathRoomLightsOnCommand( BathRoomLights bathRoom){
        this.bathRoom = bathRoom;
    }

    @Override
    public void excute() {
        bathRoom.turnOn();
    }
}
