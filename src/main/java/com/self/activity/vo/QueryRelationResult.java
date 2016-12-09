package com.self.activity.vo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="QueryRelationResult",description="关系人")
public class QueryRelationResult {
	
	@ApiModelProperty(value="关系Id",notes="关系ID")
    private Long id;

	@ApiModelProperty(value="客户Id",notes="客户ID")
    private String custormerId;

	@ApiModelProperty(value="关系客户Id",notes="关系客户ID")
    private String relationCustomerId;

	@ApiModelProperty(value="关系类型Id",notes="关系类型ID")
    private String relationTypeId;
	
	@ApiModelProperty(value="版本",notes="版本")
    private Integer versionNo;
	
	@ApiModelProperty(value="创建人ID",notes="创建人ID")
    private Long createdById;
	
	@ApiModelProperty(value="创建时间",notes="创建人时间",hidden=true)
    private Date createdTime;
	
	@ApiModelProperty(value="更新人ID",notes="更新人Id")
    private Long lastUpdatedById;
	
	@ApiModelProperty(value="更新时间",notes="更新时间")
    private Date lastUpdatedTime;
	
	@ApiModelProperty(value="删除标志",notes="删除标志")
    private Boolean deletedFlag;
	
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCustormerId() {
        return custormerId;
    }
    public void setCustormerId(String custormerId) {
        this.custormerId = custormerId;
    }
    public String getRelationCustomerId() {
        return relationCustomerId;
    }
    public void setRelationCustomerId(String relationCustomerId) {
        this.relationCustomerId = relationCustomerId;
    }
    public String getRelationTypeId() {
        return relationTypeId;
    }
    public void setRelationTypeId(String relationTypeId) {
        this.relationTypeId = relationTypeId;
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
