package Adapter;

/**
 * 前锋
 */
class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("前锋" + this.name + "进攻");
    }

    @Override
    public void Defense() {
        System.out.println("前锋" + this.name + "防守");
    }
}

/**
 * 后卫
 */
class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("后卫" + this.name + "进攻");
    }

    @Override
    public void Defense() {
        System.out.println("后卫" + this.name + "防守");
    }
}

/**
 * 姚明
 */
class YaoMIng{
    private String name = "姚明";

    public YaoMIng(){}

    public void ChineseAttack(){
        System.out.println("姚明 中文 进攻");
    }

    public void ChineseDefense(){
        System.out.println("姚明 中文 防守");
    }

}

/**
 * 适配器
 * 翻译
 */
class Translator extends Player{
    private final YaoMIng yaoMIng = new YaoMIng();

    public Translator(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        yaoMIng.ChineseAttack();
    }

    @Override
    public void Defense() {
        yaoMIng.ChineseDefense();
    }
}


public class NbaPlayer {
    public static void main(String[] args) {
        Player player1 = new Forwards("巴蒂尔");
        player1.Attack();

        Player player2 = new Guards("麦迪");
        player2.Attack();

        Player player3 = new Translator("姚明");
        player3.Attack();
        player3.Defense();
    }
}
