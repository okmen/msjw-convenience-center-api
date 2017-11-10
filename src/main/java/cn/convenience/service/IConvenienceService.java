package cn.convenience.service;

import java.util.List;

import cn.convenience.bean.ApplyForPAGoodCarOwners;
import cn.convenience.bean.ConvenienceBean;
import cn.convenience.bean.FeedbackResultBean;
import cn.convenience.bean.WechatUserInfoBean;
import cn.sdk.bean.BaseBean;

/**
 * @author suntao
 */
public interface IConvenienceService {
	 /**
     * 获取域名
     * @return
     */
	public String getTemplateSendUrl2();
	
	/**
	 * 插入微信用户信息
	 * @param wechatUserInfo
	 * @return 成功则返回纪录id，失败返回0
	 */
	int insertWechatUserInfo(WechatUserInfoBean wechatUserInfo);
    
	/**
	 * @Title: equipmentDamageReport 
	 * @Description: TODO(设备损坏通报) 
	 * @param @param convenienceBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean equipmentDamageReport(ConvenienceBean convenienceBean) throws Exception;
	
	/**
	 * @Title: safeHiddenDanger 
	 * @Description: TODO(安全隐患通报) 
	 * @param @param convenienceBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean safeHiddenDanger(ConvenienceBean convenienceBean) throws Exception;
	
	/**
	 * @Title: trafficCongestion 
	 * @Description: TODO(交通拥堵通报) 
	 * @param @param convenienceBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean trafficCongestion(ConvenienceBean convenienceBean) throws Exception;
	
	/**
	 * @Title: sequenceChaos 
	 * @Description: TODO(秩序混乱通报) 
	 * @param @param convenienceBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean sequenceChaos(ConvenienceBean convenienceBean) throws Exception;
	
	/**
	 * @Title: oneKeyDodgen 
	 * @Description: TODO(一键挪车) 
	 * @param @param convenienceBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean oneKeyDodgen(ConvenienceBean convenienceBean) throws Exception;
    
	/**
	 * @Title: historyNotice
	 * @Description: TODO(历史通报)
	 * @return List 返回类型
	 * @throws
	 */
	List<FeedbackResultBean> getAllResourcesAbsoluteUrl() throws Exception;
	
	/**
	 * 根据档案编号查询电动车档案信息
	 * @Description: TODO(根据档案编号查询电动车档案信息)
	 * @param fileNo 档案编号
	 * @throws Exception
	 */
	BaseBean getEbikeInfoByFileNo(String fileNo) throws Exception;
	/**
	 * 平安好车主评选
	 * @param applyForPAGoodCarOwners
	 * @return
	 * @throws Exception
	 */
	BaseBean applyForPAGoodCarOwners(ApplyForPAGoodCarOwners applyForPAGoodCarOwners) throws Exception;
	
}
