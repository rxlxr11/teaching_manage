package com.ruoyi.manage.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教师管理对象 rx_teacher
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
public class RxTeacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 教师编号 */
    @Excel(name = "教师编号")
    private String teacherId;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String name;

    /** 教师年龄 */
    @Excel(name = "教师年龄")
    private Long age;

    /** 教师性别 */
    @Excel(name = "教师性别")
    private Long gender;

    /** 教师籍贯 */
    @Excel(name = "教师籍贯")
    private String born;

    /** 教师薪水 */
    @Excel(name = "教师薪水")
    private BigDecimal salary;

    /** 教师学院 */
    @Excel(name = "教师学院")
    private String collegeId;

    /** 职位 */
    @Excel(name = "职位")
    private String position;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTeacherId(String teacherId) 
    {
        this.teacherId = teacherId;
    }

    public String getTeacherId() 
    {
        return teacherId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setGender(Long gender) 
    {
        this.gender = gender;
    }

    public Long getGender() 
    {
        return gender;
    }
    public void setBorn(String born) 
    {
        this.born = born;
    }

    public String getBorn() 
    {
        return born;
    }
    public void setSalary(BigDecimal salary) 
    {
        this.salary = salary;
    }

    public BigDecimal getSalary() 
    {
        return salary;
    }
    public void setCollegeId(String collegeId) 
    {
        this.collegeId = collegeId;
    }

    public String getCollegeId() 
    {
        return collegeId;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("teacherId", getTeacherId())
            .append("name", getName())
            .append("age", getAge())
            .append("gender", getGender())
            .append("born", getBorn())
            .append("salary", getSalary())
            .append("collegeId", getCollegeId())
            .append("position", getPosition())
            .toString();
    }
}
