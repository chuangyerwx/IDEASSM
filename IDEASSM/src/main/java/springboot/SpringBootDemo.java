package springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/10/16.
 */

//@Configuration                声明当前类为配置类
//@EnableAutoConfiguration      开启自动配置
//@ComponentScan                扫描包 将加有@Service @Controller @Component @Repository 的类、并将这些类交给Spring工厂管理
@SpringBootApplication
@MapperScan("springboot.dao")   //指定dao的位置 相当于basePackage标签
public class SpringBootDemo {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDemo.class,args);
    }
}
