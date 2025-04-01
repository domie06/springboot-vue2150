package com.dao;

import com.entity.HuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuifuVO;
import com.entity.view.HuifuView;


/**
 * 回复
 * 
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface HuifuDao extends BaseMapper<HuifuEntity> {
	
	List<HuifuVO> selectListVO(@Param("ew") Wrapper<HuifuEntity> wrapper);
	
	HuifuVO selectVO(@Param("ew") Wrapper<HuifuEntity> wrapper);
	
	List<HuifuView> selectListView(@Param("ew") Wrapper<HuifuEntity> wrapper);

	List<HuifuView> selectListView(Pagination page,@Param("ew") Wrapper<HuifuEntity> wrapper);
	
	HuifuView selectView(@Param("ew") Wrapper<HuifuEntity> wrapper);
	
}
