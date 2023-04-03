# -*- coding: utf-8 -*-
"""
Created on Wed May 18 20:57:24 2022

@author: jiatianle
"""


class person:
    def __init__(self,a):
            self.name=a
    def setname(self,name):
        self.name=name
class student(person):
    def getname(self,sno):
        self.sno=sno
s=student('a')
print(s.name)
s.setname('4')
print(s.name)
s.getname('5')
print(s.sno)
