#Robots协议
#Robots Exclusion Standard 网络爬虫排除标准
#作用：网站告知网络爬虫哪些页面可以抓取，哪些不行
#形式：在网站根目录下的robots.txt文件
import requests
r=requests.get("http://www.baidu.com//robots.txt")
print(r.text)


print('\n')
print('---------------------------------------------')
a=requests.get('http://www.qq.com//robots.txt')
print(a.text)
print('---------------------------------------------')
try:
    b=requests.get('http://www.moc.edu.cn//robots.txt')
    print(b.text)
except:
    print('Robots协议不存在')




#Robots协议的使用
#网络爬虫：自动或人工识别robots.txt，再进行内容爬取
#约束性：Robots协议是建议但非约束性，网络爬虫可以不遵守，但存在法律风险