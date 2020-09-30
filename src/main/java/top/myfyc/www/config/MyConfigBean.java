package top.myfyc.www.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * 配置类 调用 yml文件中的配置
 * 不可以直接使用 应由另一类实例化
 */
public class MyConfigBean {
    @Value("${myConfig.myObject.myName}")
    private String myName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
