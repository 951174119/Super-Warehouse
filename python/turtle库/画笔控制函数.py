
#turtle.penup()抬起画笔，轨迹不在画布上形成图案 别名turtle.pd()
#turtle.pendown()落下画笔，留下轨迹 别名turtle.pd()
#turtle.pensize(width)用来设置画笔宽度 别名turtle.width(width)
#别名和函数名之间是一致的，功能完全一样
#turtle.pencolor(color) color为颜色字符串或r,g,b值
#turtle.pencolor('purple')将画笔染成紫色
#turtle.pencolor(0.63,0.13,0.94)紫色  等价于turtle.pencolor((0.63,0.13,0.94))
import turtle
turtle.penup()
turtle.goto(100,100)
turtle.pendown()
turtle.pensize(20)
turtle.pencolor('yellow')
turtle.circle(50,150)
turtle.seth(180)
turtle.fd(200)
turtle.pencolor('blue')
turtle.circle(50,150)
turtle.seth(0)
turtle.fd(200)
turtle.done()
turtle.bye

