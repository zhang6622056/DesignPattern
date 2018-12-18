package decorator;

import decorator.coffeedemo.Beverage;
import decorator.coffeedemo.EspessoSpecificBeverage;
import decorator.coffeedemo.MochaCondimentDecorator;
import decorator.coffeedemo.SugerCondimentDecorator;
import org.junit.Test;

public class BeverageTest {


    /*****
     * 动态结构
     * 构建饮料对象。通过包裹，层层变更价格方法
     *
     * 好处在于将价格计算进行了职责化的划分，解耦，
     * 在新产品或者老产品进行变更的时候，只需要增加或者变更相应这部分的code即可
     */
    @Test
    public void test(){
        Beverage beverage = new EspessoSpecificBeverage();
        beverage = new MochaCondimentDecorator(beverage);
        beverage = new SugerCondimentDecorator(beverage);
        beverage = new SugerCondimentDecorator(beverage);
        System.out.println(beverage.cost());
    }






}
