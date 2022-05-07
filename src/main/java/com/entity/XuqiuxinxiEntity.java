package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 需求信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
@TableName("xuqiuxinxi")
public class XuqiuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuqiuxinxiEntity() {
		
	}
	
	public XuqiuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 证明
	 */
					
	private String zhengming;
	
	/**
	 * 资源类型
	 */
					
	private String ziyuanleixing;
	
	/**
	 * 匹配状态
	 */
					
	private String pipeizhuangtai;
	
	/**
	 * 匹配详情
	 */
					
	private String pipeixiangqing;
	
	/**
	 * 已捐数量
	 */
					
	private Integer yijuanshuliang;
	
	/**
	 * 需求数量
	 */
					
	private Integer xuqiushuliang;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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

	public String getZiyuanleixing() {
		return ziyuanleixing;
	}

	public void setZiyuanleixing(String ziyuanleixing) {
		this.ziyuanleixing = ziyuanleixing;
	}

	public String getPipeizhuangtai() {
		return pipeizhuangtai;
	}

	public void setPipeizhuangtai(String pipeizhuangtai) {
		this.pipeizhuangtai = pipeizhuangtai;
	}

	public Integer getYijuanshuliang() {
		return yijuanshuliang;
	}

	public void setYijuanshuliang(Integer yijuanshuliang) {
		this.yijuanshuliang = yijuanshuliang;
	}

	public String getPipeixiangqing() {
		return pipeixiangqing;
	}

	public void setPipeixiangqing(String pipeixiangqing) {
		this.pipeixiangqing = pipeixiangqing;
	}

	public Integer getXuqiushuliang() {
		return xuqiushuliang;
	}

	public void setXuqiushuliang(Integer xuqiushuliang) {
		this.xuqiushuliang = xuqiushuliang;
	}
	
	

}
