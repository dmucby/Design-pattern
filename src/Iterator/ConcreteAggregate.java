package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{

    private final List<Object> items = new ArrayList<>();

    public List<Object> getItems() {
        return items;
    }

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }

    public int Count(){
        return items.size();
    }

    public void Insert(int index,Object value){
        items.add(index, value);
    }

}
