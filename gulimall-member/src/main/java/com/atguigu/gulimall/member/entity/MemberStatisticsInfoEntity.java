package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員統計資訊
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 10:03:40
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 會員id
	 */
	private Long memberId;
	/**
	 * 累計消費金額
	 */
	private BigDecimal consumeAmount;
	/**
	 * 累計優惠金額
	 */
	private BigDecimal couponAmount;
	/**
	 * 訂單數量
	 */
	private Integer orderCount;
	/**
	 * 優惠券數量
	 */
	private Integer couponCount;
	/**
	 * 評價數
	 */
	private Integer commentCount;
	/**
	 * 退貨數量
	 */
	private Integer returnOrderCount;
	/**
	 * 登錄次數
	 */
	private Integer loginCount;
	/**
	 * 關注數量
	 */
	private Integer attendCount;
	/**
	 * 粉絲數量
	 */
	private Integer fansCount;
	/**
	 * 收藏的商品數量
	 */
	private Integer collectProductCount;
	/**
	 * 收藏的專題活動數量
	 */
	private Integer collectSubjectCount;
	/**
	 * 收藏的評論數量
	 */
	private Integer collectCommentCount;
	/**
	 * 邀請的朋友數量
	 */
	private Integer inviteFriendCount;

}
