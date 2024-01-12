package com.ruoyi.course.service;

import java.util.List;
import com.ruoyi.course.domain.RxCourse;

/**
 * 教授课程Service接口
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public interface IRxCourseService 
{
    /**
     * 查询教授课程
     * 
     * @param id 教授课程主键
     * @return 教授课程
     */
    public RxCourse selectRxCourseById(Long id);

    /**
     * 查询教授课程列表
     * 
     * @param rxCourse 教授课程
     * @return 教授课程集合
     */
    public List<RxCourse> selectRxCourseList(RxCourse rxCourse);

    /**
     * 新增教授课程
     * 
     * @param rxCourse 教授课程
     * @return 结果
     */
    public int insertRxCourse(RxCourse rxCourse);

    /**
     * 修改教授课程
     * 
     * @param rxCourse 教授课程
     * @return 结果
     */
    public int updateRxCourse(RxCourse rxCourse);

    /**
     * 批量删除教授课程
     * 
     * @param ids 需要删除的教授课程主键集合
     * @return 结果
     */
    public int deleteRxCourseByIds(Long[] ids);

    /**
     * 删除教授课程信息
     * 
     * @param id 教授课程主键
     * @return 结果
     */
    public int deleteRxCourseById(Long id);
}
