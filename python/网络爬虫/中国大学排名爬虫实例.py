import requests
import bs4
from bs4 import BeautifulSoup


def getHTMLText(url):
    try:
        req = requests.request("GET", url, timeout=30)
        req.raise_for_status()
        req.encoding = req.raise_for_status
        return req.text
    except:
        return None


# 通过网页源代码获得排名信息列表
def fillUnivList(text):
    uList = []
    soup = BeautifulSoup(text, "html.parser")

    # 获得tbody标签
    tbody = soup.find("tbody")
    # 遍历tbody标签中的每一个子节点
    for tr in tbody.children:
        # 判断子节点是否为标签节点
        if isinstance(tr, bs4.element.Tag):
            # 获得tr标签里的所有td标签
            tds = tr.find_all("td")
            # 经查看源代码发现：
            # 第一个td标签里存放排名
            ranking = tds[0].string
            # 第二个td标签里的a标签里存放学校名字
            cnName = tds[1].find("a", "name-cn").string
            # 第三个td标签里存放的有学校地址和注释，通过contents[0]获得学校地址
            address = tds[2].contents[0]
            # 第四个td标签里存放得是学校评分
            score = tds[4].string
            # 再加入列表时，清楚所获得的字符串的两边的空格和换行
            uList.append((ranking.strip("\n "), cnName.strip("\n "), address.strip("\n "), score.strip("\n ")))
    return uList


# 格式化输出
def printList(uList):
    tplt = "{0:<10}\t{1:{4}<10}\t{2:<10}\t{3:<10}"
    print(tplt.format("排名", "学校", "地点", "分数", chr(12288)))
    for tup in uList:
        print(tplt.format(tup[0], tup[1], tup[2], tup[3], chr(12288)))


if __name__ == "__main__":
    url = "https://www.shanghairanking.cn/rankings/bcur/202111"
    text = getHTMLText(url)

    uList = fillUnivList(text)
    printList(uList)