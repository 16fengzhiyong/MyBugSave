package top.myfyc.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 会扫描当前包下的Controller和子包下的Controller，并列包不会扫描
 * 最好是单独存在
 */

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}
