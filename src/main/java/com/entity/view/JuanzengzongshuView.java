package com.entity.view;

import com.entity.JuanzengzongshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 捐赠总数
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
@TableName("juanzengzongshu")
public class JuanzengzongshuView  extends JuanzengzongshuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JuanzengzongshuView(){
	}
 
 	public JuanzengzongshuView(JuanzengzongshuEntity juanzengzongshuEntity){
 	try {
			BeanUtils.copyProperties(this, juanzengzongshuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
