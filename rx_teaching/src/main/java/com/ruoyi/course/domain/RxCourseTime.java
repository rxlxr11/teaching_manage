package com.ruoyi.course.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程时间对象 rx_course_time
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public class RxCourseTime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private String id;

    /** 课程id */
    @Excel(name = "课程id")
    private String courseId;

    /** 课程学年 */
    @Excel(name = "课程学年")
    private Long acaYear;

    /** 课程开始周 */
    @Excel(name = "课程开始周")
    private Long startWeek;

    /** 课程结束周 */
    @Excel(name = "课程结束周")
    private Long endWeek;

    /** 0无1单2双 */
    @Excel(name = "0无1单2双")
    private Long special;

    /** 课程周几 */
    @Excel(name = "课程周几")
    private Long weekday;

    /** 课程开始节 */
    @Excel(name = "课程开始节")
    private Long start;

    /** 课程结束节 */
    @Excel(name = "课程结束节")
    private Long end;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
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
    public void setSpecial(Long special) 
    {
        this.special = special;
    }

    public Long getSpecial() 
    {
        return special;
    }
    public void setWeekday(Long weekday) 
    {
        this.weekday = weekday;
    }

    public Long getWeekday() 
    {
        return weekday;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("courseId", getCourseId())
            .append("acaYear", getAcaYear())
            .append("startWeek", getStartWeek())
            .append("endWeek", getEndWeek())
            .append("special", getSpecial())
            .append("weekday", getWeekday())
            .append("start", getStart())
            .append("end", getEnd())
            .toString();
    }
}
