# -*- coding: utf-8 -*-
"""
Created on Fri May 13 19:38:36 2022

@author: jiatianle
"""

#文本进度条
#采用字符串方式打印可以动态变化的文本进度条
#进度条需要能在一行中逐渐变化
#采用sleep()模拟一个持续的进展
import time
scale=10
print('------执行开始------')
for i in range(scale+1):
    a='*'*i
    b='.'*(scale-i)
    c=(i/scale)*100
    print('{:^3.0f}%[{}->{}'.format(c,a,b))
    time.sleep(0.1)
print('------执行结束------')