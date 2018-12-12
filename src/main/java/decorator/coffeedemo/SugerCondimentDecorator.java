package decorator.coffeedemo;

import java.math.BigDecimal;

/**
 *
 * Created by Nero on 2018-12-12.
 */
public class SugerCondimentDecorator extends CondimentDecorator{

    public SugerCondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName()+",suger condiment.";
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal(20));
    }
}
