package cn.convenience.service;

import com.alibaba.fastjson.JSONObject;

import cn.sdk.bean.BaseBean;

/**
 * 民生警务相关接口
 * @author jjy
 *
 */
public interface IMsjwService {

	/**
	 * 民生警务个人信息
	 * @param identityCard 身份证
	 * @param sourceOfCertification 认证来源
	 * @return
	 * @throws Exception
	 */
	public BaseBean getMSJWinfo(String identityCard, String sourceOfCertification)throws Exception;
	
	/**
	 * 根据openid获取民生警务平台用户信息
	 * @param openId 民生警务平台公众号openId
	 * @return
	 */
	public JSONObject getUserInfoFromMsjw(String openId)throws Exception;
	
	/**
	 * 发送模板消息到民生警务平台
	 * @param params 模板消息内容json格式字符串
	 * @return
	 * @throws Exception
	 */
	public JSONObject sendTemplateMsg2Msjw(String params)throws Exception;
	
	/**
	 * 查询消息推送结果
	 * @param msgId 微信消息id
	 * @return
	 * @throws Exception
	 */
	public JSONObject queryTemplateMsgSendResult(String msgId)throws Exception;
}
