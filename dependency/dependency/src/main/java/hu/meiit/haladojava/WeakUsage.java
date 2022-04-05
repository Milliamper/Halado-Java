package hu.meiit.haladojava;

import hu.meiit.haladojava.general.impl.Worker;

public class WeakUsage extends Worker { // és ez is egy függőség

    Worker worker; // ez már egy függőség. Tartalmazás

    WeakUsage() {
        this.worker = new Worker(); // jó megoldás, csak nem lehet tesztelni. Merev kód
    }

    public void hello(Worker worker) { // ez is függőség. Ismeretség

    }


}
