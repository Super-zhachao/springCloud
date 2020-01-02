# springCloud小白学习手册
小白教小白系列，带你一步步搭建springCloud，图文描述，还有代码参考哟~

**图文资料在springCloud.doc中，欢迎查阅**

## 开发环境
>开发环境：jdk1.8

>开发工具:IDEA 2019.3.1 X64

>springBoot 2.2.2

## 本学习手册适合人群
要学习springCloud，但是从来没了解过的人，本学习手册只会说明各种组件的基本使用，与整合。需要有springboot基础。


## 背景说明：
导师让一下java相关的各种技术，并记录一下，因此就有了这个项目，主要是记录了springCloud各个模块的搭配与整合
。因为自己以前没有接触过相关领域，虽然有参考资料，但是还是会碰到各种各样的问题，所以，在我这个学习手册中记录的
会比其他地方的更全面一下。但又因为自己是一个初学者，所以可能会出现各种错误，还请大家多多指正。

## 此项目的参考文章：

https://juejin.im/post/5b83466b6fb9a019b421cecc（了解SpringCloud）

https://www.fangzhipeng.com/spring-cloud.html （方志朋的springCloud专栏）

## 已完成章节

### 目录
>Spring Cloud 项目建立	

>>1、	如何建立一个Spring Cloud项目	

- 1）	建立一个空Maven项目	

- 2）	建立服务注册中心（Eureka Server）	

- 3）	新建服务生产者（Eureka Client）	

>服务调用方式	

>>1、	ribbon+restTemplate的服务调用方式	

- 1.1	ribbon简介	

- 1.2	准备工作	

- 1.3	创建服务消费者	

- 1.4	消费远程服务	

- 1.5	测试结果	

>>2、	feign的服务调用方式	

- 2.1	feign简介	

- 2.2	准备工作	

- 2.3	创建服务消费者	

- 2.4	定义feign接口，消费远程服务	

- 2.5	测试结果

>断路器	

>>1、	为什么要有断路器	

>>2、	断路器Hystrix的使用	

- 2.1	准备工作	

- 2.2	在ribbon中使用断路器	

- 2.3	在feign中使用断路由	

- 3、	断路器Hystrix的仪表盘	

>API网关

>>1、   为什么需要API网关

>>2、   Zull相关

- 2.1	zuul简介

- 2.2	如何使用zuul


 

