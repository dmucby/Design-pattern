package Adapter;

/**
 * 客户需要的接口
 */
class Target{
    public void Request(){
        System.out.println("客户需要的接口 " + this.getClass());
    }
}

/**
 * 需要适配的类
 */
class Adaptee{
    public void SpecificRequest(){
        System.out.println("生产出的接口 "+ this.getClass());
    }
}

/**
 * 适配器
 */
class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        System.out.println("调用适配器");
        adaptee.SpecificRequest();
    }
}

public class AdapterDesign {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.Request();
    }
}
