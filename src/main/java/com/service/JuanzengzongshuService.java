package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JuanzengzongshuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JuanzengzongshuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JuanzengzongshuView;


/**
 * 捐赠总数
 *
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public interface JuanzengzongshuService extends IService<JuanzengzongshuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JuanzengzongshuVO> selectListVO(Wrapper<JuanzengzongshuEntity> wrapper);
   	
   	JuanzengzongshuVO selectVO(@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);
   	
   	List<JuanzengzongshuView> selectListView(Wrapper<JuanzengzongshuEntity> wrapper);
   	
   	JuanzengzongshuView selectView(@Param("ew") Wrapper<JuanzengzongshuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JuanzengzongshuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JuanzengzongshuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JuanzengzongshuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JuanzengzongshuEntity> wrapper);
}

