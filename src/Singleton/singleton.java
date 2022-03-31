package Singleton;

/**
 * @author 余悸
 */

public class singleton {

    private volatile static singleton instance;

    private singleton() {
        System.out.println("生成唯一对象");
    }

    public static singleton getInstance() {
        if (instance == null) {
            synchronized (singleton.class) {
                if (instance == null) {
                    instance = new singleton();
                } else {
                    System.out.println("只能创建一个产品");
                }
            }
        }
        return instance;
    }

}
