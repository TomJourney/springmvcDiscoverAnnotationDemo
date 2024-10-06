package com.tom.springmvc.controller.annotation;

import com.tom.springmvc.model.bankcard.BankCardAppService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BankCardAnnotationController.java
 * @Description TODO
 * @createTime 2024年10月04日 11:55:00
 */
@Controller
@RequestMapping("/annotation2")
public class BankCardAnnotationController2 {

    private final BankCardAppService bankCardAppService;

    public BankCardAnnotationController2(BankCardAppService bankCardAppService) {
        this.bankCardAppService = bankCardAppService;
    }

    @RequestMapping(value = "/annotationQryCardList", params = {"k1=v1", "k2=v2"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView qryCardList(String k1, String k2) throws Exception {
        System.out.println("qryCardList accessed");
        System.out.println("k1=" + k1 + ", k2=" + k2);
        ModelAndView modelAndView = new ModelAndView("bankCardListPage");
        modelAndView.addObject("bankCardList", bankCardAppService.listCard());
        return modelAndView;
    }
}
