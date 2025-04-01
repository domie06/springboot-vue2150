package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuifuView;


/**
 * 回复
 *
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface HuifuService extends IService<HuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuifuVO> selectListVO(Wrapper<HuifuEntity> wrapper);
   	
   	HuifuVO selectVO(@Param("ew") Wrapper<HuifuEntity> wrapper);
   	
   	List<HuifuView> selectListView(Wrapper<HuifuEntity> wrapper);
   	
   	HuifuView selectView(@Param("ew") Wrapper<HuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuifuEntity> wrapper);
   	
}

