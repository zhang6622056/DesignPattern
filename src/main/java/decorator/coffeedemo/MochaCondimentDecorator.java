package decorator.coffeedemo;

import java.math.BigDecimal;

/**
 *
 * Created by Nero on 2018-12-12.
 */
public class MochaCondimentDecorator extends CondimentDecorator{

    public MochaCondimentDecorator(Beverage beverage) {
            this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName()+",mocha...";
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal(30));
    }
}
