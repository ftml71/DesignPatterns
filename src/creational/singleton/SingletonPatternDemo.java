package creational.singleton;

/**
 * Created by lede on 8/23/16.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
//        SingleObject object = new SingleObject(); //compile error
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
