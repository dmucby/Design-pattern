package Observer;

public class ConcreteObserver extends Observer{

    private final String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    void Update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者 "+name+" 的状态是:"+observerState);
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
}
