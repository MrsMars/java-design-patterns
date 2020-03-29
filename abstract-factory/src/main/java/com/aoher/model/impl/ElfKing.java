package com.aoher.model.impl;

import com.aoher.model.King;

public class ElfKing implements King {

    public static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
