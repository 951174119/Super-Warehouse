# -*- coding: utf-8 -*-
"""
Created on Tue May  3 20:06:34 2022

@author: jiatianle
"""

def fibRecur(n):
    if n==1 or n==2:
        return 1
    else:
        return fibRecur(n-1)+fibRecur(n-2)
c=fibRecur(4)
print(c)