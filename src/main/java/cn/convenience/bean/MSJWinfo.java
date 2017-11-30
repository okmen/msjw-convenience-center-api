package cn.convenience.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 民生警务个人信息
 * @author Mbenben
 *
 */
public class MSJWinfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8858017791917536158L;

	private String name;//真实姓名
	private String identityCard;//身份证号
	private String userRole;//用户角色 1为个人
	private String userStatus;//用户状态
	private String mobilephone;//移动电话
	private String placeOfDomicile;//户籍所在地 1深户，0外籍户口
	private String address;//通讯地址
	private String certTime;//认证时间
	private String bindDriverLicence;//用户是否已绑定驾驶证0-未绑定，1-已绑定
	
	private List<DriverLicenceInfo> driverLicenceInfoList;
	
	public static class DriverLicenceInfo implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -1275816922369911037L;
		
		private String driverLicenceNo;//驾驶证号码
		private String fileNo;//驾驶证档案编号
		public String getDriverLicenceNo() {
			return driverLicenceNo;
		}
		public void setDriverLicenceNo(String driverLicenceNo) {
			this.driverLicenceNo = driverLicenceNo;
		}
		public String getFileNo() {
			return fileNo;
		}
		public void setFileNo(String fileNo) {
			this.fileNo = fileNo;
		}
		@Override
		public String toString() {
			return "DriverLicenceInfo [driverLicenceNo=" + driverLicenceNo + ", fileNo=" + fileNo + "]";
		}
		
	}
	
	private String bindVehicle;//用户是否已绑定车辆0-未绑定，1-已绑定
	private List<VehicleInfo> vehicleInfoList;
	
	public static class VehicleInfo implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -8312506571916736289L;
		
		private String plateNo;//号牌号码
		private String plateType;//号牌种类
		private String inspectDate;//审验日期
		private String vinLast4;//车架后4位
		private String carOwnerName;//车主姓名
		private String carOwnerIdCard;//车主身份证明号码
		private String isMyVehicle;//是否本人
		private String bindDepartment;//绑定车辆渠道  Aapp C微信 Z支付宝 E邮政 W外网星火
		private String vehicleStatus;//状态提醒
		private String forceScrapDate;//强制报废期止提醒
		public String getPlateNo() {
			return plateNo;
		}
		public void setPlateNo(String plateNo) {
			this.plateNo = plateNo;
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
		public String getVinLast4() {
			return vinLast4;
		}
		public void setVinLast4(String vinLast4) {
			this.vinLast4 = vinLast4;
		}
		public String getCarOwnerName() {
			return carOwnerName;
		}
		public void setCarOwnerName(String carOwnerName) {
			this.carOwnerName = carOwnerName;
		}
		public String getCarOwnerIdCard() {
			return carOwnerIdCard;
		}
		public void setCarOwnerIdCard(String carOwnerIdCard) {
			this.carOwnerIdCard = carOwnerIdCard;
		}
		public String getIsMyVehicle() {
			return isMyVehicle;
		}
		public void setIsMyVehicle(String isMyVehicle) {
			this.isMyVehicle = isMyVehicle;
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
			return "VehicleInfo [plateNo=" + plateNo + ", plateType=" + plateType + ", inspectDate=" + inspectDate
					+ ", vinLast4=" + vinLast4 + ", carOwnerName=" + carOwnerName + ", carOwnerIdCard=" + carOwnerIdCard
					+ ", isMyVehicle=" + isMyVehicle + ", bindDepartment=" + bindDepartment + ", vehicleStatus="
					+ vehicleStatus + ", forceScrapDate=" + forceScrapDate + "]";
		}
		
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

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
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

	public List<DriverLicenceInfo> getDriverLicenceInfoList() {
		return driverLicenceInfoList;
	}

	public void setDriverLicenceInfoList(List<DriverLicenceInfo> driverLicenceInfoList) {
		this.driverLicenceInfoList = driverLicenceInfoList;
	}

	public String getBindVehicle() {
		return bindVehicle;
	}

	public void setBindVehicle(String bindVehicle) {
		this.bindVehicle = bindVehicle;
	}

	public List<VehicleInfo> getVehicleInfoList() {
		return vehicleInfoList;
	}

	public void setVehicleInfoList(List<VehicleInfo> vehicleInfoList) {
		this.vehicleInfoList = vehicleInfoList;
	}

	@Override
	public String toString() {
		return "MSJWinfo [name=" + name + ", identityCard=" + identityCard + ", userRole=" + userRole + ", userStatus="
				+ userStatus + ", mobilephone=" + mobilephone + ", placeOfDomicile=" + placeOfDomicile + ", address="
				+ address + ", certTime=" + certTime + ", bindDriverLicence=" + bindDriverLicence
				+ ", driverLicenceInfoList=" + driverLicenceInfoList + ", bindVehicle=" + bindVehicle
				+ ", vehicleInfoList=" + vehicleInfoList + "]";
	}
	
}
