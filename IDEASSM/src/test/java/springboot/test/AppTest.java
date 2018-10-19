package springboot.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.SpringBootDemo;

/**
 * Created by Administrator on 2018/10/17.
 */

@RunWith(SpringRunner.class)    //启动spring的工厂
@SpringBootTest(classes = SpringBootDemo.class) //开启springboot的自动配置
public class AppTest {
}
