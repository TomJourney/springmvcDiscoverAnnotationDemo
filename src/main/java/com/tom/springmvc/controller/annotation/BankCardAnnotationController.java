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
public class BankCardAnnotationController {

    private BankCardAppService bankCardAppService;

    public BankCardAnnotationController(BankCardAppService bankCardAppService) {
        System.out.println("BankCardAnnotationController created");
        this.bankCardAppService = bankCardAppService;
    }

    @RequestMapping(value = "/annotationQryCardList", method = RequestMethod.GET)
    public ModelAndView qryCardList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("qryCardList accessed");
        ModelAndView modelAndView = new ModelAndView("bankCardListPage");
        modelAndView.addObject("bankCardList", bankCardAppService.listCard());
        return modelAndView;
    }
}
