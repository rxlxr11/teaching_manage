package com.ruoyi.course.mapper;

import java.util.List;
import com.ruoyi.course.domain.RxCourseTime;

/**
 * 课程时间Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public interface RxCourseTimeMapper 
{
    /**
     * 查询课程时间
     * 
     * @param id 课程时间主键
     * @return 课程时间
     */
    public RxCourseTime selectRxCourseTimeById(String id);

    /**
     * 查询课程时间列表
     * 
     * @param rxCourseTime 课程时间
     * @return 课程时间集合
     */
    public List<RxCourseTime> selectRxCourseTimeList(RxCourseTime rxCourseTime);

    /**
     * 新增课程时间
     * 
     * @param rxCourseTime 课程时间
     * @return 结果
     */
    public int insertRxCourseTime(RxCourseTime rxCourseTime);

    /**
     * 修改课程时间
     * 
     * @param rxCourseTime 课程时间
     * @return 结果
     */
    public int updateRxCourseTime(RxCourseTime rxCourseTime);

    /**
     * 删除课程时间
     * 
     * @param id 课程时间主键
     * @return 结果
     */
    public int deleteRxCourseTimeById(String id);

    /**
     * 批量删除课程时间
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRxCourseTimeByIds(String[] ids);
}
