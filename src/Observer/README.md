# 观察者模式

## Concept

发布-订阅模式，通过一个观察者来观察被订阅的主题，当主题发生变化后，为每一个订阅者发布新的消息。

> 获取信息的常用方式！

### application

* 公众号：推文
* 抖音：更新
* 查看共同关注



## Code 

### Design

<center> <B>观察者模式结构图（Observer）</B></center>

![观察者模式.drawio](https://personal-drawing-bed.oss-cn-beijing.aliyuncs.com/img/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F.drawio.png)

#### Description

* `Subject`:为通知者（时时监听消息）
  * 可增加观察者和删除观察者
  * `Notify` 负责发布消息
* `Observer`:观察者
  * 需要在获得所需消息时`Update`
* `State`:
  * 订阅
  * 未订阅
  * 已更新
  * 未更新



### Code Implementation

见仓库：https://github.com/dmucby/Design-pattern/tree/master/src/Observer



### Drawbacks

* 过于依赖抽象观察者

实际生产环境中，观察者千变万化，没有一个统一的定义接口，这时需要根据实际情况来进行消息通知。

#### Examples

在手机上，需要时时接受不同APP发送的消息，而这些APP又是不同公司制造的，他们已经制造好了相关的**通知**信息模板，不能再去改变，这时可以通过手机设置选项，来根据用户自定义的去调节。

## Event delegation

### Design

将具体需要通知的事件下放到客户端，有客户来决定需要监听的事件。

### Code

具体使用`Java`内置的`Event`组件，此处留坑，待填。 























