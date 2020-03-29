package com.aoher.model;

import com.aoher.processor.Command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private List<Command>  buttons;

    public RemoteControl() {
        buttons = new ArrayList<>();
    }

    public void setCommand(int numButton, Command command) {
        buttons.add(numButton, command);
    }

    public void buttonPress(int numButton) {
        buttons.get(numButton).execute();
    }
}
