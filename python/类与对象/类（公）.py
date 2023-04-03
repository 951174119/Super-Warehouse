# -*- coding: utf-8 -*-
"""
Created on Thu May  5 17:31:26 2022

@author: jiatianle
"""

class Person:
    __name='ABC'
    def getName(self):
        return self.__name
p=Person()
print(p.getName())
print(p._Person__name)