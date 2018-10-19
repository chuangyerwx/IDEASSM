package springboot.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)     //声明注解的使用位置 （自定义注解必须加在方法上）
@Retention(RetentionPolicy.RUNTIME)     //项目运行时注解生效
public @interface LogAnnotation {
    String name();      //自定义注解的属性相当于接口中的方法
}
