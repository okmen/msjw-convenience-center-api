package cn.convenience.bean;

import java.io.Serializable;

public class ActivityVote implements Serializable{
    private Integer id;

    //序号
    private Integer number;

    //姓名
    private String name;

    //照片地址
    private String imgUrl;

    //安全宣言
    private String securityDeclaration;

    //票数
    private Integer count;
    private Integer rank;
    

    public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取序号
     *
     * @return number - 序号
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置序号
     *
     * @param number 序号
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取照片地址
     *
     * @return img_url - 照片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置照片地址
     *
     * @param imgUrl 照片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取安全宣言
     *
     * @return security_declaration - 安全宣言
     */
    public String getSecurityDeclaration() {
        return securityDeclaration;
    }

    /**
     * 设置安全宣言
     *
     * @param securityDeclaration 安全宣言
     */
    public void setSecurityDeclaration(String securityDeclaration) {
        this.securityDeclaration = securityDeclaration;
    }

    /**
     * 获取票数
     *
     * @return count - 票数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置票数
     *
     * @param count 票数
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}