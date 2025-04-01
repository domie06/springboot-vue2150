package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirituijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirituijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirituijianView;


/**
 * 每日推荐
 *
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface MeirituijianService extends IService<MeirituijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirituijianVO> selectListVO(Wrapper<MeirituijianEntity> wrapper);
   	
   	MeirituijianVO selectVO(@Param("ew") Wrapper<MeirituijianEntity> wrapper);
   	
   	List<MeirituijianView> selectListView(Wrapper<MeirituijianEntity> wrapper);
   	
   	MeirituijianView selectView(@Param("ew") Wrapper<MeirituijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirituijianEntity> wrapper);
   	
}

