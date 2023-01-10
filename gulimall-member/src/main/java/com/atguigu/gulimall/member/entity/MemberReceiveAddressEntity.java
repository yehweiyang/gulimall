package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員收貨地址
 * 
 * @author YehWeiYang
 * @email YehWeiYang@gmail.com
 * @date 2023-01-10 10:03:40
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * 收貨人姓名
	 */
	private String name;
	/**
	 * 電話
	 */
	private String phone;
	/**
	 * 郵遞區號
	 */
	private String postCode;
	/**
	 * 省份/直轄市
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 區
	 */
	private String region;
	/**
	 * 詳細地址(街道)
	 */
	private String detailAddress;
	/**
	 * 省市區代碼
	 */
	private String areacode;
	/**
	 * 是否默認
	 */
	private Integer defaultStatus;

}
