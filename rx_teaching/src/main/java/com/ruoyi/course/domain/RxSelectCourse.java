package com.ruoyi.course.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 已选课程对象 rx_select_course
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public class RxSelectCourse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 学生id */
    @Excel(name = "学生id")
    private String stuId;

    /** 课程编号 */
    @Excel(name = "课程编号")
    private String courseId;

    /** 平时成绩 */
    @Excel(name = "平时成绩")
    private BigDecimal grade1;

    /** 期末成绩 */
    @Excel(name = "期末成绩")
    private BigDecimal grade2;

    /** 总成绩 */
    @Excel(name = "总成绩")
    private BigDecimal grade3;

    /** 状态 */
    @Excel(name = "状态")
    private Integer state;

    /** 绩点 */
    @Excel(name = "绩点")
    private BigDecimal gpa;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setStuId(String stuId) 
    {
        this.stuId = stuId;
    }

    public String getStuId() 
    {
        return stuId;
    }
    public void setCourseId(String courseId) 
    {
        this.courseId = courseId;
    }

    public String getCourseId() 
    {
        return courseId;
    }
    public void setGrade1(BigDecimal grade1) 
    {
        this.grade1 = grade1;
    }

    public BigDecimal getGrade1() 
    {
        return grade1;
    }
    public void setGrade2(BigDecimal grade2) 
    {
        this.grade2 = grade2;
    }

    public BigDecimal getGrade2() 
    {
        return grade2;
    }
    public void setGrade3(BigDecimal grade3) 
    {
        this.grade3 = grade3;
    }

    public BigDecimal getGrade3() 
    {
        return grade3;
    }
    public void setState(Integer state) 
    {
        this.state = state;
    }

    public Integer getState() 
    {
        return state;
    }
    public void setGpa(BigDecimal gpa) 
    {
        this.gpa = gpa;
    }

    public BigDecimal getGpa() 
    {
        return gpa;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuId", getStuId())
            .append("courseId", getCourseId())
            .append("grade1", getGrade1())
            .append("grade2", getGrade2())
            .append("grade3", getGrade3())
            .append("state", getState())
            .append("gpa", getGpa())
            .toString();
    }
}
