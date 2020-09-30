package top.myfyc.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.myfyc.www.config.MyConfigBean;
import top.myfyc.www.domain.Persion;

import java.util.Date;

/**
 * 提供一个Rest方法
 */
@RestController
@RequestMapping(value =  "/api",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "/persion" , method = RequestMethod.GET)
    public Persion getPersion(){
        Persion persion = new Persion();
        persion.setId(11);
        persion.setName("12313");
        persion.setBirthday(new Date());
        System.out.println("------------");
        System.out.println("myConfigBean "+myConfigBean.getMyName());
        System.out.println("------------");
        return persion;
    }
}
