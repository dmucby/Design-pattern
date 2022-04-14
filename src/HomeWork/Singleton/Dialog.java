package HomeWork.Singleton;

public class Dialog {
    private static Dialog instance;

    private Dialog(){

    }

    public static Dialog getInstance() {
        if (instance == null) {
            return new Dialog();
        }
        return instance;
    }
}
