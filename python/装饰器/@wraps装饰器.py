# -*- coding: utf-8 -*-
"""
Created on Wed May  4 22:02:24 2022

@author: jiatianle
"""

import time
def time_master(func):
    def call_func():
        print("开始运行程序...")
        start=time.time()
        func()
        stop=time.time()
        print("结束程序运行...")
        print(f'一共耗费了{(stop-start):.2f}秒')
    return call_func
@time_master
def myfunc():
    time.sleep(2)
    print('我我我我')
myfunc()
print(myfunc.__name__)
import time
import functools
def time_master(func):
    @functools.wraps(func)
    def call_func():
        print("开始运行程序...")
        start=time.time()
        func()
        stop=time.time()
        print("结束程序运行...")
        print(f'一共耗费了{(stop-start):.2f}秒')
    return call_func
@time_master
def myfunc():
    time.sleep(2)
    print('我我我我')
myfunc()
print(myfunc.__name__)