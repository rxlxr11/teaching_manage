package com.ruoyi.info.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 成绩查询对象 stu_grade
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public class StuGrade extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生编号 */
    @Excel(name = "学生编号")
    private String stuId;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String stuName;

    /** 课程编号 */
    @Excel(name = "课程编号")
    private String courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程类型 */
    @Excel(name = "课程类型")
    private Long type;

    /** 课程学分 */
    @Excel(name = "课程学分")
    private BigDecimal credit;

    /** 课程学年 */
    @Excel(name = "课程学年")
    private Long acaYear;

    /** 总成绩 */
    @Excel(name = "总成绩")
    private BigDecimal grade;

    /** 绩点 */
    @Excel(name = "绩点")
    private BigDecimal gpa;

    /** 状态 */
    @Excel(name = "状态")
    private String state;

    public void setStuId(String stuId) 
    {
        this.stuId = stuId;
    }

    public String getStuId() 
    {
        return stuId;
    }
    public void setStuName(String stuName) 
    {
        this.stuName = stuName;
    }

    public String getStuName() 
    {
        return stuName;
    }
    public void setCourseId(String courseId) 
    {
        this.courseId = courseId;
    }

    public String getCourseId() 
    {
        return courseId;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setCredit(BigDecimal credit) 
    {
        this.credit = credit;
    }

    public BigDecimal getCredit() 
    {
        return credit;
    }
    public void setAcaYear(Long acaYear) 
    {
        this.acaYear = acaYear;
    }

    public Long getAcaYear() 
    {
        return acaYear;
    }
    public void setGrade(BigDecimal grade) 
    {
        this.grade = grade;
    }

    public BigDecimal getGrade() 
    {
        return grade;
    }
    public void setGpa(BigDecimal gpa) 
    {
        this.gpa = gpa;
    }

    public BigDecimal getGpa() 
    {
        return gpa;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stuId", getStuId())
            .append("stuName", getStuName())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("type", getType())
            .append("credit", getCredit())
            .append("acaYear", getAcaYear())
            .append("grade", getGrade())
            .append("gpa", getGpa())
            .append("state", getState())
            .toString();
    }
}
