# cloud-yblog

<p align=center>
  <a href="#">
    <img src="https://gitee.com/youzhengjie/cloud-yblog/raw/master/cloud-yblog-doc/images/bloglogo.jpg" alt="cloud-yblog" style="width:200px;height:200px">
  </a>
</p>
<p align=center>
   cloud-yblog是yblog的微服务版本，是一个基于SpringCloud分布式微服务架构开发的博客系统
</p>

 &emsp;&emsp;cloud-yblog是基于SpringCloud+springCloud alibaba分布式微服务框架开发的博客：**博文管理**、**统计图表**、**接口监控**、**访问记录**、**附件管理**、**用户管理**、**友链管理**、**监控管理**、**抓取博文**，以及**第三方登录**等功能，且一直会对本项目进行加强，请各位大佬多多指点，一起共同进步。
文章无需自己写，可以使用作者自己编写的全自动爬虫工具即可，只需轻轻一点，万千文章到手。

### SpringBoot版的yblog仓库地址
GitHub: https://github.com/youzhengjie9/yblog <br/>
Gitee: https://gitee.com/youzhengjie/springBootBlog


### cloud-yblog的架构图

<p align=center>
  <a href="#">
    <img src="https://gitee.com/youzhengjie/cloud-yblog/raw/master/cloud-yblog-doc/images/jiagou.png" alt="cloud-yblog-jiagou" style="width:200px;height:200px">
  </a>
</p>

### 开发环境

| 类别                |   名称     |   
| -----------------   | -------  |
| 编译器          |    IntelliJ IDEA   |
| 系统1             |   Windows 10   |
| 系统2               |   CentOS 7   |
| CPU              |    Intel i5-9300H   |
| 内存                |    24GB         |

* 注：特别是内存需要>=16GB才能运行,如果不足16GB,可以把各服务的集群变成单体服务即可，如不想关闭集群，则需要大内存支撑。


### 版本对应
| 名称                | 版本    |
| -------------      | -------------  |
| Spring Boot             | 2.3.2.RELEASE      | 
| Spring Cloud            | Hoxton.SR8      | 
| Spring Cloud Alibaba    | 2.2.3.RELEASE   |
| Nacos                  | 1.4.1      |
| Sentinel               | 1.8.0     |
| Seata                  | 1.3.0      |    
| ZipKin                |  2.12.9       |
| elasticSearch         |  7.6.1             |
| Kibana               |   7.6.1         |
| MySQL                  |  5.7            |

* 剩下的版本可以随意，上面写出来的版本要严格对应，不然怕会出现兼容性问题！！！

### 技术栈
#### 后端

| 名称                | 官网                                                         |
| -----------------   | ------------------------------------------------------------ |
| Spring Boot             | https://spring.io/projects/spring-boot               | 
| Spring Cloud        |     https://spring.io/projects/spring-cloud                    |
| Spring Cloud Alibaba     |  https://spring.io/projects/spring-cloud-alibaba                       |
| Nacos      |     https://nacos.io/zh-cn/                    |
| Seata        |   http://seata.io/zh-cn/                      |
| Sentinel     |   https://github.com/alibaba/Sentinel                      |
| ZipKin            |    https://zipkin.io/                                            |
| Redis             | http://www.redis.cn/               | 
| RabbitMQ                   |  https://www.rabbitmq.com/                                  |
| elasticSearch           |    https://www.elastic.co/cn/elasticsearch/                  |
| Kibana               |   https://www.elastic.co/cn/kibana/        |
| MyBatis             | http://www.mybatis.org/mybatis-3/zh/index.html               |         
| Spring Security        | https://spring.io/projects/spring-security/                                   |
| PageHelper         | http://git.oschina.net/free/Mybatis_PageHelper               |
| Maven              | http://maven.apache.org/                                     |
| MySQL              | https://www.mysql.com/                                       |                                  |
| Swagger2                  | https://swagger.io/               |
| Druid                       |    https://github.com/alibaba/druid                    |
| fastjson                          |   https://github.com/alibaba/fastjson/                |
| sjf4j                     |   http://www.slf4j.org/  |
| thumbnailator                         |   https://github.com/coobird/thumbnailator                   |
| Nginx                       |     http://nginx.org/en/download.html
#### 前端

| 名称            | 描述       | 官网                                                     |
| --------------- | ---------- | -------------------------------------------------------- |
| jQuery          | 函数库     | http://jquery.com/                                       |
| Bootstrap       | 前端框架   | https://v3.bootcss.com/                                |
| echarts         | 可视化图表库       | https://echarts.apache.org/zh/index.html        |                        |                             |
| Thymeleaf     | 模板引擎                | https://www.thymeleaf.org/      |
| TinyMCE        |  富文本编辑器         |  http://tinymce.ax-z.cn/  |
| alertJs          |弹框插件          |  https://gitee.com/ydq/alertjs
| layui           | 模块化前端UI框架        | https://www.layui.com/         |

