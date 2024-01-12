package com.ruoyi.info.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.info.mapper.RxStuCreditMapper;
import com.ruoyi.info.domain.RxStuCredit;
import com.ruoyi.info.service.IRxStuCreditService;

/**
 * 学业情况查询Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@Service
public class RxStuCreditServiceImpl implements IRxStuCreditService 
{
    @Autowired
    private RxStuCreditMapper rxStuCreditMapper;

    /**
     * 查询学业情况查询
     * 
     * @param id 学业情况查询主键
     * @return 学业情况查询
     */
    @Override
    public RxStuCredit selectRxStuCreditById(Integer id)
    {
        return rxStuCreditMapper.selectRxStuCreditById(id);
    }

    /**
     * 查询学业情况查询列表
     * 
     * @param rxStuCredit 学业情况查询
     * @return 学业情况查询
     */
    @Override
    public List<RxStuCredit> selectRxStuCreditList(RxStuCredit rxStuCredit)
    {
        return rxStuCreditMapper.selectRxStuCreditList(rxStuCredit);
    }

    /**
     * 新增学业情况查询
     * 
     * @param rxStuCredit 学业情况查询
     * @return 结果
     */
    @Override
    public int insertRxStuCredit(RxStuCredit rxStuCredit)
    {
        return rxStuCreditMapper.insertRxStuCredit(rxStuCredit);
    }

    /**
     * 修改学业情况查询
     * 
     * @param rxStuCredit 学业情况查询
     * @return 结果
     */
    @Override
    public int updateRxStuCredit(RxStuCredit rxStuCredit)
    {
        return rxStuCreditMapper.updateRxStuCredit(rxStuCredit);
    }

    /**
     * 批量删除学业情况查询
     * 
     * @param ids 需要删除的学业情况查询主键
     * @return 结果
     */
    @Override
    public int deleteRxStuCreditByIds(Integer[] ids)
    {
        return rxStuCreditMapper.deleteRxStuCreditByIds(ids);
    }

    /**
     * 删除学业情况查询信息
     * 
     * @param id 学业情况查询主键
     * @return 结果
     */
    @Override
    public int deleteRxStuCreditById(Integer id)
    {
        return rxStuCreditMapper.deleteRxStuCreditById(id);
    }
}
