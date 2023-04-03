# -*- coding: utf-8 -*-
"""
Created on Sun May  8 17:37:43 2022

@author: jiatianle
"""
#"C:\Users\jiatianle\Desktop\python\文件\12.txt"
#f.write(s)向文件写入一个字符串或字节流
#f.writelines(lines)将一个元素全为字符串的列表写入文件
#f.seek(offset，whence)#改变当前文件操作指针的位置，whence含义如下：0-文件开头；1-当前位置；2-文件结尾
#offset 开始的偏移量，要移动偏移的字节数，如果是负数表示从倒数第几位开始
fo=open(r"C:\Users\jiatianle\Desktop\python\文件\12.txt",'w+')
ls=['中国','法国','美国']
fo.writelines(ls)
for line in fo:
    print(line)#此时指针指向末尾，无法读入
fo.close()
fo=open(r"C:\Users\jiatianle\Desktop\python\文件\13.txt",'w+')
ls=['中国','法国','美国']
fo.writelines(ls)
fo.seek(0)#指针指向开头
for line in fo:
    print(line)
fo.close()

