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
	 * 校验是否为民生警务平台合法用户
	 * @param openId 民生警务平台公众号openId
	 * @param identityCard 身份证号
	 * @return
	 */
	public JSONObject checkIsValidUser(String openId, String identityCard)throws Exception;
	
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
