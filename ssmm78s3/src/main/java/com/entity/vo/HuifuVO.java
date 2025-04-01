package com.entity.vo;

import com.entity.HuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 回复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public class HuifuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 消息
	 */
	
	private String xiaoxi;
		
	/**
	 * 发送时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fasongshijian;
		
	/**
	 * 发信人账号
	 */
	
	private String faxinrenzhanghao;
		
	/**
	 * 发信人姓名
	 */
	
	private String faxinrenxingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：消息
	 */
	 
	public void setXiaoxi(String xiaoxi) {
		this.xiaoxi = xiaoxi;
	}
	
	/**
	 * 获取：消息
	 */
	public String getXiaoxi() {
		return xiaoxi;
	}
				
	
	/**
	 * 设置：发送时间
	 */
	 
	public void setFasongshijian(Date fasongshijian) {
		this.fasongshijian = fasongshijian;
	}
	
	/**
	 * 获取：发送时间
	 */
	public Date getFasongshijian() {
		return fasongshijian;
	}
				
	
	/**
	 * 设置：发信人账号
	 */
	 
	public void setFaxinrenzhanghao(String faxinrenzhanghao) {
		this.faxinrenzhanghao = faxinrenzhanghao;
	}
	
	/**
	 * 获取：发信人账号
	 */
	public String getFaxinrenzhanghao() {
		return faxinrenzhanghao;
	}
				
	
	/**
	 * 设置：发信人姓名
	 */
	 
	public void setFaxinrenxingming(String faxinrenxingming) {
		this.faxinrenxingming = faxinrenxingming;
	}
	
	/**
	 * 获取：发信人姓名
	 */
	public String getFaxinrenxingming() {
		return faxinrenxingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
