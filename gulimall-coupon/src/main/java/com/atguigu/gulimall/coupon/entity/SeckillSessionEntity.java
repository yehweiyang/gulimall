package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒殺活動場次
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 10:02:36
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 場次名稱
	 */
	private String name;
	/**
	 * 每日開始時間
	 */
	private Date startTime;
	/**
	 * 每日結束時間
	 */
	private Date endTime;
	/**
	 * 啟用狀態
	 */
	private Integer status;
	/**
	 * 創建時間
	 */
	private Date createTime;

}
