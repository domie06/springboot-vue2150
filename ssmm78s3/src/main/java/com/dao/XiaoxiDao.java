package com.dao;

import com.entity.XiaoxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoxiVO;
import com.entity.view.XiaoxiView;


/**
 * 消息
 * 
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface XiaoxiDao extends BaseMapper<XiaoxiEntity> {
	
	List<XiaoxiVO> selectListVO(@Param("ew") Wrapper<XiaoxiEntity> wrapper);
	
	XiaoxiVO selectVO(@Param("ew") Wrapper<XiaoxiEntity> wrapper);
	
	List<XiaoxiView> selectListView(@Param("ew") Wrapper<XiaoxiEntity> wrapper);

	List<XiaoxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoxiEntity> wrapper);
	
	XiaoxiView selectView(@Param("ew") Wrapper<XiaoxiEntity> wrapper);
	
}
