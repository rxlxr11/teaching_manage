package com.ruoyi.course.service;

import java.util.List;
import com.ruoyi.course.domain.RxCourse2;

/**
 * 自主选课Service接口
 * 
 * @author rxlxr
 * @date 2024-01-11
 */
public interface IRxCourse2Service 
{
    /**
     * 查询自主选课
     * 
     * @param id 自主选课主键
     * @return 自主选课
     */
    public RxCourse2 selectRxCourse2ById(Long id);

    /**
     * 查询自主选课列表
     * 
     * @param rxCourse2 自主选课
     * @return 自主选课集合
     */
    public List<RxCourse2> selectRxCourse2List(RxCourse2 rxCourse2);

    /**
     * 新增自主选课
     * 
     * @param rxCourse2 自主选课
     * @return 结果
     */
    public int insertRxCourse2(RxCourse2 rxCourse2);

    /**
     * 修改自主选课
     * 
     * @param rxCourse2 自主选课
     * @return 结果
     */
    public int updateRxCourse2(RxCourse2 rxCourse2);

    /**
     * 批量删除自主选课
     * 
     * @param ids 需要删除的自主选课主键集合
     * @return 结果
     */
    public int deleteRxCourse2ByIds(Long[] ids);

    /**
     * 删除自主选课信息
     * 
     * @param id 自主选课主键
     * @return 结果
     */
    public int deleteRxCourse2ById(Long id);
}
