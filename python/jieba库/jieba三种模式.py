#jieba分词的三种模式
#精确模式、全模式、搜索引擎模式
#精确模式：把文本精确的切分开，不存在冗余单词
#全模式：把文本中所有可能的词语都扫描出来，有冗余
#搜索引擎模式：在精确模式基础上，对长词再次切分
import jieba
#jieba.lcut(s)精确模式，返回一个列表类型的分词结果
print(jieba.lcut('中国是一个伟大的国家'))
#jieba.lcut(s,cut_all=True)全模式，返回一个列表类型的分词结果，存在冗余
print(jieba.lcut('中国是一个伟大的国家',cut_all=True))
#jieba.lcut_for_search(s)搜索引擎模式，返回一个列表类型的分词结果，存在冗余
print(jieba.lcut_for_search('中华人民共和国是伟大的'))
#jieba.add_word(w)向分词词典增加新词w
jieba.add_word('11语言')
print(jieba.lcut('11语言是一种未知的语言'))