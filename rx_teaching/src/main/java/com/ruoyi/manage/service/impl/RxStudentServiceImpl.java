package com.ruoyi.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.RxStudentMapper;
import com.ruoyi.manage.domain.RxStudent;
import com.ruoyi.manage.service.IRxStudentService;

/**
 * 学生管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
@Service
public class RxStudentServiceImpl implements IRxStudentService 
{
    @Autowired
    private RxStudentMapper rxStudentMapper;

    /**
     * 查询学生管理
     * 
     * @param id 学生管理主键
     * @return 学生管理
     */
    @Override
    public RxStudent selectRxStudentById(Long id)
    {
        return rxStudentMapper.selectRxStudentById(id);
    }

    /**
     * 查询学生管理列表
     * 
     * @param rxStudent 学生管理
     * @return 学生管理
     */
    @Override
    public List<RxStudent> selectRxStudentList(RxStudent rxStudent)
    {
        return rxStudentMapper.selectRxStudentList(rxStudent);
    }

    /**
     * 新增学生管理
     * 
     * @param rxStudent 学生管理
     * @return 结果
     */
    @Override
    public int insertRxStudent(RxStudent rxStudent)
    {
        return rxStudentMapper.insertRxStudent(rxStudent);
    }

    /**
     * 修改学生管理
     * 
     * @param rxStudent 学生管理
     * @return 结果
     */
    @Override
    public int updateRxStudent(RxStudent rxStudent)
    {
        return rxStudentMapper.updateRxStudent(rxStudent);
    }

    /**
     * 批量删除学生管理
     * 
     * @param ids 需要删除的学生管理主键
     * @return 结果
     */
    @Override
    public int deleteRxStudentByIds(Long[] ids)
    {
        return rxStudentMapper.deleteRxStudentByIds(ids);
    }

    /**
     * 删除学生管理信息
     * 
     * @param id 学生管理主键
     * @return 结果
     */
    @Override
    public int deleteRxStudentById(Long id)
    {
        return rxStudentMapper.deleteRxStudentById(id);
    }
}
