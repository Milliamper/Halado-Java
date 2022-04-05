package hu.meiit.haladojava;

import hu.meiit.haladojava.general.impl.Worker;

public class Director {

    private final Worker worker;

    public Director(Worker worker) {
        this.worker = worker;
    }

    public void doIt(int value) {
        if (value > 0)  {
            this.worker.test();
        }
    }
}
