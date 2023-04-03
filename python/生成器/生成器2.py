# -*- coding: utf-8 -*-
"""
Created on Sat May  7 10:18:45 2022

@author: jiatianle
"""


a=(i for i in range(4,20))
print(next(a))
print(next(a))
print(next(a))
print(next(a))
print(next(a))
print('----------------')
for i in a:
    print(i)
print('----------------')
def A():
    x=1
    while x<20:
        yield x
        x+=1
g=A()
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print(next(g))
print('--------------')
for i in g:
    print(i)
    