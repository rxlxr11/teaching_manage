package com.ruoyi.course.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.course.mapper.RxCourse2Mapper;
import com.ruoyi.course.domain.RxCourse2;
import com.ruoyi.course.service.IRxCourse2Service;

/**
 * 自主选课Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-11
 */
@Service
public class RxCourse2ServiceImpl implements IRxCourse2Service 
{
    @Autowired
    private RxCourse2Mapper rxCourse2Mapper;

    /**
     * 查询自主选课
     * 
     * @param id 自主选课主键
     * @return 自主选课
     */
    @Override
    public RxCourse2 selectRxCourse2ById(Long id)
    {
        return rxCourse2Mapper.selectRxCourse2ById(id);
    }

    /**
     * 查询自主选课列表
     * 
     * @param rxCourse2 自主选课
     * @return 自主选课
     */
    @Override
    public List<RxCourse2> selectRxCourse2List(RxCourse2 rxCourse2)
    {
        return rxCourse2Mapper.selectRxCourse2List(rxCourse2);
    }

    /**
     * 新增自主选课
     * 
     * @param rxCourse2 自主选课
     * @return 结果
     */
    @Override
    public int insertRxCourse2(RxCourse2 rxCourse2)
    {
        return rxCourse2Mapper.insertRxCourse2(rxCourse2);
    }

    /**
     * 修改自主选课
     * 
     * @param rxCourse2 自主选课
     * @return 结果
     */
    @Override
    public int updateRxCourse2(RxCourse2 rxCourse2)
    {
        return rxCourse2Mapper.updateRxCourse2(rxCourse2);
    }

    /**
     * 批量删除自主选课
     * 
     * @param ids 需要删除的自主选课主键
     * @return 结果
     */
    @Override
    public int deleteRxCourse2ByIds(Long[] ids)
    {
        return rxCourse2Mapper.deleteRxCourse2ByIds(ids);
    }

    /**
     * 删除自主选课信息
     * 
     * @param id 自主选课主键
     * @return 结果
     */
    @Override
    public int deleteRxCourse2ById(Long id)
    {
        return rxCourse2Mapper.deleteRxCourse2ById(id);
    }
}
