package hu.meiit.haladojava.liskov;

import java.security.InvalidParameterException;
import java.util.List;

public class Analize {
    public Double process(List<Integer> data) {

        assertNotNullData(data);
        assertNotZeroData(data);

        Double sum = 0.0;

        for (Integer item : data) {
            sum += item;
        }
        return sum / data.size();
    }

    protected void assertNotNullData(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            throw new InvalidParameterException("Measurements data cannot be negative");
        }
    }

    protected void assertNotZeroData(List<Integer> data) {
        for (Integer item : data) {
            if (item < 0) {
                throw new InvalidParameterException("Measurements data cannot be negative");
            }
        }
    }
}
