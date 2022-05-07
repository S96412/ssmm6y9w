package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouzengfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouzengfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouzengfangView;


/**
 * 受赠方
 *
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public interface ShouzengfangService extends IService<ShouzengfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouzengfangVO> selectListVO(Wrapper<ShouzengfangEntity> wrapper);
   	
   	ShouzengfangVO selectVO(@Param("ew") Wrapper<ShouzengfangEntity> wrapper);
   	
   	List<ShouzengfangView> selectListView(Wrapper<ShouzengfangEntity> wrapper);
   	
   	ShouzengfangView selectView(@Param("ew") Wrapper<ShouzengfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouzengfangEntity> wrapper);
   	

}

