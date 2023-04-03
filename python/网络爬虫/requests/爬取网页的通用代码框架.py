#爬取网页的通用代码框架
#requests.ConnectionError 网络连接错误，如DNS查询失败、拒绝连接等
#requests.HTTPError HTTP错误异常
#requests.URLRequired URL缺失异常
#requests.TooManyRedirects 超过最大重定向次数，产生重定向异常
#requests.ConnectTimeout 链接远程服务器超时异常
#requests.Timeout 请求URL超时，产生超时异常
import requests
def getHTMLText(url):
    try:
        r=requests.get(url,timeout=30)#防止服务器不能及时响应，限制请求时间
        r.raise_for_status()#返回值不为200则返回异常
        r.encoding=r.apparent_encoding
        return r.text
    except:
        return "产生异常"
if __name__=="__main__":
    url="http://www.baidu.com"
    print(getHTMLText(url))