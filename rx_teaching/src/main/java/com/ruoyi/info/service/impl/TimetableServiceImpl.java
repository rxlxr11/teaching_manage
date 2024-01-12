package com.ruoyi.info.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.info.mapper.TimetableMapper;
import com.ruoyi.info.domain.Timetable;
import com.ruoyi.info.service.ITimetableService;

/**
 * 课程表Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@Service
public class TimetableServiceImpl implements ITimetableService 
{
    @Autowired
    private TimetableMapper timetableMapper;

    /**
     * 查询课程表
     * 
     * @param stuId 课程表主键
     * @return 课程表
     */
    @Override
    public Timetable selectTimetableByStuId(String stuId)
    {
        return timetableMapper.selectTimetableByStuId(stuId);
    }

    /**
     * 查询课程表列表
     * 
     * @param timetable 课程表
     * @return 课程表
     */
    @Override
    public List<Timetable> selectTimetableList(Timetable timetable)
    {
        return timetableMapper.selectTimetableList(timetable);
    }

    /**
     * 新增课程表
     * 
     * @param timetable 课程表
     * @return 结果
     */
    @Override
    public int insertTimetable(Timetable timetable)
    {
        return timetableMapper.insertTimetable(timetable);
    }

    /**
     * 修改课程表
     * 
     * @param timetable 课程表
     * @return 结果
     */
    @Override
    public int updateTimetable(Timetable timetable)
    {
        return timetableMapper.updateTimetable(timetable);
    }

    /**
     * 批量删除课程表
     * 
     * @param stuIds 需要删除的课程表主键
     * @return 结果
     */
    @Override
    public int deleteTimetableByStuIds(String[] stuIds)
    {
        return timetableMapper.deleteTimetableByStuIds(stuIds);
    }

    /**
     * 删除课程表信息
     * 
     * @param stuId 课程表主键
     * @return 结果
     */
    @Override
    public int deleteTimetableByStuId(String stuId)
    {
        return timetableMapper.deleteTimetableByStuId(stuId);
    }
}
