package com.self.activity.vo;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="QueryAddressResult",description="地址查询结果")
public class QueryAddressResult {
	@ApiModelProperty(value="地址唯一id",notes="地址唯一id")
    private Long id;
	@ApiModelProperty(value="客户ID",notes="客户id")
    private String customerId;
	@ApiModelProperty(value="地址类型ID",notes="地址类型id")
    private Integer typeId;
	@ApiModelProperty(value="省ID",notes="省id")
    private String stateId;
	@ApiModelProperty(value="市ID",notes="市id")
    private String cityId;
	@ApiModelProperty(value="区县ID",notes="区县id")
    private String districtId;
	@ApiModelProperty(value="详细地址",notes="详细地址")
    private String subdistrict;
	@ApiModelProperty(value="邮政编码",notes="邮政编码")
    private String postalCode;
	@ApiModelProperty(value="固定电话",notes="固定电话")
    private String tel;
	@ApiModelProperty(value="社区ID",notes="社区ID")
    private Integer communityId;
	@ApiModelProperty(value="分区ID",notes="分区ID")
    private Integer partCommunityId;
	@ApiModelProperty(value="楼号",notes="楼号")
    private String bldgnum;
	@ApiModelProperty(value="房号",notes="房号")
    private String roomnum;
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
    private String deletedFlag;
	
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
    public String getStateId() {
        return stateId;
    }
    public void setStateId(String stateId) {
        this.stateId = stateId;
    }
    public String getCityId() {
        return cityId;
    }
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
    public String getDistrictId() {
        return districtId;
    }
    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }
    public String getSubdistrict() {
        return subdistrict;
    }
    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public Integer getCommunityId() {
        return communityId;
    }
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }
    public Integer getPartCommunityId() {
        return partCommunityId;
    }
    public void setPartCommunityId(Integer partCommunityId) {
        this.partCommunityId = partCommunityId;
    }
    public String getBldgnum() {
        return bldgnum;
    }
    public void setBldgnum(String bldgnum) {
        this.bldgnum = bldgnum;
    }
    public String getRoomnum() {
        return roomnum;
    }
    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
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
    public String getDeletedFlag() {
        return deletedFlag;
    }
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag;
    }
}
