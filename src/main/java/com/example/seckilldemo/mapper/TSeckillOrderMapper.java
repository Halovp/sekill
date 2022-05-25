package com.example.seckilldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seckilldemo.entity.TSeckillOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀订单表 Mapper 接口
 *
 */
@Mapper
public interface TSeckillOrderMapper extends BaseMapper<TSeckillOrder> {

}
