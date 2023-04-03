# -*- coding: utf-8 -*-
"""
Created on Fri May 13 22:19:35 2022

@author: jiatianle
"""
#基本随机函数
import random
#random.seed(a=None)初始化给定的随机数种子，若无此函数则默认为当前系统时间
random.seed(1)
#random.random()生成一个[0.0，1.0）之间的随机小数,产生与种子有关
print(random.random())
print(random.random())
random.seed(1)
print(random.random())
print(random.random())
