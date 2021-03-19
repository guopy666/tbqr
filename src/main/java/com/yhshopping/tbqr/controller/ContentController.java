package com.yhshopping.tbqr.controller;

import com.yhshopping.tbqr.config.AppConfig;
import com.yhshopping.tbqr.config.ValueConfig;
import com.yhshopping.tbqr.service.ITbcontentService;
import com.yhshopping.tbqr.service.ITbqrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ContentController
 * @Description
 * @Author guopy
 * @Date 2021/3/13 18:53
 */
@RestController
@RequestMapping("/content")
public class ContentController {
    @Autowired
    private ITbcontentService tbcontentService;

    @Autowired
    private ITbqrService tbqrService;

    @GetMapping("/getcode")
    public String getCode(){
        String latest = tbcontentService.getLatest();
        return latest;
    }

    @GetMapping("/getimg")
    public String getImgSrc(){
        String latest = tbqrService.getLatest();
        return latest;
    }

}
