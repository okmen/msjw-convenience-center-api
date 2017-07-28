package cn.convenience.service;

import cn.convenience.bean.GreenTravelBean;
import cn.sdk.bean.BaseBean;
/**
 * 
 * @author zhongyulin
 *
 */
public interface IGreentravelService {
    /**
     * 获取域名
     * @return
     */
	public String getTemplateSendUrl();
	/**
	 * 
	 *  @Title: applyDownDate 
	 * @Description: TODO(可申请停驶日期提取) 
	 * @param @param greenTravelBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean applyDownDate(GreenTravelBean greenTravelBean)throws Exception;
	
	/**
	 * 
	 *  @Title: downDatedeclare 
	 * @Description: TODO(提交申报停驶日期) 
	 * @param @param greenTravelBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean downDatedeclare(GreenTravelBean greenTravelBean)throws Exception;
	
	/**
	 * 
	 *  @Title: applyrunningQuery 
	 * @Description: TODO(申请流水查询)
	 * @param @param greenTravelBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean applyrunningQuery(GreenTravelBean greenTravelBean)throws Exception;
	
	/**
	 * 
	 @Title: applyTotalQuery 
	 * @Description: TODO(车辆停驶情况查询)
	 * @param @param greenTravelBean
	 * @param @return 设定文件 
	 * @return BaseBean 返回类型 
	 * @throws
	 */
	BaseBean applyTotalQuery(GreenTravelBean greenTravelBean)throws Exception;
	

}
