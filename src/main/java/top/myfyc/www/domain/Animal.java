package top.myfyc.www.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "animal")
public class Animal {
    String name;
    String age;
    String birth;
    Map<String,Object> maps;
    List<Object> list;


//    name: dog
//    age: 2
//    birth: 2017/12/12
//    maps: {key1: value1,key2: value2}
//    list:
//            - item1
//    - item2
//    next:
//    debug: false
}
