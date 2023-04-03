# -*- coding: utf-8 -*-
"""
Created on Thu May  5 17:12:16 2022

@author: jiatianle
"""

class Person:
    __name='ABC'
p=Person()
p.__name#加__后函数变成私有，不能从外部访问，需要从内部访问