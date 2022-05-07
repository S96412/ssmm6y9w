package com.dao;

import com.entity.ShouzengfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouzengfangVO;
import com.entity.view.ShouzengfangView;


/**
 * 受赠方
 * 
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public interface ShouzengfangDao extends BaseMapper<ShouzengfangEntity> {
	
	List<ShouzengfangVO> selectListVO(@Param("ew") Wrapper<ShouzengfangEntity> wrapper);
	
	ShouzengfangVO selectVO(@Param("ew") Wrapper<ShouzengfangEntity> wrapper);
	
	List<ShouzengfangView> selectListView(@Param("ew") Wrapper<ShouzengfangEntity> wrapper);

	List<ShouzengfangView> selectListView(Pagination page,@Param("ew") Wrapper<ShouzengfangEntity> wrapper);
	
	ShouzengfangView selectView(@Param("ew") Wrapper<ShouzengfangEntity> wrapper);
	

}
