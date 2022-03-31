package FactoryMethod;

public class ConcreteCreator implements Creator{

    @Override
    public Product FactoryMethod() {
        System.out.println("具体工厂创建了具体产品");
        return new ConcreteProduct();
    }
}
