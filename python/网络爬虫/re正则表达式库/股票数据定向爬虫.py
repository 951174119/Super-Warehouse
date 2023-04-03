import requests
from bs4 import BeautifulSoup
import traceback
import re
 
#获得URL对应的页面
def getHTMLText(url,code='utf-8'):
    try:
        r=requests.get(url,timeout=30)
        r.raise_for_status()
        '''
        速度提高：编码识别的优化
        r.apparent_encoding是将获得的html页面文本内容交给程序来判断
        而r.encoding只是从html的头文件中解析其用的方式
        '''
        #r.encoding=r.apparent_encoding
        r.encoding=code
        return r.text
    except:
        return ""
 
#获得股票的信息列表
def getStockList(lst,stockURL):
    html=getHTMLText(stockURL,'GB2312')
    soup=BeautifulSoup(html,'html.parser')
    #通过观察东方财富网的源代码，我们发现我们要找的股票代码都存在了<a>标签里，所以我们需要找到所有的<a>标签
    a=soup.find_all('a')
    for i in a:
        # 我们找到<a>标签里面的href属性中的最后html前面有股票代码我们将其提取出来即可
        # <a target="_blank" href="http://quote.eastmoney.com/sh201000.html">
        # 股票代码的规律，上交所的为“sh+6位数字”，深交所的为“sz+6位数字”
        try:
            href=i.attrs['href']
            lst.append(re.findall(r"[s][hz]\d{6}",href)[0])
        except:
            continue#出现异常程序继续执行即可，可能一些匹配出现问题
 
 
 
#获得每一个个股的股票信息，并将其存在一个文件中
def getStockInfo(lst,stockURL,fpath):
    #在百度股票中
    count = 0
    for stock in lst:
        url=stockURL+stock+".html"
        html=getHTMLText(url)
        try:
            if html=="":
                continue
            #定义一个字典，存储从页面中返回的所有的个股信息
            infoDict={}
            soup=BeautifulSoup(html,"html.parser")
            stockInfo=soup.find('div',attrs={'class':'stock-bets'})
            name=stockInfo.find_all(attrs={'class':'bets-name'})[0]
            #可能待会儿在这出现差错，是因为在东方财富网上的有关基金在百度股票网上找不到对应的股票
            infoDict.update({'股票名称':name.text.split()[0]})
 
            keyList=stockInfo.find_all('dt')
            valueList=stockInfo.find_all('dd')
 
            for i in range(len(keyList)):
                key=keyList[i].text
                val=valueList[i].text
                infoDict[key]=val#字典的用法
 
            #体验提高：增加动态进度显示
 
            with open(fpath,'a',encoding='utf-8') as f:
                f.write(str(infoDict)+'\n')
                count+=1
                print("\r当前进度：{:.2f}%".format(count*100/len(lst)),end="")#\r打印的内容会覆盖之前的内容
 
        except:
            #traceback.print_exc()#知道哪些地方发生了异常，获得错误信息
            count+=1
            print("\r当前进度：{:.2f}%".format(count * 100 / len(lst)), end="")
            continue
 
 
 
if __name__ == '__main__':
    stock_list_url="http://quote.eastmoney.com/stock_list.html"#股票列表的网站
    stock_info_url='https://gushitong.baidu.com/stock/hk-09888'
    output_file="C://Users//jiatianle//Desktop//python//网络爬虫//股票数据爬取结果.txt"
    slist=[]#存储股票的信息
    getStockList(slist,stock_list_url)
    getStockInfo(slist,stock_info_url,output_file)
