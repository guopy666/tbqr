package com.yhshopping.tbqr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yhshopping.tbqr.dao.TbqrMapper;
import com.yhshopping.tbqr.entity.Tbqr;
import com.yhshopping.tbqr.service.ITbqrService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guopy
 * @since 2021-03-13
 */
@Service
public class TbqrServiceImpl extends ServiceImpl<TbqrMapper, Tbqr> implements ITbqrService {

    @Override
    public String getLatest() {
        LambdaQueryWrapper<Tbqr> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Tbqr::getIsEnable, 1)
                .last("limit 1");
        List<Tbqr> tbqrs = list(queryWrapper);
        if (tbqrs.size()>0){
            return tbqrs.get(0).getImgsrc();
        }
        return null;
    }
}
