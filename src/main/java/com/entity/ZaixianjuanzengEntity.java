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
 * 在线捐赠
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-10 10:56:44
 */
@TableName("zaixianjuanzeng")
public class ZaixianjuanzengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZaixianjuanzengEntity() {
		
	}
	
	public ZaixianjuanzengEntity(T t) {
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
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
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


	public String getPipeizhuangtai() {
		return pipeizhuangtai;
	}

	public void setPipeizhuangtai(String pipeizhuangtai) {
		this.pipeizhuangtai = pipeizhuangtai;
	}

	public String getPipeixiangqing() {
		return pipeixiangqing;
	}

	public void setPipeixiangqing(String pipeixiangqing) {
		this.pipeixiangqing = pipeixiangqing;
	}

	public String getSfsh() {
		return sfsh;
	}

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	public String getShhf() {
		return shhf;
	}

	public void setShhf(String shhf) {
		this.shhf = shhf;
	}

	
	
}
