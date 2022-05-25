package com.example.seckilldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seckilldemo.entity.TSeckillGoods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品表 Mapper 接口
 *
 */
@Mapper
public interface TSeckillGoodsMapper extends BaseMapper<TSeckillGoods> {

}
