package com.self.activity.vo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="ProvinceForSolr")
public class ProvinceForSolr {
	@Id
	@ApiModelProperty(value="solr序号",hidden=true)
	private String id;
	
	@Field
	@ApiModelProperty(value="数据库里的id")
	private Integer provinceId;
	
	@Field
	@ApiModelProperty(value="省名")
	private String provinceName;
	
	@Field
	@ApiModelProperty(value="省编码")
	private String provinceCode;
	
	@Field
	@ApiModelProperty(value="省描述")
	private String provinceDes;
	
	@Field
	@ApiModelProperty(value="省拼音码")
	private String provinceSpellNo;
	
	@Field
	@ApiModelProperty(value="省五笔码")
	private String provinceWubiNo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceDes() {
		return provinceDes;
	}

	public void setProvinceDes(String provinceDes) {
		this.provinceDes = provinceDes;
	}

	public String getProvinceSpellNo() {
		return provinceSpellNo;
	}

	public void setProvinceSpellNo(String provinceSpellNo) {
		this.provinceSpellNo = provinceSpellNo;
	}

	public String getProvinceWubiNo() {
		return provinceWubiNo;
	}

	public void setProvinceWubiNo(String provinceWubiNo) {
		this.provinceWubiNo = provinceWubiNo;
	}
	
}
