#实例四：网络图片的爬取和存储
#网络图片链接的格式：http://www.example.com/picture.jpg
#国家地理：http://www.nationalgeographic.com.cn/
#选取一个图片：http://www.nationalgeographic.com.cn/photography/photo_of_the_day/3921.html
import requests
path='D:/abc.jpg'
url="https://img0.baidu.com/it/u=4029944917,190937447&fm=253&fmt=auto&app=138&f=JPEG?w=750&h=500"
r=requests.get(url)
print(r.status_code)
with open(path,'wb')as f:
    f.write(r.content)#r.content表示返回内容的二进制形式
f.close()



#图片爬取的全代码"
import os
url="http://pic.5tu.cn/uploads/allimg/201010/010P000024043F30051-1.jpg"
root="D://pics//"
path=root+url.split('/')[-1]
try:
    if not os.path.exists(root):
        os.mkdir(root)
    if not os.path.exists(path):
        r=requests.get(url)
        with open(path,'wb') as f:
            f.write(r.content)
            f.close()
            print('文件保存成功')
    else:
        print('文件已存在')
except:
    print('爬取失败')
        