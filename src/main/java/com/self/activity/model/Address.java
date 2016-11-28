package com.self.activity.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="客户基本信息",description="客户基本信息")
public class Address {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="地址唯一id",notes="地址唯一id")
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.customer_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="客户ID",notes="客户id")
    private Long customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.type_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="地址类型ID",notes="地址类型id")
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.state_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="省ID",notes="省id")
    private String stateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.city_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="市ID",notes="市id")
    private String cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.district_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="区县ID",notes="区县id")
    private String districtId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.subdistrict
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="详细地址",notes="详细地址")
    private String subdistrict;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.postal_code
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="邮政编码",notes="邮政编码")
    private String postalCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.tel
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="固定电话",notes="固定电话")
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.community_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="社区ID",notes="社区ID")
    private Integer communityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.part_community_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="分区ID",notes="分区ID")
    private Integer partCommunityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.bldgnum
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="楼号",notes="楼号")
    private String bldgnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.roomnum
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="房号",notes="房号")
    private String roomnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.version_no
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="版本",notes="版本",hidden=true)
    private Integer versionNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.created_by_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="创建人ID",notes="创建人ID")
    private Long createdById;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.created_time
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="创建时间",notes="创建时间",hidden=true)
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.last_updated_by_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="更新人ID",notes="更新人ID")
    private Long lastUpdatedById;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.last_updated_time
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="更新时间",notes="更新时间",hidden=true)
    private Date lastUpdatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_address.deleted_flag
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
	@ApiModelProperty(value="删除标志",notes="删除标志",hidden=true)
    private Boolean deletedFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.id
     *
     * @return the value of cu_address.id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.id
     *
     * @param id the value for cu_address.id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.customer_id
     *
     * @return the value of cu_address.customer_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.customer_id
     *
     * @param customerId the value for cu_address.customer_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.type_id
     *
     * @return the value of cu_address.type_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.type_id
     *
     * @param typeId the value for cu_address.type_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.state_id
     *
     * @return the value of cu_address.state_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.state_id
     *
     * @param stateId the value for cu_address.state_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.city_id
     *
     * @return the value of cu_address.city_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.city_id
     *
     * @param cityId the value for cu_address.city_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.district_id
     *
     * @return the value of cu_address.district_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.district_id
     *
     * @param districtId the value for cu_address.district_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.subdistrict
     *
     * @return the value of cu_address.subdistrict
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getSubdistrict() {
        return subdistrict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.subdistrict
     *
     * @param subdistrict the value for cu_address.subdistrict
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setSubdistrict(String subdistrict) {
        this.subdistrict = subdistrict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.postal_code
     *
     * @return the value of cu_address.postal_code
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.postal_code
     *
     * @param postalCode the value for cu_address.postal_code
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.tel
     *
     * @return the value of cu_address.tel
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.tel
     *
     * @param tel the value for cu_address.tel
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.community_id
     *
     * @return the value of cu_address.community_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.community_id
     *
     * @param communityId the value for cu_address.community_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.part_community_id
     *
     * @return the value of cu_address.part_community_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Integer getPartCommunityId() {
        return partCommunityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.part_community_id
     *
     * @param partCommunityId the value for cu_address.part_community_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setPartCommunityId(Integer partCommunityId) {
        this.partCommunityId = partCommunityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.bldgnum
     *
     * @return the value of cu_address.bldgnum
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getBldgnum() {
        return bldgnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.bldgnum
     *
     * @param bldgnum the value for cu_address.bldgnum
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setBldgnum(String bldgnum) {
        this.bldgnum = bldgnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.roomnum
     *
     * @return the value of cu_address.roomnum
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public String getRoomnum() {
        return roomnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.roomnum
     *
     * @param roomnum the value for cu_address.roomnum
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.version_no
     *
     * @return the value of cu_address.version_no
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Integer getVersionNo() {
        return versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.version_no
     *
     * @param versionNo the value for cu_address.version_no
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.created_by_id
     *
     * @return the value of cu_address.created_by_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Long getCreatedById() {
        return createdById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.created_by_id
     *
     * @param createdById the value for cu_address.created_by_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.created_time
     *
     * @return the value of cu_address.created_time
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.created_time
     *
     * @param createdTime the value for cu_address.created_time
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.last_updated_by_id
     *
     * @return the value of cu_address.last_updated_by_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Long getLastUpdatedById() {
        return lastUpdatedById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.last_updated_by_id
     *
     * @param lastUpdatedById the value for cu_address.last_updated_by_id
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setLastUpdatedById(Long lastUpdatedById) {
        this.lastUpdatedById = lastUpdatedById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.last_updated_time
     *
     * @return the value of cu_address.last_updated_time
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.last_updated_time
     *
     * @param lastUpdatedTime the value for cu_address.last_updated_time
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_address.deleted_flag
     *
     * @return the value of cu_address.deleted_flag
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_address.deleted_flag
     *
     * @param deletedFlag the value for cu_address.deleted_flag
     *
     * @mbggenerated Fri Nov 25 09:37:25 CST 2016
     */
    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }
}