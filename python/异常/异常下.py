# -*- coding: utf-8 -*-
"""
Created on Wed May  4 22:46:21 2022

@author: jiatianle
"""

try:
    1/0
except:
    print('逮到了')
else:
    print('没逮到')
try:
    1/1
except:
    print('逮到了')
else:
    print('没逮到')
try:
    1/0
except:
    print('逮到了')
else:
    print('没逮到')
finally:
    print('逮没逮到都会吱一声')
try:
    1/1
except:
    print('逮到了')
else:
    print('没逮到')
finally:
    print('逮没逮到都会吱一声')
try:
    1/0
    try:
        520+'aa'
    except:
        print('内部异常')
except:
    print('外部异常')
finally:
    print('收尾工作')
try:
    try:
        520+'aa'
    except:
        print('内部异常')
        1/0
except:
    print('外部异常')
finally:
    print('收尾工作')

s='asd'
assert s=='asd'
#assert s!='asd'#调试
#raise ValueError('值不正确')#主动引发异常

