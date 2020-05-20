package com.goodstrade.goodstrade.Controller;

import com.goodstrade.goodstrade.Model.Product;
import com.goodstrade.goodstrade.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getProductAllProduct(ModelMap model){
        List<Product> allProducts = productService.getAllProducts();
        model.addAttribute("allProducts",allProducts);
        return "index";
    }

    @GetMapping("{id}")
    public String getProductDetailById(@PathVariable Long id, ModelMap model) {
        Product productId = productService.getProductDetailById(id);
        model.addAttribute("productDetail", productId);
        return "productDetail";
    }



}
