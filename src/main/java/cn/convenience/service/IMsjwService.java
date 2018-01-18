package cn.convenience.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import cn.convenience.bean.MsjwApplyingBusinessVo;
import cn.convenience.bean.MsjwApplyingRecordVo;
import cn.convenience.bean.MsjwVehicleInspectionVo;
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
	
	/**
	 * 新增在办业务到民生警务平台
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public JSONObject addApplyingBusiness(MsjwApplyingBusinessVo vo)throws Exception;
	/**
	 * 新增在办业务到民生警务平台
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public JSONObject addCarMortgageBusiness(MsjwApplyingBusinessVo vo)throws Exception;
	
	/**
	 * 修改在办业务到民生警务平台
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public JSONObject updateApplyingBusiness(MsjwApplyingBusinessVo vo)throws Exception;
	
	/**
	 * 删除在办业务到民生警务平台
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public JSONObject deleteApplyingBusiness(String tylsbh)throws Exception;
	
	/**
	 * 修改状态
	 * @param msjwApplyingRecordVo
	 * @return
	 */
	int updateMsjwApplyingRecordById(MsjwApplyingRecordVo msjwApplyingRecordVo)throws Exception;
	
	/**
	 * 删除业务
	 * @param id
	 * @return
	 */
	int deleteMsjwApplyingRecordById(Integer id)throws Exception;
	
	/**
	 * 查询所有不同身份证号
	 * @return
	 */
	List<String> selectIdentityIdAll()throws Exception;
	
	/**
	 * 根据流水号查询
	 * @param tylsbh 流水号
	 * @return
	 */
	MsjwApplyingRecordVo selectMsjwApplyingRecordByTylsbh(String tylsbh)throws Exception;
	
	/**
	 * 写入到已完结表中
	 * @param msjwApplyingRecordVo
	 * @return
	 */
	int addMsjwFinishedRecord(MsjwApplyingRecordVo msjwApplyingRecordVo)throws Exception;
	
	/**
	 * 新增记录
	 * @param vo
	 * @return
	 */
	int addMsjwVehicleInspection(MsjwVehicleInspectionVo vo);
	
	/**
	 * 查询审核状态为0-待审核记录
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<MsjwVehicleInspectionVo> selectMsjwVehicleInspectionStatusZero(Integer page, Integer pageSize);
	
	/**
	 * 根据tylsbh和platNumber更新数据库状态
	 * @param vo
	 * @return
	 */
	int updateMsjwVehicleInspection(MsjwVehicleInspectionVo vo);
	
	/**
	 * 根据tylsbh和platNumber删除记录
	 * @param tylsbh
	 * @param platNumber
	 * @return
	 */
	int deleteMsjwVehicleInspection(String tylsbh, String platNumber);

	/**
	 * 新增在办业务到民生警务平台(六年免检)
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public JSONObject addVehicleInspectionBusiness(MsjwVehicleInspectionVo vo)throws Exception;
}
