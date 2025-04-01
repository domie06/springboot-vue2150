package com.entity.view;

import com.entity.DiscussmeirituijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 每日推荐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
@TableName("discussmeirituijian")
public class DiscussmeirituijianView  extends DiscussmeirituijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeirituijianView(){
	}
 
 	public DiscussmeirituijianView(DiscussmeirituijianEntity discussmeirituijianEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeirituijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
