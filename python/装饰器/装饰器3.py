# -*- coding: utf-8 -*-
"""
Created on Mon May  2 09:05:05 2022

@author: jiatianle
"""

# -*- coding: utf-8 -*-
"""
Created on Mon May  2 08:58:51 2022

@author: jiatianle
"""

def J(x):
    def IN():
        p=x()
        return p*p
    return IN
def K(x):
    def ON():
        p=x()
        return p+6
    return ON
@K
@J

def test():
    return 2
print(test())