package cn.convenience.bean;

import java.io.Serializable;

/**
 * 民生警务六年免检记录
 * @author Mbenben
 *
 */
public class MsjwVehicleInspectionVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8810064725542213140L;

	private Integer id;
	private String tylsbh;//	编号(必须保证其唯一性)
	private String applyman;//	用户唯一标识
	private String eventname;//	事项名称
	private String showstatus;//	当前状态名称
	private String insdate;//	插入时间（不传时默认当前时间）
	private String lastupddate;//	最后一次修改时间（不传时默认当前时间）
	private String liststatus;//	显示在个人中心哪个列表设置,01、我的草稿：暂存尚未申办的数据；02、在办业务：所有未办结且不需要补正的业务；03、补正业务：需要补正的业务；04、进度查询：所有已成功申办的数据； 
	/*private String draftUrlWx;//	微信草稿跳转地址，listStatus设置为01时必传
	private String buzhengUrlWx;//	微信补正跳转地址，listStatus设置为03时必传
*/	private String applyingUrlWx;//	微信在办跳转地址，listStatus设置为02时必传
	private String jinduUrlWx;//	微信进度查询跳转地址，listStatus设置为02、03、04必传
	private String openid;//	微信公众号唯一标识(微信端必须)
	private String showtype;//	显示设置：0 同时在微信和网页个人中心显示 1 只在微信个人中心显示 2 只在PC个人中心显示
	private String source;//	申报来源（100 网页端 ；101微信端）
	private String identityId;//身份证号
	private String platNumber;//车牌号码
	private String approveState;//审核状态
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTylsbh() {
		return tylsbh;
	}
	public void setTylsbh(String tylsbh) {
		this.tylsbh = tylsbh;
	}
	public String getApplyman() {
		return applyman;
	}
	public void setApplyman(String applyman) {
		this.applyman = applyman;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getShowstatus() {
		return showstatus;
	}
	public void setShowstatus(String showstatus) {
		this.showstatus = showstatus;
	}
	public String getInsdate() {
		return insdate;
	}
	public void setInsdate(String insdate) {
		this.insdate = insdate;
	}
	public String getLastupddate() {
		return lastupddate;
	}
	public void setLastupddate(String lastupddate) {
		this.lastupddate = lastupddate;
	}
	public String getListstatus() {
		return liststatus;
	}
	public void setListstatus(String liststatus) {
		this.liststatus = liststatus;
	}
	public String getApplyingUrlWx() {
		return applyingUrlWx;
	}
	public void setApplyingUrlWx(String applyingUrlWx) {
		this.applyingUrlWx = applyingUrlWx;
	}
	public String getJinduUrlWx() {
		return jinduUrlWx;
	}
	public void setJinduUrlWx(String jinduUrlWx) {
		this.jinduUrlWx = jinduUrlWx;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getShowtype() {
		return showtype;
	}
	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getIdentityId() {
		return identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	public String getPlatNumber() {
		return platNumber;
	}
	public void setPlatNumber(String platNumber) {
		this.platNumber = platNumber;
	}
	public String getApproveState() {
		return approveState;
	}
	public void setApproveState(String approveState) {
		this.approveState = approveState;
	}
	@Override
	public String toString() {
		return "MsjwVehicleInspectionVo [id=" + id + ", tylsbh=" + tylsbh + ", applyman=" + applyman + ", eventname="
				+ eventname + ", showstatus=" + showstatus + ", insdate=" + insdate + ", lastupddate=" + lastupddate
				+ ", liststatus=" + liststatus + ", applyingUrlWx=" + applyingUrlWx + ", jinduUrlWx=" + jinduUrlWx
				+ ", openid=" + openid + ", showtype=" + showtype + ", source=" + source + ", identityId=" + identityId
				+ ", platNumber=" + platNumber + ", approveState=" + approveState + "]";
	}
	
}
