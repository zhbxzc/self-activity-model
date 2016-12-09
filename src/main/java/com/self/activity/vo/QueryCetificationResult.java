package com.self.activity.vo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="QueryCetificationResult",description="证件信息")
public class QueryCetificationResult {
	
	@ApiModelProperty(value="证件唯一id",notes="证件唯一id")
    private Long id;

	@ApiModelProperty(value="客户id",notes="客户id")
    private String customerId;

	@ApiModelProperty(value="证件类型ID",notes="证件类型Id")
    private Integer typeId;

	@ApiModelProperty(value="证件号码",notes="证件号码")
    private String code;

	@ApiModelProperty(value="过期日期",notes="过期日期")
    private Date expiryDate;

	@ApiModelProperty(value="版本",notes="版本",hidden=true)
    private Integer versionNo;

	@ApiModelProperty(value="创建人ID",notes="创建人ID")
    private Long createdById;

	@ApiModelProperty(value="创建时间",notes="创建时间",hidden=true)
    private Date createdTime;

	@ApiModelProperty(value="更新人ID",notes="更新人ID")
    private Long lastUpdatedById;

	@ApiModelProperty(value="更新时间",notes="更新时间",hidden=true)
    private Date lastUpdatedTime;

	@ApiModelProperty(value="删除标志",notes="删除标志",hidden=true)
    private Boolean deletedFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getLastUpdatedById() {
        return lastUpdatedById;
    }

    public void setLastUpdatedById(Long lastUpdatedById) {
        this.lastUpdatedById = lastUpdatedById;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }
}
