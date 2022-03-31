# 单例模式



### 介绍：


* 保证全局只有一个唯一类
* 并提供一个公开访问的方法



### 优点：

1. 确保唯一性
2. 创建过程被隐藏
3. 将创建的责任绑定给自己



### 结构图：

**<center>单例模式（Singleton）结构图</center>**

![image](https://user-images.githubusercontent.com/80476712/160964589-acb55b5a-5b56-4c75-a854-4053bd62ea5f.png)

##### 说明：

* 一个全局访问的静态方法
* 全局可访问对象



### 实现：


##### 单例代码：
* 见存储库



##### 多线程控制：

* 加锁控制，确保只生成一个实例
* 当其他线程试图创建新的实例时，一直被锁定。



##### 双重锁定：

* 先进行判断是否实例为空
* 再进行加锁

> 为什么已判断为空，加锁后还要判断？

**为了保证之创建一个实例，当前一个线程创建后，后一个线程还要继续一次判断，发现已创建实例，则跳出，保证了对象的唯一性。**

> 代码实现：

```java
 if (instance == null) {
    lock.lock();
    try {
        if (instance == null) {
            instance = new singleton();
        } else {
            System.out.println("只能创建一个产品");
        }
    } finally {
        lock.unlock();
    }
}
```



### 初始化分类：

* 饿汉式：初始化方式加载时就创建实例
* 懒汉式：引用时才创建实例



##### 饿汉式实现：

**静态初始化：静态代码块加载**

```java
public class singleton2 {
    private final static singleton2 INSTANCE = new singleton2();

    private singleton2() {

    }

    public static singleton2 getInstance() {
       return INSTANCE;
    }

}
```

```java
 new Thread(() -> {
            singleton2 s4 = singleton2.getInstance();
            System.out.println(s4);
        }).start();

        new Thread(() -> {
            singleton2 s5 = singleton2.getInstance();
            System.out.println(s5);
        }).start();
```

**优点：**

* 避免多线程，保证线程安全
* 没有加锁，实现简单



##### 懒汉式实现线程安全：

* volatile：
* synchronized:

```java
private volatile static singleton instance;

public static singleton getInstance() {
        if (instance == null) {
            # 对类上锁 减小锁的范围
            synchronized (singleton.class) {
                if (instance == null) {
                    instance = new singleton();
                } else {
                    System.out.println("只能创建一个产品");
                }
            }
        }
        return instance;
    }
```



### 参考内容

参考博客：https://blog.csdn.net/weixin_41979002/article/details/123002779
