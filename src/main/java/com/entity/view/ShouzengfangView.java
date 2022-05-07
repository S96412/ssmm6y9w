package com.entity.view;

import com.entity.ShouzengfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 受赠方
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
@TableName("shouzengfang")
public class ShouzengfangView  extends ShouzengfangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouzengfangView(){
	}
 
 	public ShouzengfangView(ShouzengfangEntity shouzengfangEntity){
 	try {
			BeanUtils.copyProperties(this, shouzengfangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
