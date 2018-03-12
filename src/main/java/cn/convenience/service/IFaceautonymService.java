package cn.convenience.service;

import cn.convenience.bean.SzjjToken;
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
	/**
	 * 微信刷脸存token
	 * @param sjzzToken
	 * @return
	 * @throws Exception
	 */
	int insertSzjjToken (SzjjToken szjjToken) throws Exception;
	/**
	 * 取token
	 * @return
	 * @throws Exception
	 */
	SzjjToken querySzjjToken(String identityCard) throws Exception;
}
