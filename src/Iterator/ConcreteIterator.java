package Iterator;

public class ConcreteIterator extends Iterator{

    /**
     * 定义一个具体聚集对象
     */
    private final ConcreteAggregate aggregate;

    /**
     * 定义索引
     */
    private int current = 0;

    /**
     * 初始化具体聚集对象
     * @param aggregate 聚集对象
     */
    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate = aggregate;
    }

    /**
     * @return 第一个对象
     */
    @Override
    public Object First() {
        return aggregate.getItems().get(0);
    }

    /**
     * 如果超出索引 返回空
     * 否则返回下一个对象
     * @return ret
     */
    @Override
    public Object Next() {
        Object ret = null;
        current++;
        if (current < aggregate.Count()) {
            ret = aggregate.getItems().get(current);
        }
        return ret;
    }

    /**
     * 判断是否还有对象
     * @return true or false
     */
    @Override
    public boolean HasNext() {
        return current >= aggregate.Count();
    }

    /**
     * @return 当前对象
     */
    @Override
    public Object CurrentItem() {
        return aggregate.getItems().get(current);
    }

}
