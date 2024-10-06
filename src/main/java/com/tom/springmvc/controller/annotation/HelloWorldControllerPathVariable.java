package com.tom.springmvc.controller.annotation;

import com.tom.springmvc.model.bankcard.BankCardAppService;
import com.tom.springmvc.model.bankcard.BankCardDto;
import com.tom.springmvc.model.user.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName HelloWorldAnnotationControllerRequestResponseBody.java
 * @Description TODO
 * @createTime 2024年10月04日 11:55:00
 */
@Controller
@RequestMapping("/sichuan")
public class HelloWorldControllerPathVariable {

    private final BankCardAppService bankCardAppService;

    public HelloWorldControllerPathVariable(BankCardAppService bankCardAppService) {
        this.bankCardAppService = bankCardAppService;
    }

    @RequestMapping(value = "/{city}/{user}", consumes = {"application/json;charset=UTF-8"}
            , produces = {"application/json;charset=UTF-8"}
            , method = {RequestMethod.POST})
    @ResponseBody
    public UserDto findUser(@PathVariable("city") String city, @PathVariable("user") String userName) throws Exception {
        return UserDto.build(System.currentTimeMillis(), userName, city);
    }
}
