package cn.convenience.bean;

import java.io.Serializable;

/**
 * 
 * @author zhongyulin
 *
 */
public class ApplyGreenRet implements Serializable{
     private String cdate;  //申请停驶日期2(格式：yyyyMMdd)
     private String type;   //申请类型
	public String getCdate() {
		return cdate;
	}
	/**
	 * 申请停驶日期2(格式：yyyyMMdd)
	 * @param cdate
	 */
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getType() {
		return type;
	}
	/**
	 * 申请类型
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
     
}
