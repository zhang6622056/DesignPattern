package decorator.coffeedemo;

import java.math.BigDecimal;

/**
 * Created by Nero on 2018-12-12.
 */
public class EspessoSpecificBeverage extends Beverage{


    public EspessoSpecificBeverage() {
        beverageName = "espresso";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(10);
    }
}
