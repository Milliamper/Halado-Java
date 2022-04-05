package hu.meiit.haladojava.liskov;

import java.util.List;

public class Experiment {
    public static void main(String[] args){
        List<Integer> data = new Measurement().getData();
        System.out.println(new Analize().process(data));
    }
}
