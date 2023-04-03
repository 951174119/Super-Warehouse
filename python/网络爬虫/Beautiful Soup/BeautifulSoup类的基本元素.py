#Beautiful Soup
#from bs4 import BeautifulSoup
#import bs4
#BeautifulSoup类
#html文档<->标签树<->BeautifulSoup类
#BeautifulSoup(mk,"html.parser")
#BeautifulSoup(mk,"lmxl")
#BeautifulSoup(mk,"xml")
#BeautifulSoup(mk,"html5lib")
#BeautifulSoup类的基本元素
#Tag 标签，最基本的信息组织单元，分别用<>和</>标明开头和结尾
#Name 标签的名字，<p>…</p>的名字是'p'，格式：<tag>.name
#Attributes 标签的属性，字典形式组织，格式：<tag>.attrs
#NavigableString 标签内非属性字符串，<>…</>中字符串，格式：<tag>.string
#Comment 标签内字符串的注释部分，一种特殊的Comment类型
from bs4 import BeautifulSoup
soup=BeautifulSoup("    .html","html.parser")