package hu.meiit.haladojava.openclosed_framework.user;

import hu.meiit.haladojava.openclosed_framework.BaseFlow;

public class Flow1 extends BaseFlow {
    @Override
    public void step1() {
        System.out.println("Flow1 step1");
    }

    @Override
    public void step2() {
        System.out.println("Flow1 step2");
    }
}
