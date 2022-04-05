package hu.meiit.haladojava.interface_principle.subpackage;

import hu.meiit.haladojava.interface_cache_example.CacheRead;
import hu.meiit.haladojava.interface_principle.HasznosInterface;

public class Hasznalat {

    private final CacheRead cacheRead;

    public Hasznalat(CacheRead cacheRead) {
        this.cacheRead = cacheRead;
    }

    public void run() {
        System.out.println("titok");
    }
}
