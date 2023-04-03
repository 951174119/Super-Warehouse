# -*- coding: utf-8 -*-
"""
Created on Thu May  5 17:12:15 2022

@author: jiatianle
"""

class Ball:
    def setName(self,name):
        self.name=name
    def kick(self):
        print('我叫%s'%self.name)
a=Ball()
a.setName('球 A')
b=Ball()
b.setName('球 B')
c=Ball()
c.setName('球 C')
a.kick()
b.kick()
c.kick()
class Ball:
    def __init__(self,name):
        self.name=name
    def kick(self):
        print('我叫%s'%self.name)
b=Ball('弱智')
b.kick()
class Person:
    name='ABC'
p=Person()
print(p.name)  

