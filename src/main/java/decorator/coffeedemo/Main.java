package decorator.coffeedemo;

/**
 * decorator pattern
 * -摒弃多继承引起的臃肿，对包装对象进行修改关系，动态增加功能
 * -对于抽象基类的考量尤其关键，由于调味品属于咖啡价格的一种，所以继承咖啡基类，本例中 咖啡的共同点为名称和价格，
 * -对于被装饰对象维护在基类中比较重要
 *
 * 适用场景-对被装饰对象动态的增加功能，而不用修改已经存在的源码
 * Created by Nero on 2018-12-12.
 */
public class Main {


    public static void main(String[] args) {
        Beverage beverage = new EspessoSpecificBeverage();
        beverage = new MochaCondimentDecorator(beverage);
        beverage = new MochaCondimentDecorator(beverage);
        beverage = new SugerCondimentDecorator(beverage);
        System.out.println(beverage.getName());
        System.out.println(beverage.cost());
    }
}
