package com.yhshopping.tbqr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yhshopping.tbqr.entity.Tbcontent;
import com.yhshopping.tbqr.dao.TbcontentMapper;
import com.yhshopping.tbqr.service.ITbcontentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TbcontentServiceImpl extends ServiceImpl<TbcontentMapper, Tbcontent> implements ITbcontentService {

    @Override
    public String getLatest() {

        LambdaQueryWrapper<Tbcontent> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Tbcontent::getIsEnable, 1)
                .last("limit 1");
        List<Tbcontent> tbcontents = list(queryWrapper);
        if (tbcontents.size()>0){
            return tbcontents.get(0).getContent();
        }
        return null;
    }
}
