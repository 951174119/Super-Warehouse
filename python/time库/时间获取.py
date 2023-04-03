# -*- coding: utf-8 -*-
"""
Created on Fri May 13 10:27:11 2022

@author: hp
"""

#time库包含三类函数
#时间获取：time(),ctime(),gmtime()
#时间格式化：strftime(),strptime()
#程序计时：sleep(),perf_counter()

import time
#时间获取
#time()获取当前时间戳，即计算机内部时间值，浮点数  time.time()
print(time.time())
#ctime()获取当前时间并以易读方式表示，返回字符串   time.ctime()
print(time.ctime())
#time.gmtime()获取当前时间，表示为计算机可处理的时间格式
print(time.gmtime)