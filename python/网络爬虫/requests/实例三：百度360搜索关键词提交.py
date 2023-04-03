#实例三
#百度360搜索关键词提交
#搜索引擎关键词提交接口
#百度的关键词接口：http://www.baidu.com/s?wd=keyword
#360的关键词接口：http://www.so.com/s?q=keyword
import requests
kv={'wd':'Python'}
r=requests.get('http://www.baidu.com/s',params=kv)
print(r.status_code)
print(r.request.url)
print(len(r.text))


#百度搜索的全代码
keyword='Python'
try:
    kv={'wd':keyword}
    r=requests.get('http://www.baidu.com/s',params=kv)
    print(r.request.url)
    r.raise_for_status()
    print(len(r.text))
except:
    print('爬取失败')
