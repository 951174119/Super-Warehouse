#wordcloud库常规方法
#1.分隔：以空格分隔单词
#2.统计：单词出现次数并过滤
#3.字体：根据统计配置字号
#4.布局：颜色环境尺寸
import wordcloud

#w=wordcloud.WordCloud(width=)指定词云对象生成图片的宽度，默认400像素
#w=wordcloud.WordCloud(height=)指定词云对象生成图片的高度，默认200像素
#w=wordcloud.WordCloud(min_font_size=)指定词云中字体的最小字号，默认4号
#w=wordcloud.WordCloud(max_font_size=)指定词云中字体的最大字号，根据高度自动调节
#w=wordcloud.WordCloud(font_step=)指定词云中字体字号的步进间隔，默认为1
#w=wordcloud.WordCloud(font_path=)指定字体文件的路径，默认None，'msyh.ttc'微软雅黑
#w=wordcloud.WordCloud(max_words=)指定词云显示的最大单词数量，默认200
#w=wordcloud.WordCloud(stop_words=)指定词云的排除词列表，即不显示的单词列表，('想要排除的词')
#w=wordcloud.WordCloud(mask=)指定词云形状，默认为长方形，需要引用imread()函数
#from scipy.misc import impread
#mk=impread('pic.png')
#w=wordcloud.WordCloud(mask=mk)
#w=wordcloud.WordCloud(background_color='white')指定词云图片的背景颜色，默认为黑色 w.background_color('white')
txt='life is short, you need python'
w=wordcloud.WordCloud(background_color='white',width=500,height=500,min_font_size=5,font_path='msyh.ttc')
w.generate(txt)
w.to_file('pywcloud.png')








