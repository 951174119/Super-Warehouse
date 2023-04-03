# -*- coding: utf-8 -*-
"""
Created on Wed May 11 20:13:18 2022

@author: jiatianle
"""

#画布正中心坐标(0,0)     “海龟”默认起始点
#turtle.goto(x,y)让任何地方的“海龟”到达某一地方
#turtle.done()停止画笔绘制
#turtle.bye()关闭窗体（这两行可以防止画布无响应，使可以反复运行代码）
import turtle
turtle.goto(100,100)
turtle.goto(100,-100)
turtle.goto(-100,-100)
turtle.goto(-100,100)
turtle.goto(0,0)
turtle.done()
turtle.bye()

