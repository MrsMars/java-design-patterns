package com.aoher.processor.impl;

import com.aoher.model.Condition;
import com.aoher.processor.Command;

public class StartCondition implements Command {

    private Condition condition;

    public StartCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public void execute() {
        condition.start();
    }
}
