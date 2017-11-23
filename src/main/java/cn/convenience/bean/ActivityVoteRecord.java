package cn.convenience.bean;

import java.io.Serializable;
import java.util.Date;

public class ActivityVoteRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5276587010020364437L;

	private Integer id;
	private String uniqueId;
	private Date voteDate;
	private String source;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public Date getVoteDate() {
		return voteDate;
	}
	public void setVoteDate(Date voteDate) {
		this.voteDate = voteDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Override
	public String toString() {
		return "ActivityVoteRecord [id=" + id + ", uniqueId=" + uniqueId + ", voteDate=" + voteDate + ", source="
				+ source + "]";
	}
}
