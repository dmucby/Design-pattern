package Iterator;

/**
 * 迭代器抽象类
 * 构造统一接口
 */
public abstract class Iterator {
    /**
     * 得到开始对象
     * @return Object
     */
    public abstract Object First();

    /**
     * 得到下一个对象
     * @return Object
     */
    public abstract Object Next();

    /**
     * 判断下一个对象是否为空
     * @return bool值
     */
    public abstract boolean HasNext();

    /**
     * 获取当前对象
     * @return Object
     */
    public abstract Object CurrentItem();
}

/**
 * 聚集类的抽象
 */
abstract class Aggregate{
    public abstract Iterator CreateIterator();
}