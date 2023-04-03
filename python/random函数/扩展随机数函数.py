# -*- coding: utf-8 -*-
"""
Created on Fri May 13 22:33:54 2022

@author: jiatianle
"""

#扩展随机数函数
import random
#random.randint(a,b)生成一个[a,b]之间的整数
print(random.randint(10,20))
#random.randrange(m,n,k)生成一个[m,n)之间以k为步长的随机整数
print(random.randrange(5,100,10))
#random.getrandbits(k)生成一个k比特长(二进制位数)的随机整数
print(random.getrandbits(12))
#random.uniform(a,b)生成一个[a,b]之间的随机小数
print(random.uniform(5, 10))
#random.choice(seq)从序列seq中随机选择一个元素
print(random.choice(['a',21,54,545,'sd']))
#random.shuffle(seq)将序列seq中元素随机排列，返回打乱后的序列
a=['a','d',1,5,6,7]
b=random.shuffle(a)
print(a)
print(b)





