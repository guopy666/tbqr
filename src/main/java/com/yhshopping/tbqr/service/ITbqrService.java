package com.yhshopping.tbqr.service;

import com.yhshopping.tbqr.entity.Tbqr;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author guopy
 * @since 2021-03-13
 */
public interface ITbqrService extends IService<Tbqr> {

    String getLatest();
}
