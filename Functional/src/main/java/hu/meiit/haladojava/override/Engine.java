package hu.meiit.haladojava.override;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    List<Item> itemList = new ArrayList<>();

    void addItem(Item item) {
        itemList.add(item);
    }

    void remove(Item item) {
        itemList.remove(item);
    }

    void draw() {
        for (Item item : itemList) {
            item.draw();
        }
    }
}
