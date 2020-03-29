package com.aoher;

import com.aoher.model.Condition;
import com.aoher.model.Engine;
import com.aoher.model.RemoteControl;
import com.aoher.processor.Command;
import com.aoher.processor.impl.CompoundCommand;
import com.aoher.processor.impl.StartCondition;
import com.aoher.processor.impl.StartEngine;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Engine engine = new Engine();
        StartEngine startEngine = new StartEngine(engine);

        Condition condition = new Condition();
        StartCondition startCondition = new StartCondition(condition);

        List<Command> commands = new ArrayList<>();
        commands.add(startEngine);
        commands.add(startCondition);

        CompoundCommand compoundCommand = new CompoundCommand(commands);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, startEngine);
        remoteControl.setCommand(1, compoundCommand);
        remoteControl.buttonPress(1);
    }
}
