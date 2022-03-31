package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Creator c = new ConcreteCreator();
        Product p = c.FactoryMethod();
        System.out.println(p);
    }
}
