package com.dao;

import com.entity.DiscussmeirituijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeirituijianVO;
import com.entity.view.DiscussmeirituijianView;


/**
 * 每日推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface DiscussmeirituijianDao extends BaseMapper<DiscussmeirituijianEntity> {
	
	List<DiscussmeirituijianVO> selectListVO(@Param("ew") Wrapper<DiscussmeirituijianEntity> wrapper);
	
	DiscussmeirituijianVO selectVO(@Param("ew") Wrapper<DiscussmeirituijianEntity> wrapper);
	
	List<DiscussmeirituijianView> selectListView(@Param("ew") Wrapper<DiscussmeirituijianEntity> wrapper);

	List<DiscussmeirituijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeirituijianEntity> wrapper);
	
	DiscussmeirituijianView selectView(@Param("ew") Wrapper<DiscussmeirituijianEntity> wrapper);
	
}
