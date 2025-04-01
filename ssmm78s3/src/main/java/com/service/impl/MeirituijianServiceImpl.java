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


import com.dao.MeirituijianDao;
import com.entity.MeirituijianEntity;
import com.service.MeirituijianService;
import com.entity.vo.MeirituijianVO;
import com.entity.view.MeirituijianView;

@Service("meirituijianService")
public class MeirituijianServiceImpl extends ServiceImpl<MeirituijianDao, MeirituijianEntity> implements MeirituijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirituijianEntity> page = this.selectPage(
                new Query<MeirituijianEntity>(params).getPage(),
                new EntityWrapper<MeirituijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirituijianEntity> wrapper) {
		  Page<MeirituijianView> page =new Query<MeirituijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirituijianVO> selectListVO(Wrapper<MeirituijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirituijianVO selectVO(Wrapper<MeirituijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirituijianView> selectListView(Wrapper<MeirituijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirituijianView selectView(Wrapper<MeirituijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
