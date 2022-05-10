package hu.meiit.haladojava.override;

public abstract class ItemImplementation implements Item {
    private int x;
    private int y;
    private int color;

    public ItemImplementation(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ItemImplementation{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
