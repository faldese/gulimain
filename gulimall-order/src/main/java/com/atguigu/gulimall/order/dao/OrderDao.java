package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cn
 * @email lafaldse114@gmail.com
 * @date 2024-12-07 23:13:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
