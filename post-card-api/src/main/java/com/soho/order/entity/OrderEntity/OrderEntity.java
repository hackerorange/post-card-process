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
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCustomerTaobaoId() {
        return customerTaobaoId;
    }
    
    public void setCustomerTaobaoId(String customerTaobaoId) {
        this.customerTaobaoId = customerTaobaoId;
    }
    
    public Boolean getUrgent() {
        return urgent;
    }
    
    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }
    
    public String getProcessorName() {
        return processorName;
    }
    
    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }
    
    public String getProcessStatus() {
        return processStatus;
    }
    
    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }
    
    public String getPaperType() {
        return paperType;
    }
    
    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }
    
    public String getProcessorId() {
        return processorId;
    }
    
    public void setProcessorId(String processorId) {
        this.processorId = processorId;
    }
    
    public String getCreateUserId() {
        return createUserId;
    }
    
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public String getUpdateUserId() {
        return updateUserId;
    }
    
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
