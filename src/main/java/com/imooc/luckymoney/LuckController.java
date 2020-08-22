package com.imooc.luckymoney;

import com.imooc.mapper.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckController {
    @Autowired
    private LimitConfig limitConfig;
     @GetMapping("/hello")
    public String say (){

        return limitConfig.getMaxManey() ;
    }
}
