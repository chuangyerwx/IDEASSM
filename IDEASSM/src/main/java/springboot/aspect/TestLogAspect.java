package springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class TestLogAspect {

    @Pointcut(value = "execution(* springboot.service.*.*(..))")
    public void kong(){}

/*    @Before(value = "kong()")
    public void testBefore(JoinPoint jp){

        //参数列表
        Object[] args = jp.getArgs();
        //切入点的方式
        String kind = jp.getKind();
        //原始service对象
        Object target = jp.getTarget();
        //代理类
        Object aThis = jp.getThis();
        //方法对象
        Signature signature = jp.getSignature();
    }*/

/*    @After(value = "kong()")
    public void testAfter(){
        System.out.println("前置增强");
    }*/

    @Around(value = "kong()")
    public Object testAround(ProceedingJoinPoint pjp){
        System.out.println("方法执行之前");

        Object proceed = null;

        try{
            proceed = pjp.proceed();
        }catch (Throwable t){
            t.printStackTrace();
        }
        System.out.println("方法执行之后");
        return proceed;

    }
}
