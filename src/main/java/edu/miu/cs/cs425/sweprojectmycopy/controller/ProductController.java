package edu.miu.cs.cs425.sweprojectmycopy.controller;

import edu.miu.cs.cs425.sweprojectmycopy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/webshop/app/v1/product")
public class ProductController {

    private IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }
}
