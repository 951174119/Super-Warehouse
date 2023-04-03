# -*- coding: utf-8 -*-
"""
Created on Sat May  7 17:05:42 2022

@author: jiatianle
"""

a={5,4,6,1,1,21,241,54,5,4}
a.add(100)#添加元素，若元素已经存在，则不添加
print(a)
a.remove(100)#删除元素，若不存在则引发异常
b=(1,2,4,44,55)
a.update(b)#将序列中的元素加入到集合,字典只添加键
print(a)
c={'a':4,'b':888}
a.update(c)
print(a)
a.clear()#清空集合