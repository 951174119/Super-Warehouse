#环境参数
#os.chdir(path)修改当前程序操作的路径
import os
print(os.chdir('D:'))
#os.getcwd()返回程序的当前路径
print(os.getcwd())
#os.getlogin()获得当前系统登录用户名称
print(os.getlogin())
#os.cpu_count()返回当前系统的CPU数量
print(os.cpu_count())
#os.urandom(n)获得n个字节长度的随机字符，通常用于加密解密运算
print(os.urandom(5))
