package com.goodstrade.goodstrade.Controller;

import com.goodstrade.goodstrade.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
}
