package Composite;

public abstract class Component {
    String name;

    public Component(String name){
        this.name = name;
    }

    public  void Add(Component component){}
    public void Remove(Component c) {}
    public void Display(int depth){}

}

