package com.ruoyi.course.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教授课程对象 rx_course
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public class RxCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 课程编号 */
    @Excel(name = "课程编号")
    private String courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String name;

    /** 教师编号 */
    @Excel(name = "教师编号")
    private String teacherId;

    /** 课程类型 */
    @Excel(name = "课程类型")
    private Long type;

    /** 数量 */
    @Excel(name = "数量")
    private String quantity;

    /** 课程学分 */
    @Excel(name = "课程学分")
    private BigDecimal credit;

    /** 最大容量 */
    @Excel(name = "最大容量")
    private Long max;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCourseId(String courseId) 
    {
        this.courseId = courseId;
    }

    public String getCourseId() 
    {
        return courseId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setTeacherId(String teacherId) 
    {
        this.teacherId = teacherId;
    }

    public String getTeacherId() 
    {
        return teacherId;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setQuantity(String quantity) 
    {
        this.quantity = quantity;
    }

    public String getQuantity() 
    {
        return quantity;
    }
    public void setCredit(BigDecimal credit) 
    {
        this.credit = credit;
    }

    public BigDecimal getCredit() 
    {
        return credit;
    }
    public void setMax(Long max) 
    {
        this.max = max;
    }

    public Long getMax() 
    {
        return max;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("courseId", getCourseId())
            .append("name", getName())
            .append("teacherId", getTeacherId())
            .append("type", getType())
            .append("quantity", getQuantity())
            .append("credit", getCredit())
            .append("max", getMax())
            .toString();
    }
}
