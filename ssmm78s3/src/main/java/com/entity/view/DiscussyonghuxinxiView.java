package com.entity.view;

import com.entity.DiscussyonghuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
@TableName("discussyonghuxinxi")
public class DiscussyonghuxinxiView  extends DiscussyonghuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyonghuxinxiView(){
	}
 
 	public DiscussyonghuxinxiView(DiscussyonghuxinxiEntity discussyonghuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyonghuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
