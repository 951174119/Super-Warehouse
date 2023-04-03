# -*- coding: utf-8 -*-
"""
Created on Wed May  4 21:46:04 2022

@author: jiatianle
"""

def add(x,y):
    return x+y
import functools
c=functools.reduce(add,[1,2,3,4,5])
print(c)
print(add(add(add(add(1,2),3),4),5))
c=functools.reduce(lambda x,y:x*y, range(1,10))
print(c)