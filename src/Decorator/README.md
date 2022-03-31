# 装饰模式

### **核心：**：

> * 动态地添加更多功能的一种方式
> * 把新的功能分装到一个新的类中
> * 主类仅需考虑如何添加和如何删除功能
> * 在功能类中写明详细的规则



### 特点：

> * 将装饰和功能分离，各类职责分明
> * 符合开闭原则，利于动态的管理功能
> * 避免重复代码



### 常用模板


**<center>装饰模式结构图（Decorator）</center>**


![image](https://user-images.githubusercontent.com/80476712/160964043-5c2a33cc-b15f-420c-a4eb-573aaf8619e4.png)


#### 1. 结构说明：

> * `Component`类：定义对象接口
>   * 给对象动态的添加功能。
>
> * `Decorator`：抽象功能接口，定义添加规范
>   * 扩展`Component`类的功能，`Component`不知道它的存在。
> * `ConreteComponent`：一个具体的对象
>   * 为对象添加具体的职能。
> * `ConcreteDecorator`：具体功能类



#### 2.具体类的结构：

* 见代码

#### 3. 执行顺序

1. 一层层往特定功能类加上上一层的功能
2. 执行最后一个功能的`opration`方法
3. 执行`b.super.opration`
4. 此时b的`Component`为`ConcreteDecoratorA`
5. 执行`a.opration()`
6. 执行`a.super.opration()`
7. 执行最初的父类接口的`opration`
8. 逐步执行父类接口、a特定功能、b特定功能



#### 4 .注意：

1. 具体功能类首先要执行`Componenet`接口的装饰功能，在执行本类的功能
2. 重在装饰，先要执行先前自身已有的功能
