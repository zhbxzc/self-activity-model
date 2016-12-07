package com.self.activity.vo;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

public class QueryCustResult {
	@ApiModelProperty(value="客户id",notes="客户id")
    private String id;
	@ApiModelProperty(value="客户类型",notes="客户类型",hidden=true)
    private Integer typeId;
    @ApiModelProperty(value="编码",notes="客户编码",hidden=true)
    private String code;
    @ApiModelProperty(value="名称",notes="客户名称")
    private String name;
    @ApiModelProperty(value="描述",notes="客户描述",hidden=true)
    private String des;
    @ApiModelProperty(value="性别id",notes="客户性别id")
    private Integer sexId;
    @ApiModelProperty(value="出生日期",notes="客户出生日期",dataType="Date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date birthday;
    @ApiModelProperty(value="身份证号",notes="客户身份证号")
    private String idCardNo;
    @ApiModelProperty(value="电子邮箱",notes="客户电子邮箱")
    private String email;
    @ApiModelProperty(value="移动电话",notes="客户移动电话")
    private String mobile;
    @ApiModelProperty(value="固定电话",notes="客户固定电话")
    private String tel;
    @ApiModelProperty(value="国籍id",notes="客户国籍id",hidden=true)
    private Integer countryId;
    @ApiModelProperty(value="民族id",notes="客户民族id",hidden=true)
    private Integer nationId;
    @ApiModelProperty(value="语种id",notes="客户语种id",hidden=true)
    private Integer languageId;
    @ApiModelProperty(value="政治面貌id",notes="客户政治面貌id",hidden=true)
    private Integer politicsId;
    @ApiModelProperty(value="教育程度id",notes="客户教育程度id",hidden=true)
    private Integer educationId;
    @ApiModelProperty(value="学位id",notes="客户学位id",hidden=true)
    private Integer degreeId;
    @ApiModelProperty(value="职业id",notes="客户职业id",hidden=true)
    private Integer occupationId;
    @ApiModelProperty(value="单位名称",notes="客户单位名称",hidden=true)
    private String orgName;
    @ApiModelProperty(value="婚姻状态id",notes="客户婚姻状态id")
    private Integer marriedFlag;
    @ApiModelProperty(value="注册机构id",notes="客户注册机构id",hidden=true)
    private Integer registOrgId;
    @ApiModelProperty(value="注册时间",notes="客户注册时间",hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date registTime;
    @ApiModelProperty(value="主索引标记",notes="客户主索引标记",hidden=true)
    private Boolean mainIndexFlag;
    @ApiModelProperty(value="拼音码",notes="客户拼音码",hidden=true)
    private String spellNo;
    @ApiModelProperty(value="五笔码",notes="客户五笔码",hidden=true)
    private String wubiNo;
    @ApiModelProperty(value="版本号",notes="客户版本号",hidden=true)
    private Integer versionNo;
    @ApiModelProperty(value="创建者id",notes="客户创建者id",hidden=true)
    private Long createdById;
    @ApiModelProperty(name="创建时间",notes="创建时间",hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;
    @ApiModelProperty(value="最近更新者id",notes="客户最近更新者id",hidden=true)
    private Long lastUpdatedById;
    @ApiModelProperty(name="最近更新时间",notes="最近更新时间",hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastUpdatedTime;
    @ApiModelProperty(value="删除标记",notes="客户删除标记",hidden=true)
    private Boolean deletedFlag;
    @ApiModelProperty(name="昵称",notes="昵称")
    private String nickname;
    @ApiModelProperty(value="居住情况id",notes="客户居住情况id",hidden=true)
    private Integer livestateId;
    @ApiModelProperty(value="养老机构居住状态id",notes="客户养老机构居住状态id",hidden=true)
    private Integer liveorgstateId;
    @ApiModelProperty(value="工作详情",notes="工作详情",hidden=true)
    private String occupationOther;
    @ApiModelProperty(value="宗教信仰id",notes="客户宗教信仰id",hidden=true)
    private Integer religionId;
    @ApiModelProperty(value="兴趣爱好(文化)",notes="兴趣爱好(文化)",hidden=true)
    private String intercultureId;
    @ApiModelProperty(value="兴趣爱好(运动)",notes="兴趣爱好(运动)",hidden=true)
    private String intersportsId;
    private List<QueryAddressResult> addressList;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public Integer getSexId() {
        return sexId;
    }
    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getIdCardNo() {
        return idCardNo;
    }
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public Integer getCountryId() {
        return countryId;
    }
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
    public Integer getNationId() {
        return nationId;
    }
    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }
    public Integer getLanguageId() {
        return languageId;
    }
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.politics_id
     *
     * @return the value of cu_customer.politics_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getPoliticsId() {
        return politicsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.politics_id
     *
     * @param politicsId the value for cu_customer.politics_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setPoliticsId(Integer politicsId) {
        this.politicsId = politicsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.education_id
     *
     * @return the value of cu_customer.education_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getEducationId() {
        return educationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.education_id
     *
     * @param educationId the value for cu_customer.education_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.degree_id
     *
     * @return the value of cu_customer.degree_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getDegreeId() {
        return degreeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.degree_id
     *
     * @param degreeId the value for cu_customer.degree_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.occupation_id
     *
     * @return the value of cu_customer.occupation_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getOccupationId() {
        return occupationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.occupation_id
     *
     * @param occupationId the value for cu_customer.occupation_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.org_name
     *
     * @return the value of cu_customer.org_name
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.org_name
     *
     * @param orgName the value for cu_customer.org_name
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.married_flag
     *
     * @return the value of cu_customer.married_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getMarriedFlag() {
        return marriedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.married_flag
     *
     * @param marriedFlag the value for cu_customer.married_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setMarriedFlag(Integer marriedFlag) {
        this.marriedFlag = marriedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.regist_org_id
     *
     * @return the value of cu_customer.regist_org_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getRegistOrgId() {
        return registOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.regist_org_id
     *
     * @param registOrgId the value for cu_customer.regist_org_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setRegistOrgId(Integer registOrgId) {
        this.registOrgId = registOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.regist_time
     *
     * @return the value of cu_customer.regist_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Date getRegistTime() {
        return registTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.regist_time
     *
     * @param registTime the value for cu_customer.regist_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.main_index_flag
     *
     * @return the value of cu_customer.main_index_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Boolean getMainIndexFlag() {
        return mainIndexFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.main_index_flag
     *
     * @param mainIndexFlag the value for cu_customer.main_index_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setMainIndexFlag(Boolean mainIndexFlag) {
        this.mainIndexFlag = mainIndexFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.spell_no
     *
     * @return the value of cu_customer.spell_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getSpellNo() {
        return spellNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.spell_no
     *
     * @param spellNo the value for cu_customer.spell_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setSpellNo(String spellNo) {
        this.spellNo = spellNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.wubi_no
     *
     * @return the value of cu_customer.wubi_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getWubiNo() {
        return wubiNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.wubi_no
     *
     * @param wubiNo the value for cu_customer.wubi_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setWubiNo(String wubiNo) {
        this.wubiNo = wubiNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.version_no
     *
     * @return the value of cu_customer.version_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getVersionNo() {
        return versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.version_no
     *
     * @param versionNo the value for cu_customer.version_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.created_by_id
     *
     * @return the value of cu_customer.created_by_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Long getCreatedById() {
        return createdById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.created_by_id
     *
     * @param createdById the value for cu_customer.created_by_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.created_time
     *
     * @return the value of cu_customer.created_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.created_time
     *
     * @param createdTime the value for cu_customer.created_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setCreatedTime(Date createdTime) {
    	if(createdTime==null){
    		this.createdTime = new Date();
    	}else{
    		this.createdTime =createdTime;
    	}
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.last_updated_by_id
     *
     * @return the value of cu_customer.last_updated_by_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Long getLastUpdatedById() {
        return lastUpdatedById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.last_updated_by_id
     *
     * @param lastUpdatedById the value for cu_customer.last_updated_by_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setLastUpdatedById(Long lastUpdatedById) {
        this.lastUpdatedById = lastUpdatedById;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.last_updated_time
     *
     * @return the value of cu_customer.last_updated_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.last_updated_time
     *
     * @param lastUpdatedTime the value for cu_customer.last_updated_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setLastUpdatedTime(Date lastUpdatedTime) {
    	if(lastUpdatedTime==null){
    		this.lastUpdatedTime = new Date();
    	}else{
    		this.lastUpdatedTime =lastUpdatedTime;
    	}
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.deleted_flag
     *
     * @return the value of cu_customer.deleted_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.deleted_flag
     *
     * @param deletedFlag the value for cu_customer.deleted_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.nickname
     *
     * @return the value of cu_customer.nickname
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.nickname
     *
     * @param nickname the value for cu_customer.nickname
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.liveState_id
     *
     * @return the value of cu_customer.liveState_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getLivestateId() {
        return livestateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.liveState_id
     *
     * @param livestateId the value for cu_customer.liveState_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setLivestateId(Integer livestateId) {
        this.livestateId = livestateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.liveOrgState_id
     *
     * @return the value of cu_customer.liveOrgState_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getLiveorgstateId() {
        return liveorgstateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.liveOrgState_id
     *
     * @param liveorgstateId the value for cu_customer.liveOrgState_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setLiveorgstateId(Integer liveorgstateId) {
        this.liveorgstateId = liveorgstateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.occupation_other
     *
     * @return the value of cu_customer.occupation_other
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getOccupationOther() {
        return occupationOther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.occupation_other
     *
     * @param occupationOther the value for cu_customer.occupation_other
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setOccupationOther(String occupationOther) {
        this.occupationOther = occupationOther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.religion_id
     *
     * @return the value of cu_customer.religion_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getReligionId() {
        return religionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.religion_id
     *
     * @param religionId the value for cu_customer.religion_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setReligionId(Integer religionId) {
        this.religionId = religionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.interCulture_id
     *
     * @return the value of cu_customer.interCulture_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getIntercultureId() {
        return intercultureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.interCulture_id
     *
     * @param intercultureId the value for cu_customer.interCulture_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setIntercultureId(String intercultureId) {
        this.intercultureId = intercultureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.interSports_id
     *
     * @return the value of cu_customer.interSports_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getIntersportsId() {
        return intersportsId;
    }

    public void setIntersportsId(String intersportsId) {
        this.intersportsId = intersportsId;
    }
    
	public List<QueryAddressResult> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<QueryAddressResult> addressList) {
		this.addressList = addressList;
	}
}
