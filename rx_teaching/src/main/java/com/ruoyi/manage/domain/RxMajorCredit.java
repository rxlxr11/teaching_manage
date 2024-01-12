package com.ruoyi.manage.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 专业学分管理对象 rx_major_credit
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
public class RxMajorCredit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 专业编号 */
    @Excel(name = "专业编号")
    private String majorId;

    /** 通识学分 */
    @Excel(name = "通识学分")
    private BigDecimal compulsoryGeneraleduCredit;

    /** 专业基础必修 */
    @Excel(name = "专业基础必修")
    private BigDecimal compulsoryMajorbasicCredit;

    /** 专业方向必修 */
    @Excel(name = "专业方向必修")
    private BigDecimal compulsoryMajordirectCredit;

    /** 实践实验必修 */
    @Excel(name = "实践实验必修")
    private BigDecimal compulsoryPracticeCredit;

    /** 通识选修 */
    @Excel(name = "通识选修")
    private BigDecimal electiveGeneraleduCredit;

    /** 专业基础选修 */
    @Excel(name = "专业基础选修")
    private BigDecimal electiveMajorbasicCredit;

    /** 专业方向选修 */
    @Excel(name = "专业方向选修")
    private BigDecimal electiveMajordirectCredit;

    /** 实践选修 */
    @Excel(name = "实践选修")
    private BigDecimal electivePracticeCredit;

    /** 校选 */
    @Excel(name = "校选")
    private BigDecimal electiveSchoolCredit;

    /** 自主研学 */
    @Excel(name = "自主研学")
    private BigDecimal independentStudyCredit;

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
    public void setCompulsoryGeneraleduCredit(BigDecimal compulsoryGeneraleduCredit) 
    {
        this.compulsoryGeneraleduCredit = compulsoryGeneraleduCredit;
    }

    public BigDecimal getCompulsoryGeneraleduCredit() 
    {
        return compulsoryGeneraleduCredit;
    }
    public void setCompulsoryMajorbasicCredit(BigDecimal compulsoryMajorbasicCredit) 
    {
        this.compulsoryMajorbasicCredit = compulsoryMajorbasicCredit;
    }

    public BigDecimal getCompulsoryMajorbasicCredit() 
    {
        return compulsoryMajorbasicCredit;
    }
    public void setCompulsoryMajordirectCredit(BigDecimal compulsoryMajordirectCredit) 
    {
        this.compulsoryMajordirectCredit = compulsoryMajordirectCredit;
    }

    public BigDecimal getCompulsoryMajordirectCredit() 
    {
        return compulsoryMajordirectCredit;
    }
    public void setCompulsoryPracticeCredit(BigDecimal compulsoryPracticeCredit) 
    {
        this.compulsoryPracticeCredit = compulsoryPracticeCredit;
    }

    public BigDecimal getCompulsoryPracticeCredit() 
    {
        return compulsoryPracticeCredit;
    }
    public void setElectiveGeneraleduCredit(BigDecimal electiveGeneraleduCredit) 
    {
        this.electiveGeneraleduCredit = electiveGeneraleduCredit;
    }

    public BigDecimal getElectiveGeneraleduCredit() 
    {
        return electiveGeneraleduCredit;
    }
    public void setElectiveMajorbasicCredit(BigDecimal electiveMajorbasicCredit) 
    {
        this.electiveMajorbasicCredit = electiveMajorbasicCredit;
    }

    public BigDecimal getElectiveMajorbasicCredit() 
    {
        return electiveMajorbasicCredit;
    }
    public void setElectiveMajordirectCredit(BigDecimal electiveMajordirectCredit) 
    {
        this.electiveMajordirectCredit = electiveMajordirectCredit;
    }

    public BigDecimal getElectiveMajordirectCredit() 
    {
        return electiveMajordirectCredit;
    }
    public void setElectivePracticeCredit(BigDecimal electivePracticeCredit) 
    {
        this.electivePracticeCredit = electivePracticeCredit;
    }

    public BigDecimal getElectivePracticeCredit() 
    {
        return electivePracticeCredit;
    }
    public void setElectiveSchoolCredit(BigDecimal electiveSchoolCredit) 
    {
        this.electiveSchoolCredit = electiveSchoolCredit;
    }

    public BigDecimal getElectiveSchoolCredit() 
    {
        return electiveSchoolCredit;
    }
    public void setIndependentStudyCredit(BigDecimal independentStudyCredit) 
    {
        this.independentStudyCredit = independentStudyCredit;
    }

    public BigDecimal getIndependentStudyCredit() 
    {
        return independentStudyCredit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("majorId", getMajorId())
            .append("compulsoryGeneraleduCredit", getCompulsoryGeneraleduCredit())
            .append("compulsoryMajorbasicCredit", getCompulsoryMajorbasicCredit())
            .append("compulsoryMajordirectCredit", getCompulsoryMajordirectCredit())
            .append("compulsoryPracticeCredit", getCompulsoryPracticeCredit())
            .append("electiveGeneraleduCredit", getElectiveGeneraleduCredit())
            .append("electiveMajorbasicCredit", getElectiveMajorbasicCredit())
            .append("electiveMajordirectCredit", getElectiveMajordirectCredit())
            .append("electivePracticeCredit", getElectivePracticeCredit())
            .append("electiveSchoolCredit", getElectiveSchoolCredit())
            .append("independentStudyCredit", getIndependentStudyCredit())
            .toString();
    }
}
