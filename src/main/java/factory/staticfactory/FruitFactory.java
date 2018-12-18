package factory.staticfactory;


/*****
 *
 * 所谓工厂，也只是获取对象形象生动的说法罢了
 * 好处：使得创建对象与使用对象解耦，使用该方法进行对象的构建，使用者无需关心创建对象过程，
 * 在维护相应产品的同时不需要影响使用端
 *
 *
 *
 *
 * 需要对象
 * -抽象产品
 * -具体产品
 * -建造工厂
 *
 * 使用反射和范型来构造返回对象，这使得工厂代码更加简洁
 * 一处编写多处返回
 *
 */
public class FruitFactory {

    /***
     * 返回具体对象
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T newInstance(Class<? extends T> clazz){
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    /****
     * 返回抽象对象
     * @param fruitType
     * @return
     */
    public static Fruit newInstaceAbstract(int fruitType){
        if (fruitType == 1) return new Apple();

        if (fruitType == 2) return new Orange();

        return null;
    }









}
