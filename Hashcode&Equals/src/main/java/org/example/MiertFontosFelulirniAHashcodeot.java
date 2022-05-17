package org.example;

import java.util.HashMap;
import java.util.Map;

public class MiertFontosFelulirniAHashcodeot {

    int amount;
    String currency;

    public MiertFontosFelulirniAHashcodeot(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MiertFontosFelulirniAHashcodeot that = (MiertFontosFelulirniAHashcodeot) o;

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
        Map<MiertFontosFelulirniAHashcodeot, String> placeOfBalance = new HashMap<>();
        placeOfBalance.put(new MiertFontosFelulirniAHashcodeot(1000, "HUF"), "credit card");
        placeOfBalance.put(new MiertFontosFelulirniAHashcodeot(1000, "USD"), "wallet");
        placeOfBalance.put(new MiertFontosFelulirniAHashcodeot(1000, "EUR"), "piggy bank");

        MiertFontosFelulirniAHashcodeot myExample = new MiertFontosFelulirniAHashcodeot(1000, "HUF");
        String balancePlace = placeOfBalance.get(myExample);
        System.out.println(balancePlace);
        // ha nem írjuk felül a hashcode-ot akkor null-t kapunk vissza
        // ha szeretnénk használni az osztály példányait hashmap kulcsonként, akkor felül kell írni a hashcode-ot

    }
}
