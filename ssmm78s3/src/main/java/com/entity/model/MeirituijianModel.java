package com.entity.model;

import com.entity.MeirituijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 每日推荐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public class MeirituijianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 内心独白
	 */
	
	private String neixindubai;
		
	/**
	 * 兴趣爱好
	 */
	
	private String xingquaihao;
		
	/**
	 * 个人相册
	 */
	
	private String gerenxiangce;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：内心独白
	 */
	 
	public void setNeixindubai(String neixindubai) {
		this.neixindubai = neixindubai;
	}
	
	/**
	 * 获取：内心独白
	 */
	public String getNeixindubai() {
		return neixindubai;
	}
				
	
	/**
	 * 设置：兴趣爱好
	 */
	 
	public void setXingquaihao(String xingquaihao) {
		this.xingquaihao = xingquaihao;
	}
	
	/**
	 * 获取：兴趣爱好
	 */
	public String getXingquaihao() {
		return xingquaihao;
	}
				
	
	/**
	 * 设置：个人相册
	 */
	 
	public void setGerenxiangce(String gerenxiangce) {
		this.gerenxiangce = gerenxiangce;
	}
	
	/**
	 * 获取：个人相册
	 */
	public String getGerenxiangce() {
		return gerenxiangce;
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
			
}
