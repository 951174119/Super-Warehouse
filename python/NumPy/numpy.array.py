a=[1,3,2,4,1]
b=[1,2,4,5,4]
c=[]
for i in range(len(a)):
    c.append(a[i]*b[i])
print(c)
print("---------------------------------------")
import numpy as np
a=np.array(a)
b=np.array(b)
c=a*b
print(c)
