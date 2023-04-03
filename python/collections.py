import collections
nums1=[1,2,2,1,3]
nums2=[1,3,6,5,2,2]
num1 = collections.Counter(nums1)
num2 = collections.Counter(nums2)
print(num1)
print(num1&num2)
c=num1&num2
print(c)
print(list(c.elements()))
print(c.elements())
