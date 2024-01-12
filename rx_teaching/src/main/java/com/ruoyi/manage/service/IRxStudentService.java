package com.ruoyi.manage.service;

import java.util.List;
import com.ruoyi.manage.domain.RxStudent;

/**
 * 学生管理Service接口
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
public interface IRxStudentService 
{
    /**
     * 查询学生管理
     * 
     * @param id 学生管理主键
     * @return 学生管理
     */
    public RxStudent selectRxStudentById(Long id);

    /**
     * 查询学生管理列表
     * 
     * @param rxStudent 学生管理
     * @return 学生管理集合
     */
    public List<RxStudent> selectRxStudentList(RxStudent rxStudent);

    /**
     * 新增学生管理
     * 
     * @param rxStudent 学生管理
     * @return 结果
     */
    public int insertRxStudent(RxStudent rxStudent);

    /**
     * 修改学生管理
     * 
     * @param rxStudent 学生管理
     * @return 结果
     */
    public int updateRxStudent(RxStudent rxStudent);

    /**
     * 批量删除学生管理
     * 
     * @param ids 需要删除的学生管理主键集合
     * @return 结果
     */
    public int deleteRxStudentByIds(Long[] ids);

    /**
     * 删除学生管理信息
     * 
     * @param id 学生管理主键
     * @return 结果
     */
    public int deleteRxStudentById(Long id);
}
