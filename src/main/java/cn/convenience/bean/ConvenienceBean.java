package cn.convenience.bean;

import java.io.Serializable;

/**
 * @ClassName: ConvenienceBean 
 * @Description: TODO(便民服务) 
 * @author yangzan 
 * @date 2017年4月12日 下午3:22:28 
 *
 */
public class ConvenienceBean implements Serializable{
	
	/** 
	 * @Fields serialVersionUID 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;		//星际用户id
	private String userName; 	//用户名
	private String mobilephone;  //用户手机
	private String identityCard;	//身份证
	private String reportingMatters; //举报事项 1001设施坏了、1002安全隐患、1003经常拥堵、1004秩序混乱
	private String detailAddress;    //详细地址
	private String address;			 //地点
	private String addressCode;		 //地点代码  经纬度
	private String emergency;		 //紧急程度  紧急、普通
	private String selectType;  	 //选择类型   
	private String selectTypeId;	 //选择类型Id
	private String subType;			 //选择子类型
	private String subTypeId;		 //选择子类型Id
	private String description;		 //现场描述
	private String sceneImg;		 //现场图片
	
	private String startTime;  		//开始时间
	private String endTiem; 		//结束时间
	private String direction;  		//方向
	private String congestionCode;	//拥堵类型代码
	private String congestionType;  //拥堵类型
	private String congestionGrade;	//拥堵等级
	private String roadServiceLevel;	//道理服务水平
	private String congestionReason;	//拥堵成因
	private String improveAdvice;		//改善建议
	private String numberPlate;		//车牌号码
	private String abbreviation;	//车牌简称
	private String carType;			//汽车种类
	private String doodgenAddress;	//挪车地址
	
	private String addressRegion;	//地址-区域
	private String addressStreet;	//地址-街道
	private String addressSite;		//地址-站点
	private String ip;			//ip地址
	private String sourceOfCertification;		//来源
	
	
	public String getAddressCode() {
		return addressCode;
	}
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	public String getCongestionCode() {
		return congestionCode;
	}
	public void setCongestionCode(String congestionCode) {
		this.congestionCode = congestionCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getReportingMatters() {
		return reportingMatters;
	}
	public void setReportingMatters(String reportingMatters) {
		this.reportingMatters = reportingMatters;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmergency() {
		return emergency;
	}
	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}
	public String getSelectType() {
		return selectType;
	}
	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSceneImg() {
		return sceneImg;
	}
	public void setSceneImg(String sceneImg) {
		this.sceneImg = sceneImg;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTiem() {
		return endTiem;
	}
	public void setEndTiem(String endTiem) {
		this.endTiem = endTiem;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getCongestionType() {
		return congestionType;
	}
	public void setCongestionType(String congestionType) {
		this.congestionType = congestionType;
	}
	public String getCongestionGrade() {
		return congestionGrade;
	}
	public void setCongestionGrade(String congestionGrade) {
		this.congestionGrade = congestionGrade;
	}
	public String getRoadServiceLevel() {
		return roadServiceLevel;
	}
	public void setRoadServiceLevel(String roadServiceLevel) {
		this.roadServiceLevel = roadServiceLevel;
	}
	public String getCongestionReason() {
		return congestionReason;
	}
	public void setCongestionReason(String congestionReason) {
		this.congestionReason = congestionReason;
	}
	public String getImproveAdvice() {
		return improveAdvice;
	}
	public void setImproveAdvice(String improveAdvice) {
		this.improveAdvice = improveAdvice;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getDoodgenAddress() {
		return doodgenAddress;
	}
	public void setDoodgenAddress(String doodgenAddress) {
		this.doodgenAddress = doodgenAddress;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSelectTypeId() {
		return selectTypeId;
	}
	public void setSelectTypeId(String selectTypeId) {
		this.selectTypeId = selectTypeId;
	}
	public String getSubTypeId() {
		return subTypeId;
	}
	public void setSubTypeId(String subTypeId) {
		this.subTypeId = subTypeId;
	}
	public String getAddressRegion() {
		return addressRegion;
	}
	public void setAddressRegion(String addressRegion) {
		this.addressRegion = addressRegion;
	}
	public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddressSite() {
		return addressSite;
	}
	public void setAddressSite(String addressSite) {
		this.addressSite = addressSite;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	
	@Override
	public String toString() {
		return "ConvenienceBean [userId=" + userId + ", userName=" + userName + ", mobilephone=" + mobilephone
				+ ", identityCard=" + identityCard + ", reportingMatters=" + reportingMatters + ", detailAddress="
				+ detailAddress + ", address=" + address + ", addressCode=" + addressCode + ", emergency=" + emergency
				+ ", selectType=" + selectType + ", selectTypeId=" + selectTypeId + ", subType=" + subType
				+ ", subTypeId=" + subTypeId + ", description=" + description + ", sceneImg=" + sceneImg
				+ ", startTime=" + startTime + ", endTiem=" + endTiem + ", direction=" + direction + ", congestionCode="
				+ congestionCode + ", congestionType=" + congestionType + ", congestionGrade=" + congestionGrade
				+ ", roadServiceLevel=" + roadServiceLevel + ", congestionReason=" + congestionReason
				+ ", improveAdvice=" + improveAdvice + ", numberPlate=" + numberPlate + ", abbreviation=" + abbreviation
				+ ", carType=" + carType + ", doodgenAddress=" + doodgenAddress + ", addressRegion=" + addressRegion
				+ ", addressStreet=" + addressStreet + ", addressSite=" + addressSite + ", ip=" + ip
				+ ", sourceOfCertification=" + sourceOfCertification + "]";
	}
	
}