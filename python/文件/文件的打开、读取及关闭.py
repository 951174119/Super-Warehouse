

#"C:\Users\jiatianle\Desktop\python\文件\11.txt"
#a=open(r"C:\"C:\Users\jiatianle\Desktop\python\文件\11.txt"",'r')#只读，如果文件不存在，返回异常。
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'w')#覆盖写模式，文件不存在则创建文件，存在则完全覆盖。
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'x')#创建写模式，文件不存在则创建，存在则返回异常。
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'a')#追加写模式，文件不存在则创建，存在则在文件最后追加内容。
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'b')#二进制文件模式
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'t')#文本文件模式
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'+')#与r/w/x/a一同使用，形成r+,w+,x+,a+,在原功能基础上增加一些功能，使得具备同时读写功能。
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt")#默认使用文本模式，只读模式
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'rt')#等同于上一行
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'a+')#文本形式，追加写模式+读文件
#a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'wb')#二进制模式，覆盖写模式
#a.close()#关闭文件
a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'rt')
print(a.readlines())
a.close()
a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'rb')
print(a.readlines())
a.close()
a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'rt')
print(a.read())#读入全部内容，如果给出参数，读入前size长度,此时指向文件末尾
print(a.readline())#读入一行内容，如果给出参数，读入该行前size长度，由于此时指向文件末尾，无输出
print(a.readlines())#读入文件所有行，以每行为元素形成列表，如果给出参数，读入前参数行
a.close()
a=open(r"C:\Users\jiatianle\Desktop\python\文件\11.txt",'w+')
a.write('Hello World\
        你好   世界')
print(a.read())
a.close()







