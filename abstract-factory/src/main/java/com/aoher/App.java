package com.aoher;

import com.aoher.factory.FactoryMaker;
import com.aoher.factory.KingdomFactory;
import com.aoher.factory.KingdomType;
import com.aoher.model.Army;
import com.aoher.model.Castle;
import com.aoher.model.King;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    private King king;
    private Castle castle;
    private Army army;

    /**
     * Creates kingdom
     */
    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    public King getKing() {
        return king;
    }

    private void setKing(final King king) {
        this.king = king;
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    public Castle getCastle() {
        return castle;
    }

    private void setCastle(final Castle castle) {
        this.castle = castle;
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public Army getArmy() {
        return army;
    }

    private void setArmy(final Army army) {
        this.army = army;
    }


    /**
     * Program entry point.
     *
     * @param args
     *          command line args
     */
    public static void main(String[] args) {
        App app = new App();

        log.info("Elf Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(KingdomType.ELF));
        log.info(app.getArmy().getDescription());
        log.info(app.getCastle().getDescription());
        log.info(app.getKing().getDescription());

        log.info("Orc Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));
        log.info(app.getArmy().getDescription());
        log.info(app.getCastle().getDescription());
        log.info(app.getKing().getDescription());
    }
}
