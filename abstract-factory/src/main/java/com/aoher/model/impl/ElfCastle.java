package com.aoher.model.impl;

import com.aoher.model.Castle;

public class ElfCastle implements Castle {

    public static final String DESCRIPTION = "This is the Elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
