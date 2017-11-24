package cn.convenience.service;

import java.util.List;


import cn.convenience.bean.ActivityVote;
import cn.convenience.bean.ActivityVoteRecord;
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
	/**
	 * 删除投票人信息
	 * @param id
	 * @return
	 */
	int deleteById(Integer id) throws Exception;

    int insert(ActivityVote record) throws Exception;

    ActivityVote selectById(Integer id) throws Exception;

    List<ActivityVote> getVoteByPage(Integer page ,Integer pageSize) throws Exception;

    int updateById(int id) throws Exception;
    
    int queryCount() throws Exception;
    
    List<ActivityVote> getFrontVote(Integer total) throws Exception;
    
    int queryCountSum() throws Exception;
    
    List<ActivityVote> selectByName(String name) throws Exception;
    
    int selectRank(int count)throws Exception;
    public void setKey(String key, int seconds);
	public boolean exists(String key);
	
	/**
	 * （微信）进入平安好车主投票页面流览量统计
	 * @throws Exception
	 */
	void goodCarOwnerWechat() throws Exception;
	/**
	 * （支付宝）进入平安好车主投票页面流览量统计
	 * @throws Exception
	 */
	void goodCarOwnerAlipay() throws Exception;
	/**
	 * （平安）进入平安好车主投票页面流览量统计
	 * @throws Exception
	 */
	void goodCarOwnerPingan() throws Exception;
	
	/**
	 * 写入投票记录
	 * @param record
	 * @return
	 */
	int addVoteRecord(ActivityVoteRecord record);
	
	public void setFront15(Object list);
	public Object getFront15();
}
