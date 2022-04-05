package hu.meiit.haladojava.openclosed_framework.user;

import hu.meiit.haladojava.openclosed_framework.BaseFlow;

public class PartiallyImplementedFlow extends BaseFlow {


    @Override
    public void step2() {
        System.out.println("PartiallyImplementedFlow");
        super.step2();
    }
}
