# -*- coding: utf-8 -*-
"""
Created on Mon May  2 08:45:00 2022

@author: jiatianle
"""

import time
def logger(msg):
    def master(x):
        def call():
            start=time.time()
            x()
            stop=time.time()
            print(f"[{msg}]={(stop-start)}")
        return call
    return master
def funA():
    time.sleep(2)
    print("正在运行")
def funB():
    time.sleep(1)
    print("已经运行")
funA=logger(msg="w")(funA)
funB=logger(msg="q")(funB)
funA()
funB()
