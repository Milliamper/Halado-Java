package hu.meiit.haladojava.openclosed.badpattern;

public class BigQuestion {
    public int get(int value) {
        int result;
        boolean odd = value % 2 == 0;

        if (value<0){
            return -1;
        }

        if (value > 35) {
            if(value == 100) {
                result = (int)(Math.sqrt(value));
            }
            result = value;
        } else {
            result = 0;
        }
        return 0;
    }
}
