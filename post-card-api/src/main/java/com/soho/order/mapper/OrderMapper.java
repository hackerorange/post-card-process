package com.soho.order.mapper;

import com.soho.order.entity.OrderEntity.OrderEntity;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    
    void insertOrder(@Param("orderEntity") OrderEntity orderEntity);
    
    
}
