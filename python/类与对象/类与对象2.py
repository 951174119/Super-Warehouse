class MyList(list):
    pass
list1=MyList()
list1.append(2)
list1.append(4)
print(list1)
class A:
    def fun(self):
        print('我是小A')
class B:
    def fun(self):
        print('B')
a=A()
a.fun()
