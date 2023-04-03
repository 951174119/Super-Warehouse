# -*- coding: utf-8 -*-
"""
Created on Thu May  5 17:36:23 2022

@author: jiatianle
"""
#继承
class Parent:
    def hello(self):
        print('123')
class Child(Parent):
    pass
p=Parent()
p.hello()
c=Child()
c.hello()
#如果子类中定义与父类同名的方法或属性，则会自动覆盖父类对应的方法或属性
class Child(Parent):
    def hello(self):
        print('ABC')
c=Child()
c.hello()
p.hello()