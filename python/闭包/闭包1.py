# -*- coding: utf-8 -*-
"""
Created on Mon May  2 09:10:39 2022

@author: jiatianle
"""

def power(s):
    def of(x):
        return s**x
    return of
p=power(2)
print(p(5))