package com.self.activity.vo;

import com.self.activity.sdk.bean.PageBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="QueryCustParam",description="查询参数条件")
public class QueryCustParam{
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

    @ApiModelProperty(value="出生日期开始",notes="客户出生日期开始")
    private String birthdayBegain;
    
    @ApiModelProperty(value="出生日期结束",notes="客户出生日期结束")
    private String birthdayEnd;

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
    private String registTime;

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
    private String createdTime;

    @ApiModelProperty(value="最近更新者id",notes="客户最近更新者id",hidden=true)
    private Long lastUpdatedById;

    @ApiModelProperty(name="最近更新时间",notes="最近更新时间",hidden=true)
    private String lastUpdatedTime;

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

    public Integer getPoliticsId() {
        return politicsId;
    }

    public void setPoliticsId(Integer politicsId) {
        this.politicsId = politicsId;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }

    public Integer getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getMarriedFlag() {
        return marriedFlag;
    }

    public void setMarriedFlag(Integer marriedFlag) {
        this.marriedFlag = marriedFlag;
    }

    public Integer getRegistOrgId() {
        return registOrgId;
    }

    public void setRegistOrgId(Integer registOrgId) {
        this.registOrgId = registOrgId;
    }

    public String getRegistTime() {
        return registTime;
    }

    public void setRegistTime(String registTime) {
        this.registTime = registTime;
    }

    public Boolean getMainIndexFlag() {
        return mainIndexFlag;
    }

    public void setMainIndexFlag(Boolean mainIndexFlag) {
        this.mainIndexFlag = mainIndexFlag;
    }

    public String getSpellNo() {
        return spellNo;
    }

    public void setSpellNo(String spellNo) {
        this.spellNo = spellNo;
    }

    public String getWubiNo() {
        return wubiNo;
    }

    public void setWubiNo(String wubiNo) {
        this.wubiNo = wubiNo;
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

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
    	this.createdTime =createdTime;
    }

    public Long getLastUpdatedById() {
        return lastUpdatedById;
    }

    public void setLastUpdatedById(Long lastUpdatedById) {
        this.lastUpdatedById = lastUpdatedById;
    }

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
    	this.lastUpdatedTime =lastUpdatedTime;
    }

    public Boolean getDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getLivestateId() {
        return livestateId;
    }

    public void setLivestateId(Integer livestateId) {
        this.livestateId = livestateId;
    }

    public Integer getLiveorgstateId() {
        return liveorgstateId;
    }

    public void setLiveorgstateId(Integer liveorgstateId) {
        this.liveorgstateId = liveorgstateId;
    }

    public String getOccupationOther() {
        return occupationOther;
    }

    public void setOccupationOther(String occupationOther) {
        this.occupationOther = occupationOther;
    }

    public Integer getReligionId() {
        return religionId;
    }

    public void setReligionId(Integer religionId) {
        this.religionId = religionId;
    }

    public String getIntercultureId() {
        return intercultureId;
    }

    public void setIntercultureId(String intercultureId) {
        this.intercultureId = intercultureId;
    }

    public String getIntersportsId() {
        return intersportsId;
    }

    public void setIntersportsId(String intersportsId) {
        this.intersportsId = intersportsId;
    }
    public String toURL(PageBean pageBean){
    	String url="?1=1";
    	if(this.name!=null){
    		url+="&name="+this.name;
    	}
    	if(this.idCardNo!=null){
    		url+="&idCardNo="+this.idCardNo;
    	}
    	if(this.email!=null){
    		url+="&email="+this.email;
    	}
    	if(this.birthdayBegain!=null){
    		url+="&birthdayBegain="+this.birthdayBegain;
    	}
    	if(this.birthdayEnd!=null){
    		url+="&birthdayEnd="+this.birthdayEnd;
    	}
    	if(this.mobile!=null){
    		url+="&mobile="+this.mobile;
    	}
    	if(this.tel!=null){
    		url+="&tel="+this.tel;
    	}
    	if(this.nickname!=null){
    		url+="&nickname="+this.nickname;
    	}
    	if(pageBean!=null){
    		if(pageBean.getNumber()!=null){
    			url+="&number="+pageBean.getNumber();
    		}
    		if(pageBean.getSize()!=null){
    			url+="&size="+pageBean.getSize();
    		}
    	}
    	return url;
    }

	public String getBirthdayBegain() {
		return birthdayBegain;
	}

	public void setBirthdayBegain(String birthdayBegain) {
		this.birthdayBegain = birthdayBegain;
	}

	public String getBirthdayEnd() {
		return birthdayEnd;
	}

	public void setBirthdayEnd(String birthdayEnd) {
		this.birthdayEnd = birthdayEnd;
	}
}