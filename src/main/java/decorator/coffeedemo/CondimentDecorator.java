package decorator.coffeedemo;

/**
 * Created by admin on 2018-12-12.
 */
public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;


    public abstract String getName();
}
