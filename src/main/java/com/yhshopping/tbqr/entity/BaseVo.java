package com.yhshopping.tbqr.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName BaseVo
 * @Description
 * @Author guopy
 * @Date 2021/3/13 18:57
 */
@Data
public class BaseVo {
    @TableId
    private Long id;
    private Date addTime;
    @TableField(fill = FieldFill.INSERT)
    private Date updateTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Boolean isEnable;

}
