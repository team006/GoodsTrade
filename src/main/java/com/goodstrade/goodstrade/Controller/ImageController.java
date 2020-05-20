package com.goodstrade.goodstrade.Controller;

import com.goodstrade.goodstrade.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ImageController {

    @Autowired
    private ImageService imageService;
}
