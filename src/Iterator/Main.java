package Iterator;

/**
 * 个人实现
 */

public class Main {

    public static void main(String[] args) {

        ConcreteAggregate a = new ConcreteAggregate();

        a.Insert(0,"大鸟");
        a.Insert(1,"小菜");
        a.Insert(2,"行李");
        a.Insert(3,"老外");
        a.Insert(4,"公交内部员工");
        a.Insert(5,"小偷");

        Iterator i = new ConcreteIterator(a);

        Object item = i.First();
        System.out.println(item);

        while (!i.HasNext()) {
            System.out.println(i.CurrentItem() + " 请买车票");
            i.Next();
        }

    }
}
