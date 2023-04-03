# -*- coding: utf-8 -*-
"""
Created on Wed May 18 20:27:34 2022

@author: jiatianle
"""

class S:
    def __init__(self,a):
        print('5')
        self.name=a
    def __del__(self):
        print(self.name)
stu1=S('a')
stu2=S('b')
stu3=stu2
del stu2
stu=S('c')
del stu3
    