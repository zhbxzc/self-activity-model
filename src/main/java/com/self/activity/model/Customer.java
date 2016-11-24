package com.self.activity.model;

import java.util.Date;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.self.activity.sdk.bean.PageBean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="Customer",description="客户")
public class Customer{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
	@ApiModelProperty(value="客户id",notes="客户id")
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.type_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
	@ApiModelProperty(value="客户类型",notes="客户类型",hidden=true)
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.code
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @NotBlank(message="10000")
    @Size(min=3,max=10,message="10010,3,10")
    @ApiModelProperty(value="编码",notes="客户编码",hidden=true)
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.name
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="名称",notes="客户名称")
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.des
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="描述",notes="客户描述",hidden=true)
    private String des;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.sex_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="性别id",notes="客户性别id")
    private Integer sexId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.birthday
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="出生日期",notes="客户出生日期",dataType="Date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.id_card_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="身份证号",notes="客户身份证号")
    @Pattern(regexp="^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])((\\d{4})|\\d{3}[A-Za-z])$",message="10040")
    private String idCardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.email
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="电子邮箱",notes="客户电子邮箱")
    @Email(message="10050")
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.mobile
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="移动电话",notes="客户移动电话")
    @Pattern(regexp="^((13[0-9])|(14[0-9])|(15[0-9])|(17[0-9])|(18[0-9]))\\d{8}$",message="10060")
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.tel
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="固定电话",notes="客户固定电话")
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.country_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="国籍id",notes="客户国籍id",hidden=true)
    private Integer countryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.nation_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="民族id",notes="客户民族id",hidden=true)
    private Integer nationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.language_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="语种id",notes="客户语种id",hidden=true)
    private Integer languageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.politics_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="政治面貌id",notes="客户政治面貌id",hidden=true)
    private Integer politicsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.education_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="教育程度id",notes="客户教育程度id",hidden=true)
    private Integer educationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.degree_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="学位id",notes="客户学位id",hidden=true)
    private Integer degreeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.occupation_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="职业id",notes="客户职业id",hidden=true)
    private Integer occupationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.org_name
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="单位名称",notes="客户单位名称",hidden=true)
    private String orgName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.married_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="婚姻状态id",notes="客户婚姻状态id")
    private Integer marriedFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.regist_org_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="注册机构id",notes="客户注册机构id",hidden=true)
    private Integer registOrgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.regist_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="注册时间",notes="客户注册时间",hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date registTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.main_index_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="主索引标记",notes="客户主索引标记",hidden=true)
    private Boolean mainIndexFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.spell_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="拼音码",notes="客户拼音码",hidden=true)
    private String spellNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.wubi_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="五笔码",notes="客户五笔码",hidden=true)
    private String wubiNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.version_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="版本号",notes="客户版本号",hidden=true)
    private Integer versionNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.created_by_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="创建者id",notes="客户创建者id",hidden=true)
    private Long createdById;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.created_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(name="创建时间",notes="创建时间",hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.last_updated_by_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="最近更新者id",notes="客户最近更新者id",hidden=true)
    private Long lastUpdatedById;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.last_updated_time
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(name="最近更新时间",notes="最近更新时间",hidden=true)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastUpdatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.deleted_flag
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="删除标记",notes="客户删除标记",hidden=true)
    private Boolean deletedFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.nickname
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(name="昵称",notes="昵称")
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.liveState_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="居住情况id",notes="客户居住情况id",hidden=true)
    private Integer livestateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.liveOrgState_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="养老机构居住状态id",notes="客户养老机构居住状态id",hidden=true)
    private Integer liveorgstateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.occupation_other
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="工作详情",notes="工作详情",hidden=true)
    private String occupationOther;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.religion_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="宗教信仰id",notes="客户宗教信仰id",hidden=true)
    private Integer religionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.interCulture_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="兴趣爱好(文化)",notes="兴趣爱好(文化)",hidden=true)
    private String intercultureId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cu_customer.interSports_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    @ApiModelProperty(value="兴趣爱好(运动)",notes="兴趣爱好(运动)",hidden=true)
    private String intersportsId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.id
     *
     * @return the value of cu_customer.id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.id
     *
     * @param id the value for cu_customer.id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.type_id
     *
     * @return the value of cu_customer.type_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.type_id
     *
     * @param typeId the value for cu_customer.type_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.code
     *
     * @return the value of cu_customer.code
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.code
     *
     * @param code the value for cu_customer.code
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.name
     *
     * @return the value of cu_customer.name
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.name
     *
     * @param name the value for cu_customer.name
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.des
     *
     * @return the value of cu_customer.des
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.des
     *
     * @param des the value for cu_customer.des
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setDes(String des) {
        this.des = des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.sex_id
     *
     * @return the value of cu_customer.sex_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getSexId() {
        return sexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.sex_id
     *
     * @param sexId the value for cu_customer.sex_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.birthday
     *
     * @return the value of cu_customer.birthday
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.birthday
     *
     * @param birthday the value for cu_customer.birthday
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.id_card_no
     *
     * @return the value of cu_customer.id_card_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.id_card_no
     *
     * @param idCardNo the value for cu_customer.id_card_no
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.email
     *
     * @return the value of cu_customer.email
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.email
     *
     * @param email the value for cu_customer.email
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.mobile
     *
     * @return the value of cu_customer.mobile
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.mobile
     *
     * @param mobile the value for cu_customer.mobile
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.tel
     *
     * @return the value of cu_customer.tel
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.tel
     *
     * @param tel the value for cu_customer.tel
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.country_id
     *
     * @return the value of cu_customer.country_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.country_id
     *
     * @param countryId the value for cu_customer.country_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.nation_id
     *
     * @return the value of cu_customer.nation_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getNationId() {
        return nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.nation_id
     *
     * @param nationId the value for cu_customer.nation_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cu_customer.language_id
     *
     * @return the value of cu_customer.language_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public Integer getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.language_id
     *
     * @param languageId the value for cu_customer.language_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cu_customer.interSports_id
     *
     * @param intersportsId the value for cu_customer.interSports_id
     *
     * @mbggenerated Sat Oct 08 15:20:27 CST 2016
     */
    public void setIntersportsId(String intersportsId) {
        this.intersportsId = intersportsId;
    }
    public String toURL(){
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
    	if(this.birthday!=null){
    		url+="&birthday="+this.birthday;
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
    	return url;
    }
}