package com.aoher.factory.impl;

import com.aoher.factory.KingdomFactory;
import com.aoher.model.Army;
import com.aoher.model.Castle;
import com.aoher.model.King;
import com.aoher.model.impl.OrcArmy;
import com.aoher.model.impl.OrcCastle;
import com.aoher.model.impl.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}