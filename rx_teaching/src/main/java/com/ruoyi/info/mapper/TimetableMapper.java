package com.ruoyi.info.mapper;

import java.util.List;
import com.ruoyi.info.domain.Timetable;

/**
 * 课程表Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public interface TimetableMapper 
{
    /**
     * 查询课程表
     * 
     * @param stuId 课程表主键
     * @return 课程表
     */
    public Timetable selectTimetableByStuId(String stuId);

    /**
     * 查询课程表列表
     * 
     * @param timetable 课程表
     * @return 课程表集合
     */
    public List<Timetable> selectTimetableList(Timetable timetable);

    /**
     * 新增课程表
     * 
     * @param timetable 课程表
     * @return 结果
     */
    public int insertTimetable(Timetable timetable);

    /**
     * 修改课程表
     * 
     * @param timetable 课程表
     * @return 结果
     */
    public int updateTimetable(Timetable timetable);

    /**
     * 删除课程表
     * 
     * @param stuId 课程表主键
     * @return 结果
     */
    public int deleteTimetableByStuId(String stuId);

    /**
     * 批量删除课程表
     * 
     * @param stuIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTimetableByStuIds(String[] stuIds);
}
