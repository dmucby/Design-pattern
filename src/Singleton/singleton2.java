package Singleton;

/**
 * @author 余悸
 */
public class singleton2 {
    private final static singleton2 INSTANCE = new singleton2();

    private singleton2() {

    }

    public static singleton2 getInstance() {
       return INSTANCE;
    }

}
