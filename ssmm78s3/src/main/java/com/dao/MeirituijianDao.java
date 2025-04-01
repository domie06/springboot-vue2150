package com.dao;

import com.entity.MeirituijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirituijianVO;
import com.entity.view.MeirituijianView;


/**
 * 每日推荐
 * 
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface MeirituijianDao extends BaseMapper<MeirituijianEntity> {
	
	List<MeirituijianVO> selectListVO(@Param("ew") Wrapper<MeirituijianEntity> wrapper);
	
	MeirituijianVO selectVO(@Param("ew") Wrapper<MeirituijianEntity> wrapper);
	
	List<MeirituijianView> selectListView(@Param("ew") Wrapper<MeirituijianEntity> wrapper);

	List<MeirituijianView> selectListView(Pagination page,@Param("ew") Wrapper<MeirituijianEntity> wrapper);
	
	MeirituijianView selectView(@Param("ew") Wrapper<MeirituijianEntity> wrapper);
	
}
