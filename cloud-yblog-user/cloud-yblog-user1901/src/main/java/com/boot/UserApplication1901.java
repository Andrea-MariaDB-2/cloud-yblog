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

@SpringBootApplication//SpringBoot启动类，排除SpringSecurity自动配置类
@Import(SwaggerConfig.class) //导入swaggerConfig的配置类
@EnableSwagger2  //开启Swagger2
@EnableConfigurationProperties(ScanClassProperties.class)
@EnableFeignClients
@EnableDiscoveryClient
public class UserApplication1901 {

  public static void main(String[] args) {
      SpringApplication.run(UserApplication1901.class,args);
  }
}
