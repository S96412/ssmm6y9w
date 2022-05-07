package com.entity.model;

import com.entity.ZaixianjuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 在线捐赠
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public class ZaixianjuanzengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资源类型
	 */
	
	private String ziyuanleixing;
		
	/**
	 * 捐赠数量
	 */
	
	private Integer juanzengshuliang;
		
	/**
	 * 捐赠来源
	 */
	
	private String juanzenglaiyuan;
		
	/**
	 * 捐赠时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date juanzengshijian;
		
	/**
	 * 捐赠照片
	 */
	
	private String juanzengzhaopian;
		
	/**
	 * 捐赠账号
	 */
	
	private String juanzengzhanghao;
		
	/**
	 * 捐赠姓名
	 */
	
	private String juanzengxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 受赠账号
	 */
	
	private String shouzengzhanghao;
		
	/**
	 * 受赠姓名
	 */
	
	private String shouzengxingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
				
	
	/**
	 * 设置：资源类型
	 */
	 
	public void setZiyuanleixing(String ziyuanleixing) {
		this.ziyuanleixing = ziyuanleixing;
	}
	
	/**
	 * 获取：资源类型
	 */
	public String getZiyuanleixing() {
		return ziyuanleixing;
	}
				
	
	/**
	 * 设置：捐赠数量
	 */
	 
	public void setJuanzengshuliang(Integer juanzengshuliang) {
		this.juanzengshuliang = juanzengshuliang;
	}
	
	/**
	 * 获取：捐赠数量
	 */
	public Integer getJuanzengshuliang() {
		return juanzengshuliang;
	}
				
	
	/**
	 * 设置：捐赠来源
	 */
	 
	public void setJuanzenglaiyuan(String juanzenglaiyuan) {
		this.juanzenglaiyuan = juanzenglaiyuan;
	}
	
	/**
	 * 获取：捐赠来源
	 */
	public String getJuanzenglaiyuan() {
		return juanzenglaiyuan;
	}
				
	
	/**
	 * 设置：捐赠时间
	 */
	 
	public void setJuanzengshijian(Date juanzengshijian) {
		this.juanzengshijian = juanzengshijian;
	}
	
	/**
	 * 获取：捐赠时间
	 */
	public Date getJuanzengshijian() {
		return juanzengshijian;
	}
				
	
	/**
	 * 设置：捐赠照片
	 */
	 
	public void setJuanzengzhaopian(String juanzengzhaopian) {
		this.juanzengzhaopian = juanzengzhaopian;
	}
	
	/**
	 * 获取：捐赠照片
	 */
	public String getJuanzengzhaopian() {
		return juanzengzhaopian;
	}
				
	
	/**
	 * 设置：捐赠账号
	 */
	 
	public void setJuanzengzhanghao(String juanzengzhanghao) {
		this.juanzengzhanghao = juanzengzhanghao;
	}
	
	/**
	 * 获取：捐赠账号
	 */
	public String getJuanzengzhanghao() {
		return juanzengzhanghao;
	}
				
	
	/**
	 * 设置：捐赠姓名
	 */
	 
	public void setJuanzengxingming(String juanzengxingming) {
		this.juanzengxingming = juanzengxingming;
	}
	
	/**
	 * 获取：捐赠姓名
	 */
	public String getJuanzengxingming() {
		return juanzengxingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：受赠账号
	 */
	 
	public void setShouzengzhanghao(String shouzengzhanghao) {
		this.shouzengzhanghao = shouzengzhanghao;
	}
	
	/**
	 * 获取：受赠账号
	 */
	public String getShouzengzhanghao() {
		return shouzengzhanghao;
	}
				
	
	/**
	 * 设置：受赠姓名
	 */
	 
	public void setShouzengxingming(String shouzengxingming) {
		this.shouzengxingming = shouzengxingming;
	}
	
	/**
	 * 获取：受赠姓名
	 */
	public String getShouzengxingming() {
		return shouzengxingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
			
}
