package com.dao;

import com.entity.JuanzengfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuanzengfangVO;
import com.entity.view.JuanzengfangView;


/**
 * 捐赠方
 * 
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public interface JuanzengfangDao extends BaseMapper<JuanzengfangEntity> {
	
	List<JuanzengfangVO> selectListVO(@Param("ew") Wrapper<JuanzengfangEntity> wrapper);
	
	JuanzengfangVO selectVO(@Param("ew") Wrapper<JuanzengfangEntity> wrapper);
	
	List<JuanzengfangView> selectListView(@Param("ew") Wrapper<JuanzengfangEntity> wrapper);

	List<JuanzengfangView> selectListView(Pagination page,@Param("ew") Wrapper<JuanzengfangEntity> wrapper);
	
	JuanzengfangView selectView(@Param("ew") Wrapper<JuanzengfangEntity> wrapper);
	

}
