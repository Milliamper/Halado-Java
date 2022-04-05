package hu.meiit.haladojava.interface_principle;

public class Hasznos implements HasznosInterface {

    MasikHasznos hasznos2;

    @Override
    public void valamiCool() {
        System.out.println("valami hasznos");
    }

    public void masik() {
        System.out.println("Másik metódus");
    }
}
