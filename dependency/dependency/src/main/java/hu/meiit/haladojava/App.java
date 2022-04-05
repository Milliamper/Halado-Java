package hu.meiit.haladojava;

import hu.meiit.haladojava.general.impl.HardWorker;
import hu.meiit.haladojava.general.impl.NewWorker;
import hu.meiit.haladojava.openclosed.badpattern.BigQuestion;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println(new BigQuestion().get(42));

    }

}
