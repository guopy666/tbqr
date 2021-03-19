package com.yhshopping.tbqr.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName ValueConfig
 * @Description
 * @Author guopy
 * @Date 2021/3/14 14:20
 */
@Component
public class ValueConfig {
    public static String IMGPATH;

    @Value("${imgurl.path}")
    public void setIMGPATH(String path) {
        IMGPATH = path;
    }
}
