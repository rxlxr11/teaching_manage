package com.ruoyi.info.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程表对象 timetable
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public class Timetable extends BaseEntity
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

    /** 课程学年 */
    @Excel(name = "课程学年")
    private Long acaYear;

    /** 课程开始周 */
    @Excel(name = "课程开始周")
    private Long startWeek;

    /** 课程结束周 */
    @Excel(name = "课程结束周")
    private Long endWeek;

    /** 课程开始节 */
    @Excel(name = "课程开始节")
    private Long start;

    /** 课程结束节 */
    @Excel(name = "课程结束节")
    private Long end;

    /** 课程周几 */
    @Excel(name = "课程周几")
    private Long weekday;

    /** 0无1单2双 */
    @Excel(name = "0无1单2双")
    private Long special;

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
    public void setAcaYear(Long acaYear) 
    {
        this.acaYear = acaYear;
    }

    public Long getAcaYear() 
    {
        return acaYear;
    }
    public void setStartWeek(Long startWeek) 
    {
        this.startWeek = startWeek;
    }

    public Long getStartWeek() 
    {
        return startWeek;
    }
    public void setEndWeek(Long endWeek) 
    {
        this.endWeek = endWeek;
    }

    public Long getEndWeek() 
    {
        return endWeek;
    }
    public void setStart(Long start) 
    {
        this.start = start;
    }

    public Long getStart() 
    {
        return start;
    }
    public void setEnd(Long end) 
    {
        this.end = end;
    }

    public Long getEnd() 
    {
        return end;
    }
    public void setWeekday(Long weekday) 
    {
        this.weekday = weekday;
    }

    public Long getWeekday() 
    {
        return weekday;
    }
    public void setSpecial(Long special) 
    {
        this.special = special;
    }

    public Long getSpecial() 
    {
        return special;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stuId", getStuId())
            .append("stuName", getStuName())
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("acaYear", getAcaYear())
            .append("startWeek", getStartWeek())
            .append("endWeek", getEndWeek())
            .append("start", getStart())
            .append("end", getEnd())
            .append("weekday", getWeekday())
            .append("special", getSpecial())
            .toString();
    }
}
