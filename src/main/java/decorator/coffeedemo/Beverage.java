package decorator.coffeedemo;

import java.math.BigDecimal;

/**
 * the Beverage Base
 * Created by nero on 2018-12-12.
 */
public abstract class Beverage {
    String beverageName = "unknown beverage name...";

    public String getName(){
        return beverageName;
    }

    public abstract BigDecimal cost();
}
