package hu.meiit.haladojava.openclosed_framework;

import hu.meiit.haladojava.openclosed_framework.user.Flow1;
import hu.meiit.haladojava.openclosed_framework.user.Flow2;
import hu.meiit.haladojava.openclosed_framework.user.PartiallyImplementedFlow;

public class BaseRunner {
    public static void main(String[] args) {
        run(new Flow1());
    }

    private static void run(BaseFlow baseFlow) {
        baseFlow.run();
    }
}
