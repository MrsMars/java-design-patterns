package com.aoher.processor.impl;

import com.aoher.model.Engine;
import com.aoher.processor.Command;

public class StartEngine implements Command {

    private Engine engine;

    public StartEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.start();
    }
}
