package com.aoher;

import com.aoher.adapter.CarAdapter;
import com.aoher.model.BasicCar;
import com.aoher.model.impl.AudiA3;
import com.aoher.model.impl.AudiA3Rus;
import com.aoher.processor.CentralProcessor;

public class App {

    public static void main(String[] args) {
        BasicCar audiA3 = new AudiA3();
        CentralProcessor cp = new CentralProcessor(audiA3);
        cp.work();

        CarAdapter audiA3Rus = new CarAdapter(new AudiA3Rus());
        CentralProcessor cpRus = new CentralProcessor(audiA3Rus);
        cpRus.work();
    }
}
