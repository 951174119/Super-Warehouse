# -*- coding: utf-8 -*-
"""
Created on Fri May 13 11:05:31 2022

@author: hp
"""

#程序计时应用
import time 
#测量时间：time.perf_counter()  返回一个CPU级别的精确时间计数值，单位为秒，由于这个计数值起点不确定，连续调用差值才有意义
a=time.perf_counter()
print(a)
b=time.perf_counter()
print(b)
print(b-a)
#产生时间：time.sleep()休眠
a=time.time()
time.sleep(2)
b=time.time()
print(b-a)

