package cn.convenience.bean;

import java.io.Serializable;

public class UserInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100439634388217183L;

	private String userImgUrl;		//使用人照片资源路径
	private String driverName;		//驾驶人姓名
	private String gender;			//性别	0-男,1-女
	private String age;				//年龄
	private String identityNo;		//身份证号
	private String mobilephone;		//联系电话
	private String companyName;		//所属单位名称
	
	public String getUserImgUrl() {
		return userImgUrl;
	}
	public void setUserImgUrl(String userImgUrl) {
		this.userImgUrl = userImgUrl;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getIdentityNo() {
		return identityNo;
	}
	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
