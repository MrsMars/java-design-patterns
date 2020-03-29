package com.aoher.model.impl;

import com.aoher.model.Army;

public class OrcArmy implements Army {

    public static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
