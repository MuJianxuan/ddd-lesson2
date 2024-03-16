# ddd-lesson2

## 1.项目背景

这是DDD系列培训第2课配套案例，本案例虚构了某游戏的玩家数值的计算服务，用于计算和加工某些运营关心的值。

由于游戏的用户量很大，往往需要对数据进行定时归档和清理，归档后的数据一般无法直接在原数据库进行查询。

例如归档1年前的数据，只保留最近一年的数据，如果玩家在2年前的对局中首次获得了MVP，这个时候就无法查询到其首次获得MVP的时间了，或者查出来的结果并不准确。

数值计算服务可以不断地对玩家产生的数据进行加工计算，得到运营需要的值，业务需要这些值的时候不需要查询原始数据，直接通过数值计算服务进行获取。

例如数值计算服务会记录首次获得MVP的时间，业务不再需要查询原始数据。

上述场景，当然可以通过实时计算平台得到，在这里我们用来演示DDD。

## 2.核心用例

### 2.1 历史CP总数量计算

一些玩家通过游戏结识，在不断地携手战斗中培养出深厚地感情，最后成为好朋友或者CP，把炮火从游戏带到了现实。

产品经理希望能为每个玩家统计其历史CP的数量，将其作为玩家年度游戏报告的内容：
```text
您在过去的岁月里，一共与X位玩家组成CP，您的标签是“渣男”、“海王”、“绿茶”、“渣女”！

那些陪伴过你的人啊，他们如今都在哪里，你们还有联系吗？（类似煽情的文案）
```
![CP](assets/cp.png)

### 2.2 记录首次获得MVP的时间

首次获得MVP的时间经常是玩家年度游戏报告的内容，类似：

```text
xxxx年xx月xx日，你第一次获得MVP，江湖从此多事！
```

# 3. 作业

使用DDD对整个项目进行重构，包括应用架构和战术设计。

# 4.DDD交流

- 微信群

请添加以下微信加入DDD交流群

![微信群](assets/qr.jpg)

- 悟道领域驱动设计公众号

![公众号](assets/gzh.jpg)
