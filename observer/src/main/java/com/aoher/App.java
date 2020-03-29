package com.aoher;

import com.aoher.model.CentralComp;
import com.aoher.model.Dashboard;

public class App {

    public static void main(String[] args) {
        CentralComp cp = new CentralComp(); //создаем центральный процессор
        Dashboard db = new Dashboard(cp);   //создаем приборную панель

        cp.changeData(10, 2000, 30);
        cp.changeData(20, 2500, 40);
        cp.changeData(60, 5000, 80);
    }
}
