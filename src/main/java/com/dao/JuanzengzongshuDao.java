package com.dao;

import com.entity.JuanzengzongshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JuanzengzongshuVO;
import com.entity.view.JuanzengzongshuView;


/**
 * 捐赠总数
 * 
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public interface JuanzengzongshuDao extends BaseMapper<JuanzengzongshuEntity> {
	
	List<JuanzengzongshuVO> selectListVO(@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);
	
	JuanzengzongshuVO selectVO(@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);
	
	List<JuanzengzongshuView> selectListView(@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);

	List<JuanzengzongshuView> selectListView(Pagination page,@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);
	
	JuanzengzongshuView selectView(@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);
}
