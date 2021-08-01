package com.boot;

import com.boot.config.ScanClassProperties;
import com.boot.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 游政杰
 * @Date 2021/8/1
 */
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class) //*********************暂时这样写，到时要改
@SpringBootApplication
@Import(SwaggerConfig.class) //导入swaggerConfig的配置类
@EnableSwagger2  //开启Swagger2
@EnableConfigurationProperties(ScanClassProperties.class)
@EnableFeignClients //开启openFeign客户端
@EnableDiscoveryClient
public class WebApplication81 {

  public static void main(String[] args) {
      SpringApplication.run(WebApplication81.class,args);
  }
}
