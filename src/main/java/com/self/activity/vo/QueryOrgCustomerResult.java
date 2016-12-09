package com.self.activity.vo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="客户授权使用机构",description="客户授权使用机构")
public class QueryOrgCustomerResult {

	@ApiModelProperty(value="客户ID",notes="客户ID")
    private String customerId;

	@ApiModelProperty(value="机构ID",notes="机构ID")
    private Integer orgId;
	
	@ApiModelProperty(value="版本",notes="版本",hidden=true)
    private Integer versionNo;

	@ApiModelProperty(value="创建人Id",notes="创建人ID")
    private Long createdById;

	@ApiModelProperty(value="创建时间",notes="创建时间",hidden=true)
    private Date createdTime;

	@ApiModelProperty(value="更新人ID",notes="更新人ID")
    private Long lastUpdatedById;

	@ApiModelProperty(value="更新时间",notes="更新时间",hidden=true)
    private Date lastUpdatedTime;

	@ApiModelProperty(value="删除标志",notes="删除标志",hidden=true)
    private Boolean deletedFlag;


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
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
