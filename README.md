# -
用简单的Java开发的一个黄金矿工，但是现在还没完善，大家可以帮忙完善一下
现在时间限制和关数还没写，但是这两个比较简单，唯一需要确定的就是不同关卡我们需要确定不同的黄金和石头的比例。
其中GameWin是写了两个类，一个是main方法，另外一个是创建窗口，用于存放我们需要的背景，人物，黄金，石头等。并且也在函数里面使用了Random来随机分配大金块和小金块等，和使用鼠标控制我们的钩子钩。
BG就是background，用来确定我们的人物，上下背景(因为矿工的上面和下面是不同的背景)。
object就是Gold，GoldMini，Rock的父类，在这里定义了很多的参数。
line的话就是来控制钩子的状态。
===============================================================================================================================================================
在object中定义m是用来控制钩子回来的速度
然后count就是定义大黄金，小黄金和石头的价值，来确保我们的积分
line中确定钩子的状态是使用switch，到类里面看吧，不太想解释了。