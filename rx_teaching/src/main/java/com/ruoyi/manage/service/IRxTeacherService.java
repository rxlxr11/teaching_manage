package com.ruoyi.manage.service;

import java.util.List;
import com.ruoyi.manage.domain.RxTeacher;

/**
 * 教师管理Service接口
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
public interface IRxTeacherService 
{
    /**
     * 查询教师管理
     * 
     * @param id 教师管理主键
     * @return 教师管理
     */
    public RxTeacher selectRxTeacherById(Long id);

    /**
     * 查询教师管理列表
     * 
     * @param rxTeacher 教师管理
     * @return 教师管理集合
     */
    public List<RxTeacher> selectRxTeacherList(RxTeacher rxTeacher);

    /**
     * 新增教师管理
     * 
     * @param rxTeacher 教师管理
     * @return 结果
     */
    public int insertRxTeacher(RxTeacher rxTeacher);

    /**
     * 修改教师管理
     * 
     * @param rxTeacher 教师管理
     * @return 结果
     */
    public int updateRxTeacher(RxTeacher rxTeacher);

    /**
     * 批量删除教师管理
     * 
     * @param ids 需要删除的教师管理主键集合
     * @return 结果
     */
    public int deleteRxTeacherByIds(Long[] ids);

    /**
     * 删除教师管理信息
     * 
     * @param id 教师管理主键
     * @return 结果
     */
    public int deleteRxTeacherById(Long id);
}
