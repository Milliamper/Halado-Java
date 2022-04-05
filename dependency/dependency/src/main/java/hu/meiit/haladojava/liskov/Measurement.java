package hu.meiit.haladojava.liskov;

import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<Integer> getData() {
        List result =  new ArrayList<>();
        result.add(-2);
        result.add(6);
        result.add(7);

        return result;
    }
}
