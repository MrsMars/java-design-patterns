package com.aoher.processor.impl;

import com.aoher.processor.Command;

import java.util.List;

public class CompoundCommand implements Command {

    private List<Command> commands;

    public CompoundCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
