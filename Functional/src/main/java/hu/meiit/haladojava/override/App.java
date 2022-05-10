package hu.meiit.haladojava.override;

/**
 * Hello world!
 *
 */
public class App 
{
    //felüldefiniálás lényege:
    public static void main( String[] args )
    {
        Engine engine = new Engine();

        engine.addItem(new Circle(10,10,3,12));
        engine.addItem(new Circle(50,19,4,6));
        engine.addItem(new Square(12,33,5,3));
        engine.addItem(new Square(44,21,6,18));

        engine.draw();
    }

}
