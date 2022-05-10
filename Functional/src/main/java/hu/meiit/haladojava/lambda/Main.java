package hu.meiit.haladojava.lambda;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

import static jdk.internal.org.jline.utils.Colors.s;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        Function<Integer, Integer> fgv = a -> a * 3;

        Main main = new Main();
        main.printResult(fgv);

        main.printResult(() -> Math.random());

        Predicate<String> notEmpty = s -> !s.trim().isEmpty();
        Predicate<String> notContainsY = s -> s.indexOf('Y') != -1;

        Predicate<Integer> isGreaterThan0 = number -> number > 0;

        Function<String, Integer> string2int = item -> item.length();

        main.kiIrHaOk(notEmpty.and(notContainsY), "qwertY222");

        // ez ugyanaz
        List<String> list = new ArrayList<>();
        List<Integer> lengthList = list.stream()
                .map(string2int) // mindig struktúrát kap a map
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        // mint ez
        List<Integer> lList = new ArrayList<>();
        for(String item : list ) {
            int length = item.length();
            if (length> 0) {
                lList.add(length);
            }
        }


        //Function<String, Integer> fv = (aa) ->{return aa.length();};
        //fv = Main::length;
        //Integer value2 = nameMap.computeIfAbsent("John", identifier2 -> 3);

//        main.dataIn(Main.dd);
//        main.dataIn( (data) ->);

        main.kiIrHaOk(s -> !s.trim().isEmpty(), " ");

        // -------------------------------------------------------------

        List<User> userList = new ArrayList<>();

        userList.stream().map(user -> new UserDTO(user)).collect(Collectors.toList()); // entitás osztály példányaiból DTO példányokat csinál

    }

    public static void dd(Double d) {
        System.out.println(d);
    }

    public static int length(String s) {
        return s.length();
    }

    public static int random(int a) {
        return (int) Math.random() * a;
    }

    private int v(String s) {
        return s.indexOf('d');
    }

    private void printResult(Function<Integer, Integer> fv) {
        int result = fv.apply(5);
        System.out.println(result);
    }

    private void printResult(Supplier<Double> fv) { // fv aminek nincs paramétere, nem fogad értéket de ad kimenetet
        Double result = fv.get();
        System.out.println(result);
    }

    private void printResult(DoubleSupplier fv) {
        Double result = fv.getAsDouble();
        System.out.println(result);
    }

    private void dataIn(Consumer<Double> fv) {
        fv.accept(8.0);
    }

    private void kiIrHaOk(Predicate<String> pred, String s) {
        if (pred.test(s)) {

            System.out.println("-" + s + "-");
        }

    }
}
