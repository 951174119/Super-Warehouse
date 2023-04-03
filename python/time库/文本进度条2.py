# -*- coding: utf-8 -*-
"""
Created on Fri May 13 19:50:47 2022

@author: jiatianle
"""

#刷新的本质：用后打印的字符覆盖之前的字符
#不能换行：print()需要被控制
#要能回退：打印后光标退回到之前的位置
#刷新的关键：\r  使光标退回到当前行的行首
import time
for i in range(101):
    print('\r{:3}%'.format(i),end='')
    time.sleep(0.1)
print('\n')
