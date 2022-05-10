package hu.meiit.haladojava.override;

public class Square extends ItemImplementation {

    private int length;

    public Square(int x, int y, int color, int length) {
        super(x, y, color);
        this.length = length;
    }

    @Override

    public void draw() {
        System.out.println("Square::draw " + this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                "} " + super.toString();
    }
}
