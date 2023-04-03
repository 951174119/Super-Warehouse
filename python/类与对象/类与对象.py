# -*- coding: utf-8 -*-
"""
Created on Thu May  5 16:30:33 2022

@author: jiatianle
"""

class Turtle:
    head=1
    eyes=2
    legs=4
    shell=True
    def crawl(self):
        print('1')
    def run(self):
        print('2')
    def bite(self):
        print('3')
    def eat(self):
        print('4')
    def sleep(self):
        print('5')
t1=Turtle()
t1.bite()
print(t1.head)
t2=Turtle()
print(t2.head)
t2.legs=3
print(t2.legs)
t2.mouth=1
print(t2.mouth)
print(dir(t1))
print(dir(t2))