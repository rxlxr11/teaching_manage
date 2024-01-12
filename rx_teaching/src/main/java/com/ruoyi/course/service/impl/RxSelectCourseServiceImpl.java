package com.ruoyi.course.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.course.mapper.RxSelectCourseMapper;
import com.ruoyi.course.domain.RxSelectCourse;
import com.ruoyi.course.service.IRxSelectCourseService;

/**
 * 已选课程Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@Service
public class RxSelectCourseServiceImpl implements IRxSelectCourseService 
{
    @Autowired
    private RxSelectCourseMapper rxSelectCourseMapper;

    /**
     * 查询已选课程
     * 
     * @param id 已选课程主键
     * @return 已选课程
     */
    @Override
    public RxSelectCourse selectRxSelectCourseById(String id)
    {
        return rxSelectCourseMapper.selectRxSelectCourseById(id);
    }

    /**
     * 查询已选课程列表
     * 
     * @param rxSelectCourse 已选课程
     * @return 已选课程
     */
    @Override
    public List<RxSelectCourse> selectRxSelectCourseList(RxSelectCourse rxSelectCourse)
    {
        return rxSelectCourseMapper.selectRxSelectCourseList(rxSelectCourse);
    }

    /**
     * 新增已选课程
     * 
     * @param rxSelectCourse 已选课程
     * @return 结果
     */
    @Override
    public int insertRxSelectCourse(RxSelectCourse rxSelectCourse)
    {
        return rxSelectCourseMapper.insertRxSelectCourse(rxSelectCourse);
    }

    /**
     * 修改已选课程
     * 
     * @param rxSelectCourse 已选课程
     * @return 结果
     */
    @Override
    public int updateRxSelectCourse(RxSelectCourse rxSelectCourse)
    {
        return rxSelectCourseMapper.updateRxSelectCourse(rxSelectCourse);
    }

    /**
     * 批量删除已选课程
     * 
     * @param ids 需要删除的已选课程主键
     * @return 结果
     */
    @Override
    public int deleteRxSelectCourseByIds(String[] ids)
    {
        return rxSelectCourseMapper.deleteRxSelectCourseByIds(ids);
    }

    /**
     * 删除已选课程信息
     * 
     * @param id 已选课程主键
     * @return 结果
     */
    @Override
    public int deleteRxSelectCourseById(String id)
    {
        return rxSelectCourseMapper.deleteRxSelectCourseById(id);
    }
}
