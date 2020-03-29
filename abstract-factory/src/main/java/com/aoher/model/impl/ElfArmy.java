package com.aoher.model.impl;

import com.aoher.model.Army;

public class ElfArmy implements Army {

    public static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
