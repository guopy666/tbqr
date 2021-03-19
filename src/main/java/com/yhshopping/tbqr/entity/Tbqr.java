package com.yhshopping.tbqr.entity;

import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author guopy
 * @since 2021-03-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Tbqr extends BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 二维码图片路径
     */
    private String imgsrc;



}
