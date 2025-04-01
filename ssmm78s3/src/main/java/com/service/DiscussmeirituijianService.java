package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeirituijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeirituijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeirituijianView;


/**
 * 每日推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface DiscussmeirituijianService extends IService<DiscussmeirituijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeirituijianVO> selectListVO(Wrapper<DiscussmeirituijianEntity> wrapper);
   	
   	DiscussmeirituijianVO selectVO(@Param("ew") Wrapper<DiscussmeirituijianEntity> wrapper);
   	
   	List<DiscussmeirituijianView> selectListView(Wrapper<DiscussmeirituijianEntity> wrapper);
   	
   	DiscussmeirituijianView selectView(@Param("ew") Wrapper<DiscussmeirituijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeirituijianEntity> wrapper);
   	
}

