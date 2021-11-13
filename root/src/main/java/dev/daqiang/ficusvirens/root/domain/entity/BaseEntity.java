package dev.daqiang.ficusvirens.root.domain.entity;

import java.util.Date;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/12/19
 * Package dev.daqiang.ficusvirens.root.domain.entity in ficus-virens
 */
public abstract class BaseEntity {
    Long createBy;

    Date createTime;

    Long lastUpdateBy;

    Date lastUpdateTime;

    Long objectVersionNumber;

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }
}
