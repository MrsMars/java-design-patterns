package com.aoher.factory;

import com.aoher.model.Army;
import com.aoher.model.Castle;
import com.aoher.model.King;

public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();
}
