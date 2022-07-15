package com.Eisen.daily.command_pattern.command;


import com.Eisen.daily.command_pattern.receiver.TerraceLights;

public class TerraceLightsOnCommand implements Command {

    private TerraceLights terrace;

    public TerraceLightsOnCommand(TerraceLights terrace){
        this.terrace = terrace;
    }

    @Override
    public void excute() {
        terrace.turnOn();
    }
}
