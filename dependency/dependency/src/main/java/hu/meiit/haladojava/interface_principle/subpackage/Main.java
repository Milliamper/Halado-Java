package hu.meiit.haladojava.interface_principle.subpackage;

import hu.meiit.haladojava.interface_cache_example.Cache;
import hu.meiit.haladojava.interface_principle.Hasznos;
import hu.meiit.haladojava.interface_principle.Hasznos2;

public class Main {
    public static void main(String[] args) {
       Cache cache = new Cache();

       cache.set("titok", 111);

       Hasznalat hasznalat = new Hasznalat(cache);
       hasznalat.run();
    }
}
