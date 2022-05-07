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


import com.dao.JuanzengzongshuDao;
import com.entity.JuanzengzongshuEntity;
import com.service.JuanzengzongshuService;
import com.entity.vo.JuanzengzongshuVO;
import com.entity.view.JuanzengzongshuView;

@Service("juanzengzongshuService")
public class JuanzengzongshuServiceImpl extends ServiceImpl<JuanzengzongshuDao, JuanzengzongshuEntity> implements JuanzengzongshuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuanzengzongshuEntity> page = this.selectPage(
                new Query<JuanzengzongshuEntity>(params).getPage(),
                new EntityWrapper<JuanzengzongshuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuanzengzongshuEntity> wrapper) {
		  Page<JuanzengzongshuView> page =new Query<JuanzengzongshuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuanzengzongshuVO> selectListVO(Wrapper<JuanzengzongshuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuanzengzongshuVO selectVO(Wrapper<JuanzengzongshuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuanzengzongshuView> selectListView(Wrapper<JuanzengzongshuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuanzengzongshuView selectView(Wrapper<JuanzengzongshuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<JuanzengzongshuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<JuanzengzongshuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<JuanzengzongshuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
