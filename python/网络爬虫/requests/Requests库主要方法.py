#requests.request(method,url,**kwargs)
#method:请求方式，对应get/put/post等7种 有GET HEAD POST PUT PATCH delete OPTIONS 7种
#url拟获取页面的url链接
#**kwargs：控制访问的参数，共13个
#**kwargs: 控制访问的参数，均为可选项
import requests
#params : 字典或字节序列，作为参数增加到url中
kv = {'key1': 'value1', 'key2': 'value2'}
r = requests.request('GET', 'http://python123.io/ws', params=kv)
print(r.url)
#data : 字典、字节序列或文件对象，作为Request的内容
kv = {'key1': 'value1', 'key2': 'value2'}
r = requests.request('POST', 'http://python123.io/ws',data=kv)
#json : JSON格式的数据，作为Request的内容
#headers : 字典，HTTP定制头
#cookies : 字典或CookieJar，Request中的cookie
#auth : 元组，支持HTTP认证功能
#files : 字典类型，传输文件
#timeout : 设定超时时间，秒为单位
#proxies : 字典类型，设定访问代理服务器，可以增加登录认证
#allow_redirects : True/False，默认为True，重定向开关
#stream : True/False，默认为True，获取内容立即下载开关
#verify : True/False，默认为True，认证SSL证书开关
#cert : 本地SSL证书路径