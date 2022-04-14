package HomeWork.Singleton;

public class Instance {
    private static  Instance instance;

    private Instance() {

    }

    static class BombedMazeFactory extends Instance{

    }

    static class EnchantedMazeFactory extends Instance{

    }

    static class MazeFactory extends Instance{

    }

    public Instance getInstance(String name){
        if (instance == null) {
            if (name == null) {
                return null;
            }else {
                if (name.equals("bombed")) {
                    instance = new BombedMazeFactory();
                }else if(name.equals("enchanted")){
                    instance = new EnchantedMazeFactory();
                }
                // other instance
                else {
                    instance = new MazeFactory();
                }
            }
        }
        return instance;
    }

}
