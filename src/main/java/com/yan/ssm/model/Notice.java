package com.yan.ssm.model;

import java.util.Date;

public class Notice {
    private Long id;

    private String categoryName;

    private String categoryAlias;

    private String categoryFname;

    private String keywords;

    private String description;

    private Date createTime;

    private Date modifiedTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryAlias() {
        return categoryAlias;
    }

    public void setCategoryAlias(String categoryAlias) {
        this.categoryAlias = categoryAlias == null ? null : categoryAlias.trim();
    }

    public String getCategoryFname() {
        return categoryFname;
    }

    public void setCategoryFname(String categoryFname) {
        this.categoryFname = categoryFname == null ? null : categoryFname.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

}