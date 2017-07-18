package cn.convenience.bean;

import java.io.Serializable;

/**
 * 电动车档案信息
 * @author Mbenben
 *
 */
public class EbikeInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 370323821830106737L;
	
	private String ebikeImgUrl;		//电动车照片资源路径
	private String plateNo;			//车辆号牌
	private String vehicleStatus;	//车辆状态	已备案,已注销
	private String footDevice;		//脚踏装置	0-有,1-无
	private String fileNo;			//档案编号
	private String engineNo;		//电机号码
	private String drivingArea;		//行驶区域
	private String brandType;		//品牌型号
	private String color;			//车身颜色
	private String assocName;		//协会名称
	
	public String getEbikeImgUrl() {
		return ebikeImgUrl;
	}
	public void setEbikeImgUrl(String ebikeImgUrl) {
		this.ebikeImgUrl = ebikeImgUrl;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	public String getFootDevice() {
		return footDevice;
	}
	public void setFootDevice(String footDevice) {
		this.footDevice = footDevice;
	}
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getDrivingArea() {
		return drivingArea;
	}
	public void setDrivingArea(String drivingArea) {
		this.drivingArea = drivingArea;
	}
	public String getBrandType() {
		return brandType;
	}
	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAssocName() {
		return assocName;
	}
	public void setAssocName(String assocName) {
		this.assocName = assocName;
	}
}
