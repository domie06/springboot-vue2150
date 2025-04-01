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


import com.dao.HuifuDao;
import com.entity.HuifuEntity;
import com.service.HuifuService;
import com.entity.vo.HuifuVO;
import com.entity.view.HuifuView;

@Service("huifuService")
public class HuifuServiceImpl extends ServiceImpl<HuifuDao, HuifuEntity> implements HuifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuifuEntity> page = this.selectPage(
                new Query<HuifuEntity>(params).getPage(),
                new EntityWrapper<HuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuifuEntity> wrapper) {
		  Page<HuifuView> page =new Query<HuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuifuVO> selectListVO(Wrapper<HuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuifuVO selectVO(Wrapper<HuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuifuView> selectListView(Wrapper<HuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuifuView selectView(Wrapper<HuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
