# -*- coding: utf-8 -*-
"""
Created on Wed May  4 22:17:45 2022

@author: jiatianle
"""

try:
    1/0
except ZeroDivisionError as a:
    print(a)

try:
    1/0
    '23'+23
except (ZeroDivisionError,ValueError,TypeError) as a:
    print(a)
try:
    1/0
    '23'+23
except ZeroDivisionError as a:
    print(a)
except ValueError as b:
    print(b)
except TypeError as c:
    print(c)

try:
    '23'+23
    1/0
except ZeroDivisionError as a:
    print(a)
except ValueError as b:
    print(b)
except TypeError as c:
    print(c)