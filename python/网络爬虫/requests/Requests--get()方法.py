#Requests自动爬取HTML页面自动网络请求提交
import requests
#requests.get()获取HTML网页的主要方法，对应于HTTP的GET
#r=rerequests.get(url)构造一个向服务器请求资源的Reauest对象     返回一个包含服务器资源的Response对象
#requests.get(url,params=None,**kwargs) url：拟获取页面的url链接 params：url中的额外参数，字典或字节流格式，可选
#**kwargs：12个控制访问的参数
r=requests.get("http://www.baidu.com")
print(r.status_code)#检测此请求的状态码，如果状态码时200，访问成功，不是则失败
print(type(r))#返回类
print(r.headers)
#r.status.code  HTTP请求的返回状态，200表示连接成功，404表示失败，只要不是200都返回失败
#r.text  HTTP相应内容的字符串形式，即，url对应的页面内容
#r.encoding 从HTTP header中猜测的响应内容编码方式
#r.apperent_encoding 从内容中分析出的响应内容编码方式（备选编码方式）
#r.content HTTP响应内容的二进制形式
print(r.text)
print(r.encoding)
print(r.apparent_encoding)
#r.encoding:如果header中不存在charset，则认为编码为ISO-8858-1
#r.raise_for_status()如果不是200，产生异常requests.HTTPError