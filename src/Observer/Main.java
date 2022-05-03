package Observer;

public class Main {
    public static void main(String[] args) {

        ConcreteSubject s = new ConcreteSubject();

        s.Attach(new ConcreteObserver("X",s));
        s.Attach(new ConcreteObserver("Y",s));
        s.Attach(new ConcreteObserver("Z",s));

        s.setSubjectState("ABC");
        s.Notify();

    }
}
