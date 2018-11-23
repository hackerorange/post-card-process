package com.soho.order.entity.OrderEntity;

import lombok.Data;

import java.util.Date;

@Data
public class OrderEntity {
    private Long id;
    private String customerTaobaoId;
    private Boolean urgent;
    private String processorName;
    private String processStatus;
    private String paperType;
    private String processorId;
    private String createUserId;
    private Date createTime;
    private String updateUserId;
    private Date updateTime;
    
}
