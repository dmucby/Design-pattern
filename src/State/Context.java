package State;

public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("ε½εηΆζ:" + state.getClass().getName());
    }

    public void Request(){
        state.Handle(this);
    }

}
