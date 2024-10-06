package com.tom.springmvc.controller.annotation;

import com.tom.springmvc.model.bankcard.BankCardAppService;
import com.tom.springmvc.model.bankcard.BankCardDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BankCardAnnotationController.java
 * @Description TODO
 * @createTime 2024年10月04日 11:55:00
 */
@Controller
@RequestMapping("/helloWorld")
public class HelloWorldAnnotationControllerWithModelAttribute {

    private final BankCardAppService bankCardAppService;

    public HelloWorldAnnotationControllerWithModelAttribute(BankCardAppService bankCardAppService) {
        this.bankCardAppService = bankCardAppService;
    }

    @ModelAttribute("tips")
    public String helloWorld(@RequestParam("k1") String userName) throws Exception {
        System.out.println("@ModelAttribute annotates helloWorld() userName=" + userName);
        return "hello world";
    }

    @ModelAttribute
    public void helloWorld2(ModelMap modelMap) throws Exception {
        System.out.println("@ModelAttribute annotates helloWorld2()");
        modelMap.addAttribute("tips2", "hello world 2");
    }

    @RequestMapping(value = "/helloWorld3", consumes = {"text/plain;charset=UTF-8", "text/html;charset=UTF-8"}, produces = {"application/json;charset=UTF-8"}
            , method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWorld3(@RequestParam("k1") String userName, ModelMap modelMap) throws Exception {
        System.out.println("@RequestMapping helloWorld3(): userName=" + userName);
        System.out.println("@RequestMapping helloWorld3():  tips = " + modelMap.getAttribute("tips"));
        System.out.println("@RequestMapping helloWorld3():  tips2 = " + modelMap.getAttribute("tips2"));
        return "helloWorld";
    }

    @RequestMapping(value = "/helloWorld4", consumes = {"text/plain;charset=UTF-8", "text/html;charset=UTF-8"}, produces = {"application/json;charset=UTF-8"}
            , method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWorld4(@ModelAttribute("bankCardDto") BankCardDto bankCardDto, ModelMap modelMap) throws Exception {
        System.out.println("@RequestMapping helloWorld4()");
        modelMap.addAttribute("bankCardDto", bankCardDto);
        bankCardDto.setId(1L);
        bankCardDto.setRemark(String.valueOf(modelMap.getAttribute("tips")));
        return "helloWorld";
    }


}
