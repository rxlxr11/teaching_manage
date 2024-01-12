package com.ruoyi.manage.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学院管理对象 rx_college
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
public class RxCollege extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 学院编号 */
    @Excel(name = "学院编号")
    private String collegeId;

    /** 学院名称 */
    @Excel(name = "学院名称")
    private String name;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCollegeId(String collegeId) 
    {
        this.collegeId = collegeId;
    }

    public String getCollegeId() 
    {
        return collegeId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("collegeId", getCollegeId())
            .append("name", getName())
            .toString();
    }
}
