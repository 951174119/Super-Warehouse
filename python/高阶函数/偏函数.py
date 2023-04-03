# -*- coding: utf-8 -*-
"""
Created on Wed May  4 21:54:45 2022

@author: jiatianle
"""

import functools
square=functools.partial(pow,exp=2)
c=square(2)
print(c)
print(square(3))
a=functools.partial(pow,exp=3)
print(a(3))
print(pow(3,2))