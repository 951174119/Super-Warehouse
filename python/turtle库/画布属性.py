# -*- coding: utf-8 -*-
"""
Created on Tue May 17 18:05:02 2022

@author: jiatianle
"""

#turtle.screensize(canvwidth=None,canvheight=None,bg=None)
#canvwidth -- 正整型数，以像素表示画布的新宽度值

#canvheight -- 正整型数，以像素表示画面的新高度值

#bg -- 颜色字符串或颜色元组，新的背景颜色
import turtle
turtle.screensize(800,600, "green")
turtle.screensize() #返回默认大小(400, 300)
1
2
3
4
5
6
7
8
9
turtle.setup(width=0.5, height=0.75, startx=None, starty=None)
#width -- 如为一个整型数值，表示大小为多少像素，如为一个浮点数值，则表示屏幕的占比；默认为屏幕的 50%

#height -- 如为一个整型数值，表示高度为多少像素，如为一个浮点数值，则表示屏幕的占比；默认为屏幕的 75%

#startx -- 如为正值，表示初始位置距离屏幕左边缘多少像素，负值表示距离右边缘，None 表示窗口水平居中

#starty -- 如为正值，表示初始位置距离屏幕上边缘多少像素，负值表示距离下边缘，None 表示窗口垂直居中




turtle.setup(500,500)
turtle.done()
turtle.bye

