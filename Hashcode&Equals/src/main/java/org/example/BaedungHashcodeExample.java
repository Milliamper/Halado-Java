package org.example;

public class BaedungHashcodeExample {

    int amount;
    String currency;

    public BaedungHashcodeExample(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // ha felülírjuk az equalst, akkor nem csak objektum azonosító alapján hasonlít össze, hanem a értéket is figyelembe vesz
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaedungHashcodeExample that = (BaedungHashcodeExample) o;

        if (amount != that.amount) return false;
        return currency != null ? currency.equals(that.currency) : that.currency == null;
    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        BaedungHashcodeExample income = new BaedungHashcodeExample(1000, "HUF");
        BaedungHashcodeExample expenses = new BaedungHashcodeExample(1000, "HUF");

        boolean balanced = income.equals(expenses);
        System.out.println(balanced);




    }

}
