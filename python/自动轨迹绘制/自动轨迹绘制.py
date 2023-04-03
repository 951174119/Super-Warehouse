#自动轨迹绘制
#需求：根据脚本来绘制图形
#不是写代码而是写数据绘制轨迹
#数据脚本是自动化最重要的第一步
#基本思路
#步骤一：定义数据文件格式（接口）
#步骤二：编写程序，根据文件接口解析参数绘制图形
#步骤三：编制数据文件
import turtle as t
t.title('自动轨迹绘制')
t.setup(800,600,0,0)
t.pencolor('spring green')
t.pensize(5)
#数据读取
datals=[]
f=open('data.txt')
for line in f:
    line=line.replace('\n','')#将换行符转化为空字符
    datals.append(list(map(eval,line.split(','))))#eval可以将'去掉，使元素都变成数字
f.close()
print(datals)
#自动绘制
for i in range(len(datals)):
    t.pencolor(datals[i][3],datals[i][4],datals[i][5])
    t.fd(datals[i][0])
    if datals[i][1]:
        t.right(datals[i][2])
    else:
        t.left(datals[i][2])
t.done()
t.bye