package Decorator;

/**
 * @author 余悸
 */

public class Main {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        a.setComponent(c);
        b.setComponent(a);
        b.operation();

        System.out.println("装饰模式完成");
    }
}
