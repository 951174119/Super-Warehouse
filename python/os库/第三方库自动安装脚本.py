#第三方库自动安装脚本
#需求：批量安装第三方库需要人工干预，能否自动安装？
#自动执行pip逐一根据安装需求安装
#NumPy N维数据表示和运算    Matplotlib 二维数据可视化     PIL图像处理   Scikit-Learn机器学习和数据挖掘
#Requests HTTP协议访问及网络爬虫  Beautiful Soup HTML和XML解析库  Wheel  Python第三方库文件打包工具
#PyInstaller 打包Python源文件为可执行文件 Django  Python最流行的Web开发框架 
#Flask  轻量级Web开发框架  WeRoBot 微信机器人开发框架  SymPy 数学符号计算工具  Pandas高效数据分析和计算
#Networkx 复杂网络和图结构的建模和分析  PyQt5 基于Qt的专业级GUI开发框架 
#PyOpenGL 多平台PoenGL开发接口  PyPDF2 PDF文件内容提取及处理  docopt  Python命令行解析
#PyGame  简单小游戏开发框架
import os
libs={'numpy','matplotlib','pillow','sklearn','requests','beautifulsoup4','wheel','networkx'\
      ,'sympy','django','flask','werobot','pyqt5','pandas','pyopengl','pypdf2','docopt','pygame'}
try:
    for lib in libs:
        os.system("pip install "+lib)
    print('successful')
except:
    print('Failed Somhow')