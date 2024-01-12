package com.ruoyi.course.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.course.mapper.RxCourseMapper;
import com.ruoyi.course.domain.RxCourse;
import com.ruoyi.course.service.IRxCourseService;

/**
 * 教授课程Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@Service
public class RxCourseServiceImpl implements IRxCourseService 
{
    @Autowired
    private RxCourseMapper rxCourseMapper;

    /**
     * 查询教授课程
     * 
     * @param id 教授课程主键
     * @return 教授课程
     */
    @Override
    public RxCourse selectRxCourseById(Long id)
    {
        return rxCourseMapper.selectRxCourseById(id);
    }

    /**
     * 查询教授课程列表
     * 
     * @param rxCourse 教授课程
     * @return 教授课程
     */
    @Override
    public List<RxCourse> selectRxCourseList(RxCourse rxCourse)
    {
        return rxCourseMapper.selectRxCourseList(rxCourse);
    }

    /**
     * 新增教授课程
     * 
     * @param rxCourse 教授课程
     * @return 结果
     */
    @Override
    public int insertRxCourse(RxCourse rxCourse)
    {
        return rxCourseMapper.insertRxCourse(rxCourse);
    }

    /**
     * 修改教授课程
     * 
     * @param rxCourse 教授课程
     * @return 结果
     */
    @Override
    public int updateRxCourse(RxCourse rxCourse)
    {
        return rxCourseMapper.updateRxCourse(rxCourse);
    }

    /**
     * 批量删除教授课程
     * 
     * @param ids 需要删除的教授课程主键
     * @return 结果
     */
    @Override
    public int deleteRxCourseByIds(Long[] ids)
    {
        return rxCourseMapper.deleteRxCourseByIds(ids);
    }

    /**
     * 删除教授课程信息
     * 
     * @param id 教授课程主键
     * @return 结果
     */
    @Override
    public int deleteRxCourseById(Long id)
    {
        return rxCourseMapper.deleteRxCourseById(id);
    }
}
