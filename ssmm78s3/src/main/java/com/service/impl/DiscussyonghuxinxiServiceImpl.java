package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyonghuxinxiDao;
import com.entity.DiscussyonghuxinxiEntity;
import com.service.DiscussyonghuxinxiService;
import com.entity.vo.DiscussyonghuxinxiVO;
import com.entity.view.DiscussyonghuxinxiView;

@Service("discussyonghuxinxiService")
public class DiscussyonghuxinxiServiceImpl extends ServiceImpl<DiscussyonghuxinxiDao, DiscussyonghuxinxiEntity> implements DiscussyonghuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyonghuxinxiEntity> page = this.selectPage(
                new Query<DiscussyonghuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyonghuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyonghuxinxiEntity> wrapper) {
		  Page<DiscussyonghuxinxiView> page =new Query<DiscussyonghuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyonghuxinxiVO> selectListVO(Wrapper<DiscussyonghuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyonghuxinxiVO selectVO(Wrapper<DiscussyonghuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyonghuxinxiView> selectListView(Wrapper<DiscussyonghuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyonghuxinxiView selectView(Wrapper<DiscussyonghuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
