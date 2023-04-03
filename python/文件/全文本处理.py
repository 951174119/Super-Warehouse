# -*- coding: utf-8 -*-
"""
Created on Sun May  8 17:14:12 2022

@author: jiatianle
"""

#"C:\Users\jiatianle\Desktop\python\文件\11.txt"
#遍历全文本
print('方法一\n')
fname=r"C:\Users\jiatianle\Desktop\python\文件\11.txt"
fo=open(fname,'r')
txt=fo.read()
fo.close()
print(txt,'\n')
print('方法二\n')
fname=r"C:\Users\jiatianle\Desktop\python\文件\11.txt"
fo=open(fname,'r')
txt=fo.read(2)
while txt !='':
    print(txt,end=' ')
    txt=fo.read(2)
fo.close()



