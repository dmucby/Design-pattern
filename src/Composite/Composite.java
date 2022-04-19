package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component c){
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth){
        for (int i = 0; i < depth-1; i++) {
            System.out.print("-");
        }

        System.out.println("-"+ name);

        for (Component c : children) {
            c.Display(depth  + 2);
        }
    }

}
