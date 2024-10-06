package com.tom.springmvc.controller.annotation;

import com.tom.springmvc.model.bankcard.BankCardAppService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BankCardAnnotationController.java
 * @Description TODO
 * @createTime 2024年10月04日 11:55:00
 */
@Controller
@RequestMapping("/bankCardAnnotationControllerWithRequestParam")
public class BankCardAnnotationControllerWithRequestParam {

    private final BankCardAppService bankCardAppService;

    public BankCardAnnotationControllerWithRequestParam(BankCardAppService bankCardAppService) {
        this.bankCardAppService = bankCardAppService;
    }

    @RequestMapping(value = "/annotationQryCardList", consumes = {"text/plain;charset=UTF-8"}, produces = {"text/html;charset=UTF-8"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView qryCardList(@RequestParam("k1") String userName) throws Exception {
        System.out.println("userName=" + userName);
        ModelAndView modelAndView = new ModelAndView("bankCardListPage");
        modelAndView.addObject("bankCardList", bankCardAppService.listCard());
        return modelAndView;
    }
}
