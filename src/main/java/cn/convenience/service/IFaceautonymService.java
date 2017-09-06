package cn.convenience.service;

import cn.sdk.bean.BaseBean;

/**
 * 微信刷脸验证获取用户信息
 * @author Maibenben
 *
 */
public interface IFaceautonymService {
	/**
	 * 获取用户信息
	 * @return
	 */
	BaseBean getdetectinfo(String appid,String token)throws Exception;
}
