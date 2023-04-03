# -*- coding: utf-8 -*-
"""
Created on Mon May  2 09:10:11 2022

@author: jiatianle
"""

def funA():
    x=880
    def funB():
        print(x)
    return funB
funA()()
p=funA()
p()