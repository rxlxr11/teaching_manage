package com.ruoyi.manage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 专业管理对象 rx_major
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
public class RxMajor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 专业编号 */
    @Excel(name = "专业编号")
    private String majorId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String name;

    /** 专业所属学院 */
    @Excel(name = "专业所属学院")
    private String collegeId;

    /** 专业等级 */
    @Excel(name = "专业等级")
    private String level;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMajorId(String majorId) 
    {
        this.majorId = majorId;
    }

    public String getMajorId() 
    {
        return majorId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCollegeId(String collegeId) 
    {
        this.collegeId = collegeId;
    }

    public String getCollegeId() 
    {
        return collegeId;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("majorId", getMajorId())
            .append("name", getName())
            .append("collegeId", getCollegeId())
            .append("level", getLevel())
            .toString();
    }
}
