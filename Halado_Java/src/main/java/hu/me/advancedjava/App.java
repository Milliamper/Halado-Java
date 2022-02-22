package hu.me.advancedjava;

public class App {
    private static Integer getInt(String str, int order) {
        Integer rv = null;

        try {
            rv = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println(order + ". parameter type error (supported type: integer, f.e.: 5)");
        }
        return rv;
    }

    public static void main(String[] args) {
        Representation representation = new Representation(args);

        Operands operands = representation.getOperands();

        // parancssori argumentumok kiszedese
        Integer x = getInt(operands.getA(), 1);
        Integer y = getInt(operands.getB(), 2);

        if (x != null && y != null) {
            representation.printResult(new Service().calculate(x, y));
        }
    }
}
