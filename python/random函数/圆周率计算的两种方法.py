# -*- coding: utf-8 -*-
"""
Created on Sat May 14 14:34:11 2022

@author: jiatianle
"""

#圆周率的计算
#圆周率的近似计算公式

pi=0
N=100
for k in range(N):
    pi+=1/pow(16,k)*(4/(8*k+1)-2/(8*k+4)-1/(8*k+5)-1/(8*k+6))
print('圆周率值是：{:.50f}'.format(pi))
print('\n')
#蒙特卡罗方法
import random
import time
DARTS=1000*1000#抛洒点的总数量
hits=0.0#在圆内部的点
start=time.perf_counter()
for i in range(1,DARTS+1):
    x,y=random.random(),random.random()
    dist=pow(x**2+y**2,0.5)#求点到圆心的距离
    if dist<=1.0:
        hits=hits+1
pi=4*(hits/DARTS)
print('圆周率值是：{:.50f}'.format(pi))
print('运行时间是：{:.5f}s'.format(time.perf_counter()-start))
