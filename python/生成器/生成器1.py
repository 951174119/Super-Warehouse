# -*- coding: utf-8 -*-
"""
Created on Mon May  2 18:46:46 2022

@author: jiatianle
"""

def counter():
    i=0
    while i<=5:
        yield i
        i+=1
t=counter()

print(next(t))
print(next(t))
print(next(t))
print(next(t))
print(next(t))