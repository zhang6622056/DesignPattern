package factory;

import factory.staticfactory.Apple;
import factory.staticfactory.Fruit;
import factory.staticfactory.FruitFactory;
import org.junit.Test;

public class FruitFactoryTest {


    /****
     *
     * 只关心执行，不关心类型
     * 获取抽象对象类型
     *
     */
    @Test
    public void test(){
        Fruit fruit = FruitFactory.newInstaceAbstract(1);
        fruit.getName();
    }


    /*****
     * 关心具体类型，
     * 获取具体类型
     */
    @Test
    public void test01(){
        Apple apple = FruitFactory.newInstance(Apple.class);
        apple.getName();
    }




}
