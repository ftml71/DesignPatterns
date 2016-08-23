package creational.singleton;

/**
 * Created by lede on 8/23/16.
 */
public class SingleObject {

    private static class SingleObjectWrapper {
        private static SingleObject instance = new SingleObject();
    }

    private SingleObject(){}

    public synchronized static SingleObject getInstance() {
        return SingleObjectWrapper.instance;
    }

    public void showMessage() {
        System.out.println("Hello Singleton!");
    }
}
