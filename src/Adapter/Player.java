package Adapter;

// 球员
public abstract class Player {
    /**
     * 球员名称
     */
    protected String name;

    public Player(String name){
        this.name = name;
    }

    /**
     * 攻防转换
     */
    public abstract void Attack();
    public abstract void Defense();
}
