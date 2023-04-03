
import jieba
import wordcloud
txt='程序设计语言使计算机能够理解和识别用户操作意图的一种交互体系，它按照\
    特定规则组织计算机指令，使计算机能够自动进行各种运算处理'
w=wordcloud.WordCloud(width=1000,font_path='msyh.ttc',height=700,background_color='white')
w.generate(' '.join(jieba.lcut(txt)))#jieba.lcut()会生成一个列表变量
w.to_file('123.png')