package com.ruoyi.course.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.course.mapper.RxCourseTimeMapper;
import com.ruoyi.course.domain.RxCourseTime;
import com.ruoyi.course.service.IRxCourseTimeService;

/**
 * 课程时间Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@Service
public class RxCourseTimeServiceImpl implements IRxCourseTimeService 
{
    @Autowired
    private RxCourseTimeMapper rxCourseTimeMapper;

    /**
     * 查询课程时间
     * 
     * @param id 课程时间主键
     * @return 课程时间
     */
    @Override
    public RxCourseTime selectRxCourseTimeById(String id)
    {
        return rxCourseTimeMapper.selectRxCourseTimeById(id);
    }

    /**
     * 查询课程时间列表
     * 
     * @param rxCourseTime 课程时间
     * @return 课程时间
     */
    @Override
    public List<RxCourseTime> selectRxCourseTimeList(RxCourseTime rxCourseTime)
    {
        return rxCourseTimeMapper.selectRxCourseTimeList(rxCourseTime);
    }

    /**
     * 新增课程时间
     * 
     * @param rxCourseTime 课程时间
     * @return 结果
     */
    @Override
    public int insertRxCourseTime(RxCourseTime rxCourseTime)
    {
        return rxCourseTimeMapper.insertRxCourseTime(rxCourseTime);
    }

    /**
     * 修改课程时间
     * 
     * @param rxCourseTime 课程时间
     * @return 结果
     */
    @Override
    public int updateRxCourseTime(RxCourseTime rxCourseTime)
    {
        return rxCourseTimeMapper.updateRxCourseTime(rxCourseTime);
    }

    /**
     * 批量删除课程时间
     * 
     * @param ids 需要删除的课程时间主键
     * @return 结果
     */
    @Override
    public int deleteRxCourseTimeByIds(String[] ids)
    {
        return rxCourseTimeMapper.deleteRxCourseTimeByIds(ids);
    }

    /**
     * 删除课程时间信息
     * 
     * @param id 课程时间主键
     * @return 结果
     */
    @Override
    public int deleteRxCourseTimeById(String id)
    {
        return rxCourseTimeMapper.deleteRxCourseTimeById(id);
    }
}
