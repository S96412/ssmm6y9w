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


import com.dao.ShouzengfangDao;
import com.entity.ShouzengfangEntity;
import com.service.ShouzengfangService;
import com.entity.vo.ShouzengfangVO;
import com.entity.view.ShouzengfangView;

@Service("shouzengfangService")
public class ShouzengfangServiceImpl extends ServiceImpl<ShouzengfangDao, ShouzengfangEntity> implements ShouzengfangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouzengfangEntity> page = this.selectPage(
                new Query<ShouzengfangEntity>(params).getPage(),
                new EntityWrapper<ShouzengfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouzengfangEntity> wrapper) {
		  Page<ShouzengfangView> page =new Query<ShouzengfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouzengfangVO> selectListVO(Wrapper<ShouzengfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouzengfangVO selectVO(Wrapper<ShouzengfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouzengfangView> selectListView(Wrapper<ShouzengfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouzengfangView selectView(Wrapper<ShouzengfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
