package top.myfyc.www.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 装配标识 表示这个类为实例化获取类
 * 在controller中定义信息 配合 @Autowired
 * 会自动在@Configuration注解的类中寻找相同值的初始化方法
 */
@Configuration
public class MyConfig {

    /**
     * 标识这是一个类对象 每个返回都需要加
     */
    @Bean
    public MyConfigBean MyConfigBean(){
        return new MyConfigBean();
    }
}
