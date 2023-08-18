package edu.miu.cs.cs425.sweprojectmycopy.controller;

import edu.miu.cs.cs425.sweprojectmycopy.service.IPaymentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/webshop/app/v1/payment")
public class PaymentInfoController {

    IPaymentInfoService paymentInfoService;

    @Autowired
    public PaymentInfoController(IPaymentInfoService paymentInfoService) {
        this.paymentInfoService = paymentInfoService;
    }
}
