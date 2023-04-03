# -*- coding: utf-8 -*-
"""
Created on Sun May  8 17:26:38 2022

@author: jiatianle
"""

#逐行遍历文件
print('方法一\n')
fname=r"C:\Users\jiatianle\Desktop\python\文件\11.txt"
fo=open(fname,'r')
for line in fo.readlines():
    print(line,end='')
fo.close()
print('\n')
print('方法二\n')
fname=r"C:\Users\jiatianle\Desktop\python\文件\11.txt"
fo=open(fname,'r')
for line in fo:
    print(line,end='')
fo.close()

