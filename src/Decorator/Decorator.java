package Decorator;

/**
 * @author 余悸
 */

public abstract class Decorator extends Component{

    Component component;

    /**
     * 设置Component
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 如果存在该对象 则执行相关的操作
     * 实际上执行 component的装饰方法
     */
    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }

}