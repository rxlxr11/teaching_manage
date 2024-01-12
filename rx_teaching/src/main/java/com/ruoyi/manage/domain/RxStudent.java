package com.ruoyi.manage.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生管理对象 rx_student
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
public class RxStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 学生编号 */
    @Excel(name = "学生编号")
    private String stuId;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String name;

    /** 学生年龄 */
    @Excel(name = "学生年龄")
    private Long age;

    /** 学生性别 */
    @Excel(name = "学生性别")
    private Long gender;

    /** 学生籍贯 */
    @Excel(name = "学生籍贯")
    private String born;

    /** 学生班级 */
    @Excel(name = "学生班级")
    private String classname;

    /** 学生绩点 */
    @Excel(name = "学生绩点")
    private BigDecimal gpa;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
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
    public void setClassname(String classname) 
    {
        this.classname = classname;
    }

    public String getClassname() 
    {
        return classname;
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
            .append("name", getName())
            .append("age", getAge())
            .append("gender", getGender())
            .append("born", getBorn())
            .append("classname", getClassname())
            .append("gpa", getGpa())
            .toString();
    }
}
