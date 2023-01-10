package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支付資訊表
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 09:59:02
 */
@Data
@TableName("oms_payment_info")
public class PaymentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 訂單號（對外業務號）
	 */
	private String orderSn;
	/**
	 * 訂單id
	 */
	private Long orderId;
	/**
	 * 支付寶交易流水號
	 */
	private String alipayTradeNo;
	/**
	 * 支付總金額
	 */
	private BigDecimal totalAmount;
	/**
	 * 交易內容
	 */
	private String subject;
	/**
	 * 支付狀態
	 */
	private String paymentStatus;
	/**
	 * 創建時間
	 */
	private Date createTime;
	/**
	 * 確認時間
	 */
	private Date confirmTime;
	/**
	 * 回檔內容
	 */
	private String callbackContent;
	/**
	 * 回檔時間
	 */
	private Date callbackTime;

}
