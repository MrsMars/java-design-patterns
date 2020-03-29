package com.aoher.model.impl;

import com.aoher.model.Castle;

public class OrcCastle implements Castle {

    public static final String DESCRIPTION = "This is the Orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}