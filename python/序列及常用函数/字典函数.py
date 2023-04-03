# -*- coding: utf-8 -*-
"""
Created on Sat May  7 16:44:33 2022

@author: jiatianle
"""

a=(1,2,5,4,7,44,1,5)
print(sorted(a,key=lambda x:x))
print(sorted(a,key=lambda x:x%2))#返回一个以后面函数返回值排序的列表(从小到大)
b={'a':1,'b':2,'c':4}
print(b.get('a',10))#若存在键则返回对应元素的值，否则返回后面的值
print(b.get('d',10))
print(b.items())#取字典的元素序列，可用于遍历字典
for i in b:
    print(i)
for i in b.items():
    print(i)
for i in b.items():
    print(list(i)[1])
print(b.keys())#取字典的键的序列
for i in b.keys():
    print(i)
print(b.pop('a'))#删除对应元素，若没有则引发异常
print(b)
print(b.clear())#清空字典

