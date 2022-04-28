package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Java 底层封装
 */
public class MainUtil {

    public static void main(String[] args) {

        List<Object> a = new ArrayList<>();
        a.add("小菜");
        a.add("行李");
        a.add("老外");
        a.add("公交内部员工");
        a.add("小偷");

        Iterator it = a.iterator();
        String next = null;

        
        while (it.hasNext()){
           next = (String) it.next();
            System.out.println(next + " 请买车票");
        }
    }
}
