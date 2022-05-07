package com.dao;

import com.entity.LeixingzongshuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LeixingzongshuVO;
import com.entity.view.LeixingzongshuView;


/**
 * 类型总数
 * 
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public interface LeixingzongshuDao extends BaseMapper<LeixingzongshuEntity> {
	
	List<LeixingzongshuVO> selectListVO(@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);
	
	LeixingzongshuVO selectVO(@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);
	
	List<LeixingzongshuView> selectListView(@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);

	List<LeixingzongshuView> selectListView(Pagination page,@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);
	
	LeixingzongshuView selectView(@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);
}
