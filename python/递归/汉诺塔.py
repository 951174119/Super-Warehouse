# -*- coding: utf-8 -*-
"""
Created on Tue May  3 20:46:40 2022

@author: jiatianle
"""

def hanoi(n,x,y,z):
    if n==1:
        print(n,x,'-->',z)#如果只有一层，直接将金片从x移动到z
    else:
        hanoi(n-1,x,z,y)#将x上的n-1个金片移动到y
        print(n,x,'-->',z)#将最底下的金片从x移动到z
        hanoi(n-1,y,x,z)#将y上的n-1个金片移动到z
n=int(input('请输入汉诺塔的层数'))
a,b,c=input().split()
hanoi(n,a,b,c)