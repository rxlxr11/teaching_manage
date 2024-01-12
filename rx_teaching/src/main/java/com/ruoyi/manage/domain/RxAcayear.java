package com.ruoyi.manage.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学年管理对象 rx_acayear
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
public class RxAcayear extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学年id */
    private Long yearId;

    /** 学年名称 */
    @Excel(name = "学年名称")
    private String name;

    /** 学年开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "学年开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 学年结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "学年结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public void setYearId(Long yearId) 
    {
        this.yearId = yearId;
    }

    public Long getYearId() 
    {
        return yearId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("yearId", getYearId())
            .append("name", getName())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}
