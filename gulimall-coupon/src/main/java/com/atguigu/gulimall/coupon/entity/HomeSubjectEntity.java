package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首頁專題表【jd首頁下面很多專題，每個專題連結新的頁面，展示專題商品資訊】
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 10:02:36
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 專題名字
	 */
	private String name;
	/**
	 * 專題標題
	 */
	private String title;
	/**
	 * 專題副標題
	 */
	private String subTitle;
	/**
	 * 顯示狀態
	 */
	private Integer status;
	/**
	 * 詳情連接
	 */
	private String url;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 專題圖片位址
	 */
	private String img;

}
