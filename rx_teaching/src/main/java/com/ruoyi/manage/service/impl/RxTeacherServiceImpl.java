package com.ruoyi.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.RxTeacherMapper;
import com.ruoyi.manage.domain.RxTeacher;
import com.ruoyi.manage.service.IRxTeacherService;

/**
 * 教师管理Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
@Service
public class RxTeacherServiceImpl implements IRxTeacherService 
{
    @Autowired
    private RxTeacherMapper rxTeacherMapper;

    /**
     * 查询教师管理
     * 
     * @param id 教师管理主键
     * @return 教师管理
     */
    @Override
    public RxTeacher selectRxTeacherById(Long id)
    {
        return rxTeacherMapper.selectRxTeacherById(id);
    }

    /**
     * 查询教师管理列表
     * 
     * @param rxTeacher 教师管理
     * @return 教师管理
     */
    @Override
    public List<RxTeacher> selectRxTeacherList(RxTeacher rxTeacher)
    {
        return rxTeacherMapper.selectRxTeacherList(rxTeacher);
    }

    /**
     * 新增教师管理
     * 
     * @param rxTeacher 教师管理
     * @return 结果
     */
    @Override
    public int insertRxTeacher(RxTeacher rxTeacher)
    {
        return rxTeacherMapper.insertRxTeacher(rxTeacher);
    }

    /**
     * 修改教师管理
     * 
     * @param rxTeacher 教师管理
     * @return 结果
     */
    @Override
    public int updateRxTeacher(RxTeacher rxTeacher)
    {
        return rxTeacherMapper.updateRxTeacher(rxTeacher);
    }

    /**
     * 批量删除教师管理
     * 
     * @param ids 需要删除的教师管理主键
     * @return 结果
     */
    @Override
    public int deleteRxTeacherByIds(Long[] ids)
    {
        return rxTeacherMapper.deleteRxTeacherByIds(ids);
    }

    /**
     * 删除教师管理信息
     * 
     * @param id 教师管理主键
     * @return 结果
     */
    @Override
    public int deleteRxTeacherById(Long id)
    {
        return rxTeacherMapper.deleteRxTeacherById(id);
    }
}
