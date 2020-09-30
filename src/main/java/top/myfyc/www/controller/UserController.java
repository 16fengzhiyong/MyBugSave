package top.myfyc.www.controller;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.myfyc.www.config.ErrorClass;
import top.myfyc.www.domain.Persion;

import javax.validation.Valid;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping(value = "/user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/login")
    public Object UserLogin(@Valid String name, @Valid String password){
        if (null == name || password == null){
            return ErrorClass.ERROR_PLEASE_RELOGIN;
        }
        if (name.equals(password) ){
            Persion persion = new Persion();
            persion.setId(11);
            persion.setName("12313");
            persion.setBirthday(new Date());
            return JSONParser.quote(persion.toString());
        }
//        password = "1qaz2wsx";
        return "ok"+name+password;
    }


}
