# 适配器模式

## 介绍

为解决兼容性问题而符合客户要求而使用的设计模式。

* 继承
* 权限设计



## 使用场景

* 当修改双方代码困难时
* 使用第三方组件
* 为第三方提供服务



## 结构图

<center>适配器模式（Adapter）结构图</center>

![适配器模式.drawio](https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/typroa/3046/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F.drawio.png)

### 说明

* `Target`是用户期待的接口
* `Adaptee`是需要适配的类
* `Adapter`将源接口转换为目标接口



## 注意

* 只有当必须重构代码或需要重大修改时才使用适配器
  * 数据源：
    * SQL Server
    * Oracle
    * MySQL
  * 使用第三方插件(再次封装)
    * VUE
    * React
* 适配器只是程序员的一种妥协
