package com.yhshopping.tbqr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @author: guopy
 * @Date: 2021/3/11 09:20
 * @version: v1.0.0
 */
@Controller
public class PageController {

    @RequestMapping(value = {"/", "/index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = {"/newindex.html"})
    public String indexNew(){
        return "index_new";
    }

}