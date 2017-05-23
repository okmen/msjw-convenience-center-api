package cn.convenience.bean;

import java.io.Serializable;

/**
 * @ClassName: FeedbackResultBean 
 * @Description: TODO(反馈结果) 
 * @author jiangjiayi
 * @date 2017年5月22日 上午10:44:28 
 */
public class FeedbackResultBean implements Serializable {

	/**
	 * @Fields serialVersionUID
	 */
	private static final long serialVersionUID = 7056925297642627774L;
	
	private String fileName;	//文档名称
	private String filePath;	//文档路径
	
	public FeedbackResultBean() {
	}
	public FeedbackResultBean(String fileName, String filePath) {
		this.fileName = fileName;
		this.filePath = filePath;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
