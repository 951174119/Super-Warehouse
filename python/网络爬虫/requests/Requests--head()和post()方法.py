#Requests库的head()方法
#r.head()获取HTML网页头信息的方法，对应于HTTP的HEAD
import requests
r=requests.head('http://httpbin.org/get')
print(r.headers)#展示反馈的头部信息的内容

print('\n-------')
print(r.text)#为空

#Request库的post()方法  
#r.post()向HTML网页提交POST请求的方法，对应于HTTP的POST
payload={'key1':'value1','key2':'value2'}
r=requests.post('http://httpbin.org/post',data=payload)#向URL POST一个字典自动编码为form(表单)
print(r.text)
r=requests.post('http://httpbin.org/post',data='abc')#被存到data字段下
print(r.text)

print('\n')
#Requests库的put()方法
#r.put()向HTML网页提交PUT请求的方法，对应于HTTP的PUT
payload={'key1':'value1','key2':'value2'}
r=requests.put('http://httpbin.org/put',data=payload)
print(r.text)
