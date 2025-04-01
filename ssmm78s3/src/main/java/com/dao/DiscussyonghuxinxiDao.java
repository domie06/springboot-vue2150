package com.dao;

import com.entity.DiscussyonghuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyonghuxinxiVO;
import com.entity.view.DiscussyonghuxinxiView;


/**
 * 用户信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface DiscussyonghuxinxiDao extends BaseMapper<DiscussyonghuxinxiEntity> {
	
	List<DiscussyonghuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyonghuxinxiEntity> wrapper);
	
	DiscussyonghuxinxiVO selectVO(@Param("ew") Wrapper<DiscussyonghuxinxiEntity> wrapper);
	
	List<DiscussyonghuxinxiView> selectListView(@Param("ew") Wrapper<DiscussyonghuxinxiEntity> wrapper);

	List<DiscussyonghuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyonghuxinxiEntity> wrapper);
	
	DiscussyonghuxinxiView selectView(@Param("ew") Wrapper<DiscussyonghuxinxiEntity> wrapper);
	
}
