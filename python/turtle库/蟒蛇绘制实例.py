#turtle.penup()抬起画笔，轨迹不在画布上形成图案 别名turtle.pd()
#turtle.pendown()落下画笔，留下轨迹 别名turtle.pd()
#turtle.pensize(width)用来设置画笔宽度 别名turtle.width(width)
#别名和函数名之间是一致的，功能完全一样
#turtle.pencolor(color) color为颜色字符串或r,g,b值
#turtle.pencolor('purple')将画笔染成紫色
#turtle.pencolor(0.63,0.13,0.94)紫色  等价于turtle.pencolor((0.63,0.13,0.94))

import turtle as t
t.setup(650,350,200,200)
t.penup()
t.fd(-250)
t.pendown()
t.pensize(25)
t.pencolor("purple")
t.seth(-40)
for i in range(4):
    t.circle(40,80)
    t.circle(-40,80)
t.circle(40,80/2)
t.fd(40)
t.circle(16,180)
t.fd(40 * 2/3)
t.done()
t.bye
