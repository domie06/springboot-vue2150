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


import com.dao.DiscussmeirituijianDao;
import com.entity.DiscussmeirituijianEntity;
import com.service.DiscussmeirituijianService;
import com.entity.vo.DiscussmeirituijianVO;
import com.entity.view.DiscussmeirituijianView;

@Service("discussmeirituijianService")
public class DiscussmeirituijianServiceImpl extends ServiceImpl<DiscussmeirituijianDao, DiscussmeirituijianEntity> implements DiscussmeirituijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeirituijianEntity> page = this.selectPage(
                new Query<DiscussmeirituijianEntity>(params).getPage(),
                new EntityWrapper<DiscussmeirituijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeirituijianEntity> wrapper) {
		  Page<DiscussmeirituijianView> page =new Query<DiscussmeirituijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeirituijianVO> selectListVO(Wrapper<DiscussmeirituijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeirituijianVO selectVO(Wrapper<DiscussmeirituijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeirituijianView> selectListView(Wrapper<DiscussmeirituijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeirituijianView selectView(Wrapper<DiscussmeirituijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
