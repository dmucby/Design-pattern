package Composite;

public class Leaf extends  Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Display(int depth){
        for (int i = 0; i < depth-1; i++) {
            System.out.print("-");
        }
        System.out.println("-"+ name);
    }
}
