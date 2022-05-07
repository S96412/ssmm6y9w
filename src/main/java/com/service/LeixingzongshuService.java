package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeixingzongshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeixingzongshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeixingzongshuView;


/**
 * 类型总数
 *
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public interface LeixingzongshuService extends IService<LeixingzongshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeixingzongshuVO> selectListVO(Wrapper<LeixingzongshuEntity> wrapper);
   	
   	LeixingzongshuVO selectVO(@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);
   	
   	List<LeixingzongshuView> selectListView(Wrapper<LeixingzongshuEntity> wrapper);
   	
   	LeixingzongshuView selectView(@Param("ew") Wrapper<LeixingzongshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeixingzongshuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LeixingzongshuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LeixingzongshuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LeixingzongshuEntity> wrapper);
}

