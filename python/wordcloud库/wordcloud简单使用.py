#步骤一：配置对象参数
#步骤二：加载词云文本
#步骤三：输出词云文件
import wordcloud
w=wordcloud.WordCloud()
#w.generate(txt)#向WordCloud对象w中加载文本txt
w.generate('Python and WordCloud')
#w.to_file(filename)将词云输出为图像文件，.png或.jpg格式
w.to_file('词云.png')
w.to_file('词云1.jpg')

