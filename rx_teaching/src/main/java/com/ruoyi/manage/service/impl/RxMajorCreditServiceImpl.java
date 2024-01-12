package com.ruoyi.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.RxMajorCreditMapper;
import com.ruoyi.manage.domain.RxMajorCredit;
import com.ruoyi.manage.service.IRxMajorCreditService;

/**
 * 专业学分管理Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
@Service
public class RxMajorCreditServiceImpl implements IRxMajorCreditService 
{
    @Autowired
    private RxMajorCreditMapper rxMajorCreditMapper;

    /**
     * 查询专业学分管理
     * 
     * @param id 专业学分管理主键
     * @return 专业学分管理
     */
    @Override
    public RxMajorCredit selectRxMajorCreditById(Long id)
    {
        return rxMajorCreditMapper.selectRxMajorCreditById(id);
    }

    /**
     * 查询专业学分管理列表
     * 
     * @param rxMajorCredit 专业学分管理
     * @return 专业学分管理
     */
    @Override
    public List<RxMajorCredit> selectRxMajorCreditList(RxMajorCredit rxMajorCredit)
    {
        return rxMajorCreditMapper.selectRxMajorCreditList(rxMajorCredit);
    }

    /**
     * 新增专业学分管理
     * 
     * @param rxMajorCredit 专业学分管理
     * @return 结果
     */
    @Override
    public int insertRxMajorCredit(RxMajorCredit rxMajorCredit)
    {
        return rxMajorCreditMapper.insertRxMajorCredit(rxMajorCredit);
    }

    /**
     * 修改专业学分管理
     * 
     * @param rxMajorCredit 专业学分管理
     * @return 结果
     */
    @Override
    public int updateRxMajorCredit(RxMajorCredit rxMajorCredit)
    {
        return rxMajorCreditMapper.updateRxMajorCredit(rxMajorCredit);
    }

    /**
     * 批量删除专业学分管理
     * 
     * @param ids 需要删除的专业学分管理主键
     * @return 结果
     */
    @Override
    public int deleteRxMajorCreditByIds(Long[] ids)
    {
        return rxMajorCreditMapper.deleteRxMajorCreditByIds(ids);
    }

    /**
     * 删除专业学分管理信息
     * 
     * @param id 专业学分管理主键
     * @return 结果
     */
    @Override
    public int deleteRxMajorCreditById(Long id)
    {
        return rxMajorCreditMapper.deleteRxMajorCreditById(id);
    }
}
