package com.ruoyi.course.mapper;

import java.util.List;
import com.ruoyi.course.domain.RxSelectCourse;

/**
 * 已选课程Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public interface RxSelectCourseMapper 
{
    /**
     * 查询已选课程
     * 
     * @param id 已选课程主键
     * @return 已选课程
     */
    public RxSelectCourse selectRxSelectCourseById(String id);

    /**
     * 查询已选课程列表
     * 
     * @param rxSelectCourse 已选课程
     * @return 已选课程集合
     */
    public List<RxSelectCourse> selectRxSelectCourseList(RxSelectCourse rxSelectCourse);

    /**
     * 新增已选课程
     * 
     * @param rxSelectCourse 已选课程
     * @return 结果
     */
    public int insertRxSelectCourse(RxSelectCourse rxSelectCourse);

    /**
     * 修改已选课程
     * 
     * @param rxSelectCourse 已选课程
     * @return 结果
     */
    public int updateRxSelectCourse(RxSelectCourse rxSelectCourse);

    /**
     * 删除已选课程
     * 
     * @param id 已选课程主键
     * @return 结果
     */
    public int deleteRxSelectCourseById(String id);

    /**
     * 批量删除已选课程
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRxSelectCourseByIds(String[] ids);
}
