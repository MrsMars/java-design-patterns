package com.aoher.factory.impl;

import com.aoher.factory.KingdomFactory;
import com.aoher.model.Army;
import com.aoher.model.Castle;
import com.aoher.model.King;
import com.aoher.model.impl.ElfArmy;
import com.aoher.model.impl.ElfCastle;
import com.aoher.model.impl.ElfKing;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
