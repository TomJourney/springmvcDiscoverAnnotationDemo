package com.tom.springmvc.controller;

import com.tom.springmvc.model.bankcard.BankCardAppService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO
 * @createTime 2024年09月21日 16:57:00
 */
@Controller
public class BankCardController {

    private BankCardAppService bankCardAppService;

    public BankCardController(BankCardAppService bankCardAppService) {
        this.bankCardAppService = bankCardAppService;
    }

    @RequestMapping("/bankCardList")
    public ModelAndView bankCardList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView("bankCardListPage");
        modelAndView.addObject("bankCardList", bankCardAppService.listCard());
        return modelAndView;
    }
}
