package creational.builder;

/**
 * Created by lede on 8/23/16.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
