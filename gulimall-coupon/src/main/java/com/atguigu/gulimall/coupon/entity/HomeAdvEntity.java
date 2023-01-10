package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首頁輪播廣告
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 10:02:36
 */
@Data
@TableName("sms_home_adv")
public class HomeAdvEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 圖片位址
	 */
	private String pic;
	/**
	 * 開始時間
	 */
	private Date startTime;
	/**
	 * 結束時間
	 */
	private Date endTime;
	/**
	 * 狀態
	 */
	private Integer status;
	/**
	 * 點擊數
	 */
	private Integer clickCount;
	/**
	 * 廣告詳情連接位址
	 */
	private String url;
	/**
	 * 備註
	 */
	private String note;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 發佈者
	 */
	private Long publisherId;
	/**
	 * 審核者
	 */
	private Long authId;

}
