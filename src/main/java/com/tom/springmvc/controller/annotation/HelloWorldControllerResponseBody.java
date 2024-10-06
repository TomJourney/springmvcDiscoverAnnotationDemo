package com.tom.springmvc.controller.annotation;

import com.tom.springmvc.model.bankcard.BankCardAppService;
import com.tom.springmvc.model.bankcard.BankCardDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName HelloWorldAnnotationControllerRequestResponseBody.java
 * @Description TODO
 * @createTime 2024年10月04日 11:55:00
 */
@Controller
@RequestMapping("/helloWorldControllerResponseBody")
public class HelloWorldControllerResponseBody {

    private final BankCardAppService bankCardAppService;

    public HelloWorldControllerResponseBody(BankCardAppService bankCardAppService) {
        this.bankCardAppService = bankCardAppService;
    }

    @RequestMapping(value = "/helloWorldResponseBody", consumes = {"application/json;charset=UTF-8"}
            , produces = {"application/json;charset=UTF-8"}
            , method = {RequestMethod.POST})
    @ResponseBody
    public List<BankCardDto> helloWorldResponseBody() throws Exception {
        System.out.println("@RequestMapping @ResponseBody helloWorldResponseBody()");
        return bankCardAppService.listCard();
    }
}
