# -*- coding: utf-8 -*-
"""
Created on Mon May  2 09:13:38 2022

@author: jiatianle
"""

def outer():
    x=0
    y=0
    def inner(s,d):
        nonlocal x,y
        x+=s
        y+=d
        print(x,y)
    return inner
move=outer()
move(1,2)
move(3,7)
move(1,9)