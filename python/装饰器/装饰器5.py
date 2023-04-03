# -*- coding: utf-8 -*-
"""
Created on Mon May  2 18:59:09 2022

@author: jiatianle
"""

def decorator_a(func):
    print('Get in decorator_a')
    def inner_a(*args,**kwargs):
        print('Get in inner_a')
        return func(*args,**kwargs)
    return inner_a
def decorator_b(func):
    print('Get in decoratior_b')
    def inner_b(*args,**kwargs):
        print('Get in inner_b')
        return func(*args,**kwargs)
    return inner_b
@decorator_a
def f(x):
    print('Get in f')
    return x*2
f(1)
