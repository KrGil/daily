package com.Eisen.daily.command_pattern.invoker;


import com.Eisen.daily.command_pattern.command.Command;

public class Shiri {

    private Command command;

    public Shiri(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void order(){
        command.excute();
    }
}
