#网络爬虫的尺寸
#1.爬取网页 玩转网页 ：小规模，数据量小，爬取速度不敏感  Requests库
#2.爬取网站  爬取系列网站：中规模，数据规模较大，爬取速度敏感 Scrapy库
#3.爬取全网 大规模，搜索引擎  爬取速度关键  定制开发 无第三方库提供
#受限于编写水平和目的，网络爬虫将会为web服务器带来巨大的资源开销



#网络爬虫引发的问题
#骚扰问题
#法律风险
#隐私泄露

#网络爬虫的限制
#来源审查：判断User-Agent进行限制
#检查来访HTTP协议头的User-Agent域，只响应浏览器或友好爬虫的访问。
#发布公告：Robots协议
#告知所有爬虫网站的爬取策略，要求爬虫遵守。