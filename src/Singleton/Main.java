package Singleton;

/**
 * @author 余悸
 */

public class Main {
    public static void main(String[] args) {

        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();

        if(s1 == s2){
            System.out.println("两个对象相同");
        }

        new Thread(() -> {
            singleton2 s4 = singleton2.getInstance();
            System.out.println(s4);
        }).start();

        new Thread(() -> {
            singleton2 s5 = singleton2.getInstance();
            System.out.println(s5);
        }).start();
    }
}
