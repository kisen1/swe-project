package edu.miu.cs.cs425.sweprojectmycopy.controller;

import edu.miu.cs.cs425.sweprojectmycopy.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShoppingCartController {

    private IShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(IShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }
}
