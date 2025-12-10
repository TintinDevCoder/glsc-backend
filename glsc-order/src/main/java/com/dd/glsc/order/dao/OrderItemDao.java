package com.dd.glsc.order.dao;

import com.dd.glsc.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author dd
 * @email 18211882344@163.com
 * @date 2025-12-05 15:47:19
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
