package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 訂單操作歷史記錄
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 09:59:02
 */
@Data
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 訂單id
	 */
	private Long orderId;
	/**
	 * 操作人[用戶；系統；後臺管理員]
	 */
	private String operateMan;
	/**
	 * 操作時間
	 */
	private Date createTime;
	/**
	 * 訂單狀態【0->待付款；1->待發貨；2->已發貨；3->已完成；4->已關閉；5->無效訂單】
	 */
	private Integer orderStatus;
	/**
	 * 備註
	 */
	private String note;

}
