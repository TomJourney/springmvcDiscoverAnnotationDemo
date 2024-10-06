package com.tom.springmvc.controller.annotation;

import com.tom.springmvc.model.bankcard.BankCardDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName HelloWorldAnnotationControllerRequestResponseBody.java
 * @Description TODO
 * @createTime 2024年10月04日 11:55:00
 */
@Controller
@RequestMapping("/helloWorldControllerRequestBody")
public class HelloWorldControllerRequestBody {

    public HelloWorldControllerRequestBody() {
        // do nothing.
    }

    @RequestMapping(value = "/helloWorldRequestBody", consumes = {"application/json;charset=UTF-8"}
            , produces = {"text/html;charset=UTF-8", "application/json;charset=UTF-8"}
            , method = {RequestMethod.POST})
    public String helloWorldRequestBody(@RequestBody BankCardDto bankCardDto, ModelMap modelMap) throws Exception {
        System.out.println("@RequestMapping @RequestBody helloWorldRequestBody()");
        modelMap.addAttribute("bankCardDto", bankCardDto);
        bankCardDto.setRemark(bankCardDto.getCardNo() + "-@RequestBody备注");
        return "helloWorld";
    }
}
