package cn.convenience.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Description: TODO(绿色出行) 
 * @author zhongyulin
 *
 */
public class GreenTravelBean implements Serializable {
	 private String userId;		//星际用户id
	 private String userName; 	//用户名
     private String hphm;   //车牌号 
     private String hpzl;  //号牌种类
     private String sfzmhm;  //身份证号码
     private String mobile;   //手机号码
     private String month; //月份
     private String sname;  //车主姓名/车主使用人
     private String sfbr;  //1是本人，0是非本人 
     private String type; //申请类型（1申请;0取消申请）
     private String cdate;   //申请停驶日期2(格式：yyyyMMdd)
     private String lrly;   //申请来源（WX:微信，ZFB支付宝，APP:手机App）
     private String sqrq;   //申请日期
     private  List<ApplyGreenRet> applyGreenRetList;   //多条申请停驶记录
	public String getHphm() {
		return hphm;
	}
	/**
	 * 车牌号
	 * @param hphm
	 */
	public void setHphm(String hphm) {
		this.hphm = hphm;
	}
	public String getHpzl() {
		return hpzl;
	}
	/**
	 * 号牌号码
	 * @param hpzl
	 */
	public void setHpzl(String hpzl) {
		this.hpzl = hpzl;
	}
	public String getSfzmhm() {
		return sfzmhm;
	}
	/**
	 * 身份证号码
	 * @param sfzmhm
	 */
	public void setSfzmhm(String sfzmhm) {
		this.sfzmhm = sfzmhm;
	}
	public String getMonth() {
		return month;
	}
	/**
	 * 月份
	 * @param month
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSname() {
		return sname;
	}
	/**
	 * 车主姓名/车主使用人
	 * @param sname
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSfbr() {
		return sfbr;
	}
	/**
	 * 1是本人，0是非本人
	 * @param sfbr
	 */
	public void setSfbr(String sfbr) {
		this.sfbr = sfbr;
	}
	public String getType() {
		return type;
	}
	/**
	 * 申请类型（1申请;0取消申请）
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	public String getCdate() {
		return cdate;
	}
	/**
	 * 申请停驶日期(格式：yyyyMMdd)
	 * @param cdate
	 */
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getLrly() {
		return lrly;
	}
	/**
	 * 申请来源（WX:微信，ZFB支付宝，APP:手机App）
	 * @param lrly
	 */
	public void setLrly(String lrly) {
		this.lrly = lrly;
	}
	public String getSqrq() {
		return sqrq;
	}
	/**
	 * 申请日期(yyyyMMdd)
	 * @param sqrq
	 */
	public void setSqrq(String sqrq) {
		this.sqrq = sqrq;
	}
	public List<ApplyGreenRet> getApplyGreenRetList() {
		return applyGreenRetList;
	}
	/**
	 * 申请停驶记录
	 * @param applyGreenRetList
	 */
	public void setApplyGreenRetList(List<ApplyGreenRet> applyGreenRetList) {
		this.applyGreenRetList = applyGreenRetList;
	}
	public String getUserId() {
		return userId;
	}
	/**
	 * 星级用户ID
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	/**
	 * 用户名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	/**
	 * 手机号码
	 * @param mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
     
}
