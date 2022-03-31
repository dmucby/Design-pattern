package Decorator;

/**
 * @author 余悸
 */

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        String addStateB = "B State";
        System.out.println("具体对象B的功能: " + addStateB);
    }

}
