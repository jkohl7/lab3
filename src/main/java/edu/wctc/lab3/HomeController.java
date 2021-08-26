package edu.wctc.lab3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String placeOrderPage() {
        return "pages/orders/place-order.html";
    }

    @RequestMapping("/view-cart")
    public String ViewCartPage() {
        return "pages/catalog/cart.html";
    }

    @RequestMapping("/search")
    public String doRedirect() {
        return "redirect:http://google.com";
    }
}