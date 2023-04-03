# -*- coding: utf-8 -*-
"""
Created on Sat May  7 11:01:18 2022

@author: jiatianle
"""

a='SDfasfsSDF'
print(len(a))#字符串长度
print(hex(5))#将一个整数转换成十六进制表示的字符串
print(type(hex(3)))
print(oct(5))#将一个整数转换成八进制表示的字符串
print(ord('A'))
65
print(ord('a'))#ASCII值
97
print(chr(65))
print(chr(97))#返回整数对应的ASCII字符
print(a.lower())#转换成小写
print(a.upper())#转换成大写
print(a.split('s'))#以括号中的为分隔符返回一个列表
print(a.count('S'))#返回字符串中某个字符串的数量
print(a.replace('S','W',1))#将x换成y，1是替换个数(从前向后计算)
print(a.replace('S','W'))
print(a.center(21,'$'))#将字符串居中，数字表示长度，其余用后面的字符填充
print(a.center(20,'$'))
print(a.center(1,'$'))
c='112312asdasasfasdsad1123123'
print(c.strip('123'))#删除字符串头尾指定的字符生成新的字符串
print(c)
d=['a','sd','asdasd']
s='hello hello hello'
print(' '.join(a))
print('----'.join(a))#返回一个以前面符号为分隔符连接各个元素后生成的字符串
print(':'.join(d))
print(':'.join(s))
a='{}是好人，{:5}也是'.format('你','他')
print(a)
c='{0}是人,{2}也是人'.format('我','你','他')
print(c)
foods=['fish','beef','fruit','rice']
s='I like eat {} and {} and {}'.format(*foods)
print(s)
s='I like eat {2} and {1} and {0}'.format(*foods)
print(s)
d={'name':'mm','age':45}
c='My name is {name},my age is {age}'.format(**d)
print(c)
