package Decorator;

/**
 * @author 余悸
 */

public class ConcreteDecoratorA extends Decorator{

    @Override
    public void operation() {
        super.operation();
        String addStateA = "A State";
        System.out.println("具体对象A的功能: " + addStateA);
    }

}
