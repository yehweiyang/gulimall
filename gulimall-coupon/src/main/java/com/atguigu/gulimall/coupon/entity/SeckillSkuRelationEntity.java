package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒殺活動商品關聯
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 10:02:36
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 活動id
	 */
	private Long promotionId;
	/**
	 * 活動場次id
	 */
	private Long promotionSessionId;
	/**
	 * 商品id
	 */
	private Long skuId;
	/**
	 * 秒殺價格
	 */
	private BigDecimal seckillPrice;
	/**
	 * 秒殺總量
	 */
	private BigDecimal seckillCount;
	/**
	 * 每人限購數量
	 */
	private BigDecimal seckillLimit;
	/**
	 * 排序
	 */
	private Integer seckillSort;

}
