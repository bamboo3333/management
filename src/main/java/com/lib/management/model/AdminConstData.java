package com.lib.management.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdminConstData {
    private String constKey;

    private BigDecimal constValue;

    private Integer updateBy;

    private Date updateTime;

    public String getConstKey() {
        return constKey;
    }

    public void setConstKey(String constKey) {
        this.constKey = constKey == null ? null : constKey.trim();
    }

    public BigDecimal getConstValue() {
        return constValue;
    }

    public void setConstValue(BigDecimal constValue) {
        this.constValue = constValue;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}