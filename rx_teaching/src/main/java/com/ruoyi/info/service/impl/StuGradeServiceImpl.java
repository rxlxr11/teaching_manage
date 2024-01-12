package com.ruoyi.info.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.info.mapper.StuGradeMapper;
import com.ruoyi.info.domain.StuGrade;
import com.ruoyi.info.service.IStuGradeService;

/**
 * 成绩查询Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@Service
public class StuGradeServiceImpl implements IStuGradeService 
{
    @Autowired
    private StuGradeMapper stuGradeMapper;

    /**
     * 查询成绩查询
     * 
     * @param stuId 成绩查询主键
     * @return 成绩查询
     */
    @Override
    public StuGrade selectStuGradeByStuId(String stuId)
    {
        return stuGradeMapper.selectStuGradeByStuId(stuId);
    }

    /**
     * 查询成绩查询列表
     * 
     * @param stuGrade 成绩查询
     * @return 成绩查询
     */
    @Override
    public List<StuGrade> selectStuGradeList(StuGrade stuGrade)
    {
        return stuGradeMapper.selectStuGradeList(stuGrade);
    }

    /**
     * 新增成绩查询
     * 
     * @param stuGrade 成绩查询
     * @return 结果
     */
    @Override
    public int insertStuGrade(StuGrade stuGrade)
    {
        return stuGradeMapper.insertStuGrade(stuGrade);
    }

    /**
     * 修改成绩查询
     * 
     * @param stuGrade 成绩查询
     * @return 结果
     */
    @Override
    public int updateStuGrade(StuGrade stuGrade)
    {
        return stuGradeMapper.updateStuGrade(stuGrade);
    }

    /**
     * 批量删除成绩查询
     * 
     * @param stuIds 需要删除的成绩查询主键
     * @return 结果
     */
    @Override
    public int deleteStuGradeByStuIds(String[] stuIds)
    {
        return stuGradeMapper.deleteStuGradeByStuIds(stuIds);
    }

    /**
     * 删除成绩查询信息
     * 
     * @param stuId 成绩查询主键
     * @return 结果
     */
    @Override
    public int deleteStuGradeByStuId(String stuId)
    {
        return stuGradeMapper.deleteStuGradeByStuId(stuId);
    }
}
