package creational.builder;

/**
 * Created by lede on 8/23/16.
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
