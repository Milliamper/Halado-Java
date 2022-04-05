package hu.meiit.haladojava.interface_cache_example;

public interface CacheWrite {
    void set(String name, int value);
    void clear();
    void delete(String name);
}
