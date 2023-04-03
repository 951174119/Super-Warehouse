# -*- coding: utf-8 -*-
"""
Created on Thu May  5 20:10:01 2022

@author: jiatianle
"""

import random as r 
class Fish:
    def __init__(self):
        self.x=r.randint(0,10)
        self.y=r.randint(0,10)
    def move(self):
        self.x-=1
        print('我的位置是：',self.x,self.y)
class Goldfish(Fish):
    pass
class Carp(Fish):
    pass
class Salmon(Fish):
    pass
class Shark(Fish):
    def __init__(self):#重写了父类的方法，将父类的方法覆盖了，
        #Fish.__init__()  添加后可以调用父类函数
        #supper().__init__()也可以
        self.hungry=True
    def eat(self):
        if self.hungry:
            print('我是吃货')
            self.hungry=False
        else:
            print('吃撑了')
fish=Fish()
fish.move()
fish.move()
goldfish=Goldfish()
goldfish.move()
goldfish.move()
shark=Shark()
shark.eat()
shark.eat()
try:
    shark.move()
except:
    print('错误')
Fish.__init__(shark)
shark.move()

    