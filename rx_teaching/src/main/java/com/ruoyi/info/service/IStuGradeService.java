package com.ruoyi.info.service;

import java.util.List;
import com.ruoyi.info.domain.StuGrade;

/**
 * 成绩查询Service接口
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public interface IStuGradeService 
{
    /**
     * 查询成绩查询
     * 
     * @param stuId 成绩查询主键
     * @return 成绩查询
     */
    public StuGrade selectStuGradeByStuId(String stuId);

    /**
     * 查询成绩查询列表
     * 
     * @param stuGrade 成绩查询
     * @return 成绩查询集合
     */
    public List<StuGrade> selectStuGradeList(StuGrade stuGrade);

    /**
     * 新增成绩查询
     * 
     * @param stuGrade 成绩查询
     * @return 结果
     */
    public int insertStuGrade(StuGrade stuGrade);

    /**
     * 修改成绩查询
     * 
     * @param stuGrade 成绩查询
     * @return 结果
     */
    public int updateStuGrade(StuGrade stuGrade);

    /**
     * 批量删除成绩查询
     * 
     * @param stuIds 需要删除的成绩查询主键集合
     * @return 结果
     */
    public int deleteStuGradeByStuIds(String[] stuIds);

    /**
     * 删除成绩查询信息
     * 
     * @param stuId 成绩查询主键
     * @return 结果
     */
    public int deleteStuGradeByStuId(String stuId);
}
