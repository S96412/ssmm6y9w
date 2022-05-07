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


import com.dao.LeixingzongshuDao;
import com.entity.LeixingzongshuEntity;
import com.service.LeixingzongshuService;
import com.entity.vo.LeixingzongshuVO;
import com.entity.view.LeixingzongshuView;

@Service("leixingzongshuService")
public class LeixingzongshuServiceImpl extends ServiceImpl<LeixingzongshuDao, LeixingzongshuEntity> implements LeixingzongshuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LeixingzongshuEntity> page = this.selectPage(
                new Query<LeixingzongshuEntity>(params).getPage(),
                new EntityWrapper<LeixingzongshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LeixingzongshuEntity> wrapper) {
		  Page<LeixingzongshuView> page =new Query<LeixingzongshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LeixingzongshuVO> selectListVO(Wrapper<LeixingzongshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LeixingzongshuVO selectVO(Wrapper<LeixingzongshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LeixingzongshuView> selectListView(Wrapper<LeixingzongshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LeixingzongshuView selectView(Wrapper<LeixingzongshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<LeixingzongshuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<LeixingzongshuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<LeixingzongshuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
