package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 訂單配置資訊
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 09:59:02
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 秒殺訂單超時關閉時間(分)
	 */
	private Integer flashOrderOvertime;
	/**
	 * 正常訂單超時時間(分)
	 */
	private Integer normalOrderOvertime;
	/**
	 * 發貨後自動確認收貨時間（天）
	 */
	private Integer confirmOvertime;
	/**
	 * 自動完成交易時間，不能申請退貨（天）
	 */
	private Integer finishOvertime;
	/**
	 * 訂單完成後自動好評時間（天）
	 */
	private Integer commentOvertime;
	/**
	 * 會員等級【0-不限會員等級，全部通用；其他-對應的其他會員等級】
	 */
	private Integer memberLevel;

}
