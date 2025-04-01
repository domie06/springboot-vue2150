package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyonghuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyonghuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyonghuxinxiView;


/**
 * 用户信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-23 17:45:38
 */
public interface DiscussyonghuxinxiService extends IService<DiscussyonghuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyonghuxinxiVO> selectListVO(Wrapper<DiscussyonghuxinxiEntity> wrapper);
   	
   	DiscussyonghuxinxiVO selectVO(@Param("ew") Wrapper<DiscussyonghuxinxiEntity> wrapper);
   	
   	List<DiscussyonghuxinxiView> selectListView(Wrapper<DiscussyonghuxinxiEntity> wrapper);
   	
   	DiscussyonghuxinxiView selectView(@Param("ew") Wrapper<DiscussyonghuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyonghuxinxiEntity> wrapper);
   	
}

