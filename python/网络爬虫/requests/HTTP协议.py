#HTTP协议
#HTTP，Hypertext Transfer Protocol ，超文本传输协议
#HTTP是一个基于“请求与响应”模式的、无状态的应用层协议
#HTTP协议采用URL作为定位网络资源的标识
#URL格式 http://host[:port][path]
#host:合法的Internet主机域名或IP地址
#port：端口号，缺省端口为80
#path：请求资源的路径
#HTTP URL的理解：
#URL是通过HTTP协议存取资源的Internet路径，一个URL对应一个数据资源


#HTTP协议对资源的操作  与requests库方法一致
#GET 请求获取URL位置的资源
#HEAD 请求获取URL位置资源的响应消息报告，即获得该资源的头部信息
#POST 请求向URL位置的资源后附加新的数据
#PUT 请求向URL位置存储一个资源，覆盖原URL位置的资源
#PATCH 请求局部更新URL位置的资源，即改变该处资源的部分内容
#DELETE 请求删除URL位置存储的资源