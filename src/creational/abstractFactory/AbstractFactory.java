package creational.abstractFactory;

/**
 * Created by lede on 8/23/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
