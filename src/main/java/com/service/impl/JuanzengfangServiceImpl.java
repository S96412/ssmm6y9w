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


import com.dao.JuanzengfangDao;
import com.entity.JuanzengfangEntity;
import com.service.JuanzengfangService;
import com.entity.vo.JuanzengfangVO;
import com.entity.view.JuanzengfangView;

@Service("juanzengfangService")
public class JuanzengfangServiceImpl extends ServiceImpl<JuanzengfangDao, JuanzengfangEntity> implements JuanzengfangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JuanzengfangEntity> page = this.selectPage(
                new Query<JuanzengfangEntity>(params).getPage(),
                new EntityWrapper<JuanzengfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JuanzengfangEntity> wrapper) {
		  Page<JuanzengfangView> page =new Query<JuanzengfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JuanzengfangVO> selectListVO(Wrapper<JuanzengfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JuanzengfangVO selectVO(Wrapper<JuanzengfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JuanzengfangView> selectListView(Wrapper<JuanzengfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JuanzengfangView selectView(Wrapper<JuanzengfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
