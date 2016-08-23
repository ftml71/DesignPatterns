package creational.factory;

/**
 * Created by lede on 8/23/16.
 */
public class ShapeFactory {

    public Shape getShape (String shapeType) {
        if(shapeType==null) {
            return null;
        } else if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equals("square")) {
            return new Square();
        }

        return null;
    }
}
