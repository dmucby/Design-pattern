package Observer;


import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    void Attach(Observer observer){
        observers.add(observer);
    }
    void Detach(Observer observer){
        observers.remove(observer);
    }
    void Notify(){
        for (Observer observer : observers) {
            observer.Update();
        }
    }
}
