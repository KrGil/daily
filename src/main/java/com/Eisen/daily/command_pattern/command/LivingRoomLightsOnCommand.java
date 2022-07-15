package com.Eisen.daily.command_pattern.command;

import com.Eisen.daily.command_pattern.receiver.LivingRoomLights;

public class LivingRoomLightsOnCommand implements Command {

    private LivingRoomLights livingRoom;

    public LivingRoomLightsOnCommand(LivingRoomLights livingRoom){
        this.livingRoom = livingRoom;
    }

    @Override
    public void excute() {
        livingRoom.turnOn();
    }
}
