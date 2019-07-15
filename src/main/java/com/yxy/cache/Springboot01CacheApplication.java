package com.yxy.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
  * 搭建基本环境
 * 1、导入数据库文件  创建出department和employee表
 * 2、创建javabean封装数据
  *3、整合NyBatis操作数据库
 *      1、配置数据源信息
 *      2、使用注解版的MyBatis
 *          1)、@MapperScan指定需要扫描的mapper接口所在的包
 * 二、快速体验缓存
 *  步骤：
 *      1、开启基于注解的缓存 @EnableCaching
 *      2、标注缓存注解即可
 *       @Cacheable
 *       @CacheEvict
 *       @CachePut
 * 三、整合Redis作为缓存
 * Redis 是一个开源（BSD许可）的，内存中的数据结构存储系统，它可以用作数据库、缓存和消息中间件。
 * 1、安装Redis：使用docker；
 * 2、引入Redis的starter
 * 3、配置Redis
 * 4、测试缓存
 *      原理：CacheManager===Cache 缓存组件来实际给缓存中存取数据
 *      1）、引入Redis的starter，容器中保存的是RedisCacheManager;
 *      2）、RedisCacheManager 帮我们创建RedisCache 来作为缓存组件；RedisCache通过操作Redis缓存数据
 *      3）、默认保存数据k-v都是Object；利用序列化保存；如何保存为json
 *          1、引入了Redis的starter，CacheManager变为 RedisCacheManager;
 *          2、默认创建的 RedisCacheManager 操作Redis的时候使用的是RedisTemplate<Object, Object>
 *          3、RedisTemplate<Object, Object>是默认使用jdk的序列化机制
 *      4）、自定义CacheManager
  */
@MapperScan("com.yxy.cache.mapper")
@SpringBootApplication
@EnableCaching
public class Springboot01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01CacheApplication.class, args);
    }

}
