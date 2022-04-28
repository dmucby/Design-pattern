package HomeWork.Composite;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic{
    private List<Graphic> children = new ArrayList<Graphic>();

    @Override
    public void Draw() {
        System.out.println("开始画出图片");
        for (Graphic g:children) {
            g.Draw();
        }
    }

    @Override
    public void Add(Graphic g) {
        children.add(g);
    }

    @Override
    public void Remove(Graphic g) {
        children.remove(g);
    }

    @Override
    public void GetChild(int depth) {
        System.out.println(depth);

        for (Graphic g:children) {
            g.GetChild(depth+1);
        }
    }

}
