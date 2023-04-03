#1.单元一.requests库的get方法
import requests
r = requests.get("https://www.baidu.com/")
print(r.status_code)
type(r)
print(r.headers)
r.encoding = r.apparent_encoding
print(r.text)


#2.单元一.requests库的通用代码框架
import requests
def get_html_text(url):
    try:
        r = requests.get(url, timeout=30)
        r.raise_for_status()
        r.encoding = r.apparent_encoding
        return r.text
    except Exception as e:
        return repr(e)

if __name__ == "__main__":
    url = "https://www.baidu.com/"
    print(get_html_text(url))


#3.单元一.requests库的post方法
import requests
payload = {"key1": "value1", "key2": "value2"}
r = requests.post("https://httpbin.org/post", data=payload)
print(r.text)

r1 = requests.post("https://httpbin.org/post", data="ABC")
print(r1.text)


#4.单元一.requests库的get代理方法
import requests
# 使用代理网站的IP地址
# https://www.kuaidaili.com/free/
# pxs = {"http": "https://user:pass@10.10.10.1:1234",
#        "https": "https://10.10.10.1:4321"}

pxs = {
    "http": "120.83.101.166:9999"
}

r = requests.request("GET", "https://www.baidu.com", proxies=pxs)
print(r.text)


#5.单元三.京东商品页面爬取
import requests
url = "https://item.jd.com/2967929.html"
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36",
}
r = requests.get(url, headers=headers)  # 因为京东啊，亚马逊都有反爬，所以要加入头部信息
r.raise_for_status()
r.encoding = r.apparent_encoding
print(r.text[:1001])


#6.单元三.亚马逊商品页面爬取
import requests
url = "https://www.amazon.cn/gp/product/B01M8L5Z3Y"
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.163 Safari/537.36",
}
r = requests.get(url, headers=headers)
r.raise_for_status()
r.encoding = r.apparent_encoding
print(r.text[1000:20001])


#7.单元三.百度360的搜索关键词提交
import requests
# 带上浏览器信息
headers = {
    "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36"
}
r = requests.get("https://www.baidu.com/s?wd=python", headers=headers)
r.encoding = r.apparent_encoding
print(r.status_code)
print(r.text)

# 带上浏览器信息
headers = {
    "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36"
}
r = requests.get("https://www.so.com/s?q=python", headers=headers)
r.encoding = r.apparent_encoding
print(r.status_code)
print(r.text)


#单元三.IP138
import requests
text = "202.204.80.112"
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.100 Safari/537.36",
}
url = "https://m.ip138.com/iplookup.asp?ip={}".format(text)
html = requests.get(url, headers=headers)
html.encoding = html.apparent_encoding
print(html.text)

#图片爬取
import requests
import os
url = "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3864420560,2390067063&fm=26&gp=0.jpg"#注意是url是图片的链接
root =  "C:/Users/Dell/Desktop/答疑/"  # 保存路径
path = root + url.split('/')[-1]  # 新建文件名为root路径之后加上地址最后以“/”分割的部分
try:
    if not os.path.exists(root):  # 判断括号里的文件是否存在的意思，括号内的可以是文件路径
        os.mkdir(root)  # 不存在则创建目录
    if not os.path.exists(path):  # 文件不存在则开始爬取保存
        r = requests.get(url)
        with open(path, 'wb') as f:
            f.write(r.content)#保存为二进制格式
            f.close()
            print("文件保存成功")
    else:
        print("文件已经存在")
except:
    print("爬取失败")