package com.aoher.factory;


import com.aoher.factory.impl.ElfKingdomFactory;
import com.aoher.factory.impl.OrcKingdomFactory;

/**
 * The factory of kingdom factories.
 */
public class FactoryMaker {

    /**
     * The factory method to create KingdomFactory concrete objects.
     */
    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }

    private FactoryMaker() {
    }
}
