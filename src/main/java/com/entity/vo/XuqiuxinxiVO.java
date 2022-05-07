package com.entity.vo;

import com.entity.XuqiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 需求信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
public class XuqiuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 证明
	 */
	
	private String zhengming;
		
	/**
	 * 需求用途
	 */
	
	private String xuqiuyongtu;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 详细说明
	 */
	
	private String xiangxishuoming;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：证明
	 */
	 
	public void setZhengming(String zhengming) {
		this.zhengming = zhengming;
	}
	
	/**
	 * 获取：证明
	 */
	public String getZhengming() {
		return zhengming;
	}
				
	
	/**
	 * 设置：需求用途
	 */
	 
	public void setXuqiuyongtu(String xuqiuyongtu) {
		this.xuqiuyongtu = xuqiuyongtu;
	}
	
	/**
	 * 获取：需求用途
	 */
	public String getXuqiuyongtu() {
		return xuqiuyongtu;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：详细说明
	 */
	 
	public void setXiangxishuoming(String xiangxishuoming) {
		this.xiangxishuoming = xiangxishuoming;
	}
	
	/**
	 * 获取：详细说明
	 */
	public String getXiangxishuoming() {
		return xiangxishuoming;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
