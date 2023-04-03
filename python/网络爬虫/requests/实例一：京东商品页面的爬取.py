#实例一：京东商品页面的爬取
#https://item.jd.com/2967929.html
#通过这个链接获得商品的相关信息

import requests
r=requests.get('https://item.jd.com/2967929.html')
print(r.status_code)
print(r.encoding)
print(r.text)


try:
    r=requests.get('https://item.jd.com/2967929.html')
    r.raise_for_status()#返回值不为200则返回异常
    r.encoding=r.apparent_encoding
    print(r.text[:1000])
except:
    print('获取失败')