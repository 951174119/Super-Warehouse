# -*- coding: utf-8 -*-
"""
Created on Fri May 13 10:43:26 2022

@author: hp
"""

#时间格式化
#格式化：类似字符串格式化，需要有展示模板
#展示模板由特定的格式化控制符组成
#time.strftime(tpl,ts) tpl是格式化模板字符串，用来定义输出效果
#ts是计算机内部时间类型变量
import time
t=time.gmtime()
print(time.strftime('%Y-%m-%d %H:%M:%S',t))
#%Y年份   %m月份   %B月份名称   %b月份名称缩写   %d日期   %A星期   %a星期缩写   %H小时（24h制）   %I小时（12h制）
#%p上/下午   %M分钟   %S秒
#strptime(str,tpl) str是字符串形式的时间值   tpl是格式化模板字符串，用来定义输入效果
timestr='2022-05-13 02:54:30'
print(time.strptime(timestr,'%Y-%m-%d %H:%M:%S'))
