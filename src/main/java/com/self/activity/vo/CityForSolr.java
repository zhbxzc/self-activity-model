package com.self.activity.vo;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="CityForSolr")
public class CityForSolr {
	
	@Id
	@ApiModelProperty(value="Solr序号")
	private String id;
	
	@Field
	@ApiModelProperty(value="市id")
	private Integer cityId;
	
	@Field
	@ApiModelProperty(value="市名称")
	private String cityName;
	
	@Field
	@ApiModelProperty(value="市编码")
	private String cityCode;
	
	@Field
	@ApiModelProperty(value="市描述")
	private String cityDes;
	
	@Field
	@ApiModelProperty(value="市拼音码")
	private String citySpellNo;
	
	@Field
	@ApiModelProperty(value="市五笔码")
	private String cityWubiNo;
}
