package edu.wctc.lab3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/detail")
    public String showProductDetails() {
        return "pages/orders/product-detail.html";
    }
}
