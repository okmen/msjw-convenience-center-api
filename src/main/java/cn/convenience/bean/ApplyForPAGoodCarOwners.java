package cn.convenience.bean;

import java.io.Serializable;

public class ApplyForPAGoodCarOwners implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ownerName;//车主姓名
	private String driverLicense;//驾驶证号码
	private String licenseNumber;//车牌号码
	private String numberPlate;//车牌种类
	private String mobile;//手机号
	private String securityDeclaration;//安全宣言
	private String RZZP;//认证照片
	private String sourceOfCertification;//申请来源
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSecurityDeclaration() {
		return securityDeclaration;
	}

	public void setSecurityDeclaration(String securityDeclaration) {
		this.securityDeclaration = securityDeclaration;
	}

	public String getRZZP() {
		return RZZP;
	}

	public void setRZZP(String RZZP) {
		RZZP = RZZP;
	}

	public String getSourceOfCertification() {
		return sourceOfCertification;
	}

	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}

	@Override
	public String toString() {
		return "applyForPAGoodCarOwners [ownerName=" + ownerName + ", driverLicense=" + driverLicense
				+ ", licenseNumber=" + licenseNumber + ", numberPlate=" + numberPlate + ", mobile=" + mobile
				+ ", securityDeclaration=" + securityDeclaration + ", RZZP=" + RZZP + ", sourceOfCertification="
				+ sourceOfCertification + "]";
	}
	
}
