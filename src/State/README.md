# 状态模式

## Scenario

* 判断过多，责任过大
* 不同判断对应不同的行为



## Structure

<center> <B>状态模式结构图（State）</B></center>



![状态模式.drawio](https://personal-drawing-bed.oss-cn-beijing.aliyuncs.com/img/%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F.drawio.png)



> * `Context`：管理状态
> * `State`：定义状态切换
> * `ConcreteState`：定义状态具体行为和切换条件



### Code

见仓库：https://github.com/dmucby/Design-pattern/tree/master/src/State



## Apply

* 对应复杂的场景切换
* 显著减少代码长度
