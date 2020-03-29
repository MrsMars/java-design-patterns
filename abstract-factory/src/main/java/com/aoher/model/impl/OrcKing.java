package com.aoher.model.impl;

import com.aoher.model.King;

public class OrcKing implements King {

    public static final String DESCRIPTION = "This is the Orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}