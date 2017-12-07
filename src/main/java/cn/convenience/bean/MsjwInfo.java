package cn.convenience.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 民生警务个人信息
 * @author Mbenben
 *
 */
public class MsjwInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8858017791917536158L;
	
	private AuthenticationBasicInformation authenticationBasicInformation;

	public static class AuthenticationBasicInformation implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -6132687022795771039L;
		
		private String trueName;//真实姓名
		private String identityCard;//身份证号
		private String userRole;//用户角色 1为个人
		private String zt;//用户状态
		private String mobilephone;//移动电话
		private String placeOfDomicile;//户籍所在地 1深户，0外籍户口
		private String address;//通讯地址
		private String certTime;//认证时间
		private String bindDriverLicence;//用户是否已绑定驾驶证0-未绑定，1-已绑定
		private String bindVehicle;//用户是否已绑定车辆0-未绑定，1-已绑定
		public String getTrueName() {
			return trueName;
		}
		public void setTrueName(String trueName) {
			this.trueName = trueName;
		}
		public String getIdentityCard() {
			return identityCard;
		}
		public void setIdentityCard(String identityCard) {
			this.identityCard = identityCard;
		}
		public String getUserRole() {
			return userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
		public String getZt() {
			return zt;
		}
		public void setZt(String zt) {
			this.zt = zt;
		}
		public String getMobilephone() {
			return mobilephone;
		}
		public void setMobilephone(String mobilephone) {
			this.mobilephone = mobilephone;
		}
		public String getPlaceOfDomicile() {
			return placeOfDomicile;
		}
		public void setPlaceOfDomicile(String placeOfDomicile) {
			this.placeOfDomicile = placeOfDomicile;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCertTime() {
			return certTime;
		}
		public void setCertTime(String certTime) {
			this.certTime = certTime;
		}
		public String getBindDriverLicence() {
			return bindDriverLicence;
		}
		public void setBindDriverLicence(String bindDriverLicence) {
			this.bindDriverLicence = bindDriverLicence;
		}
		public String getBindVehicle() {
			return bindVehicle;
		}
		public void setBindVehicle(String bindVehicle) {
			this.bindVehicle = bindVehicle;
		}
		@Override
		public String toString() {
			return "AuthenticationBasicInformation [trueName=" + trueName + ", identityCard=" + identityCard
					+ ", userRole=" + userRole + ", zt=" + zt + ", mobilephone=" + mobilephone + ", placeOfDomicile="
					+ placeOfDomicile + ", address=" + address + ", certTime=" + certTime + ", bindDriverLicence="
					+ bindDriverLicence + ", bindVehicle=" + bindVehicle + "]";
		}
	}
	
	private List<DriverLicenceInfo> driverLicenceInfoList;
	
	public static class DriverLicenceInfo implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -1275816922369911037L;
		
		private String driverLicenceNo;//驾驶证号码
		private String fileNumber;//驾驶证档案编号
		public String getDriverLicenceNo() {
			return driverLicenceNo;
		}
		public void setDriverLicenceNo(String driverLicenceNo) {
			this.driverLicenceNo = driverLicenceNo;
		}
		public String getFileNumber() {
			return fileNumber;
		}
		public void setFileNumber(String fileNumber) {
			this.fileNumber = fileNumber;
		}
		@Override
		public String toString() {
			return "DriverLicenceInfo [driverLicenceNo=" + driverLicenceNo + ", fileNumber=" + fileNumber + "]";
		}
	}
	
	private List<VehicleInfo> cars;
	
	public static class VehicleInfo implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -8312506571916736289L;
		
		private String myNumberPlate;//号牌号码
		private String plateType;//号牌种类
		private String inspectDate;//审验日期
		private String behindTheFrame4Digits;//车架后4位
		private String name;//车主姓名
		private String identityCard;//车主身份证明号码
		private String isMySelf;//是否本人
		private String bindDepartment;//绑定车辆渠道  Aapp C微信 Z支付宝 E邮政 W外网星火
		private String vehicleStatus;//状态提醒
		private String forceScrapDate;//强制报废期止提醒
		public String getMyNumberPlate() {
			return myNumberPlate;
		}
		public void setMyNumberPlate(String myNumberPlate) {
			this.myNumberPlate = myNumberPlate;
		}
		public String getPlateType() {
			return plateType;
		}
		public void setPlateType(String plateType) {
			this.plateType = plateType;
		}
		public String getInspectDate() {
			return inspectDate;
		}
		public void setInspectDate(String inspectDate) {
			this.inspectDate = inspectDate;
		}
		public String getBehindTheFrame4Digits() {
			return behindTheFrame4Digits;
		}
		public void setBehindTheFrame4Digits(String behindTheFrame4Digits) {
			this.behindTheFrame4Digits = behindTheFrame4Digits;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getIdentityCard() {
			return identityCard;
		}
		public void setIdentityCard(String identityCard) {
			this.identityCard = identityCard;
		}
		public String getIsMySelf() {
			return isMySelf;
		}
		public void setIsMySelf(String isMySelf) {
			this.isMySelf = isMySelf;
		}
		public String getBindDepartment() {
			return bindDepartment;
		}
		public void setBindDepartment(String bindDepartment) {
			this.bindDepartment = bindDepartment;
		}
		public String getVehicleStatus() {
			return vehicleStatus;
		}
		public void setVehicleStatus(String vehicleStatus) {
			this.vehicleStatus = vehicleStatus;
		}
		public String getForceScrapDate() {
			return forceScrapDate;
		}
		public void setForceScrapDate(String forceScrapDate) {
			this.forceScrapDate = forceScrapDate;
		}
		@Override
		public String toString() {
			return "VehicleInfo [myNumberPlate=" + myNumberPlate + ", plateType=" + plateType + ", inspectDate="
					+ inspectDate + ", behindTheFrame4Digits=" + behindTheFrame4Digits + ", name=" + name
					+ ", identityCard=" + identityCard + ", isMySelf=" + isMySelf + ", bindDepartment=" + bindDepartment
					+ ", vehicleStatus=" + vehicleStatus + ", forceScrapDate=" + forceScrapDate + "]";
		}
	}

	public AuthenticationBasicInformation getAuthenticationBasicInformation() {
		return authenticationBasicInformation;
	}

	public void setAuthenticationBasicInformation(AuthenticationBasicInformation authenticationBasicInformation) {
		this.authenticationBasicInformation = authenticationBasicInformation;
	}

	public List<DriverLicenceInfo> getDriverLicenceInfoList() {
		return driverLicenceInfoList;
	}

	public void setDriverLicenceInfoList(List<DriverLicenceInfo> driverLicenceInfoList) {
		this.driverLicenceInfoList = driverLicenceInfoList;
	}

	public List<VehicleInfo> getCars() {
		return cars;
	}

	public void setCars(List<VehicleInfo> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "MSJWinfo [authenticationBasicInformation=" + authenticationBasicInformation + ", driverLicenceInfoList="
				+ driverLicenceInfoList + ", cars=" + cars + "]";
	}

}
