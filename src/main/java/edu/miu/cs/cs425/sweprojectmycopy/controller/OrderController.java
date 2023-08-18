package edu.miu.cs.cs425.sweprojectmycopy.controller;

import edu.miu.cs.cs425.sweprojectmycopy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/webshop/app/v1/order")
public class OrderController {

    IOrderService orderService;

    @Autowired
    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }
}
