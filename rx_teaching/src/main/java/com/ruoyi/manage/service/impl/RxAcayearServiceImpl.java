package com.ruoyi.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.RxAcayearMapper;
import com.ruoyi.manage.domain.RxAcayear;
import com.ruoyi.manage.service.IRxAcayearService;

/**
 * 学年管理Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
@Service
public class RxAcayearServiceImpl implements IRxAcayearService 
{
    @Autowired
    private RxAcayearMapper rxAcayearMapper;

    /**
     * 查询学年管理
     * 
     * @param yearId 学年管理主键
     * @return 学年管理
     */
    @Override
    public RxAcayear selectRxAcayearByYearId(Long yearId)
    {
        return rxAcayearMapper.selectRxAcayearByYearId(yearId);
    }

    /**
     * 查询学年管理列表
     * 
     * @param rxAcayear 学年管理
     * @return 学年管理
     */
    @Override
    public List<RxAcayear> selectRxAcayearList(RxAcayear rxAcayear)
    {
        return rxAcayearMapper.selectRxAcayearList(rxAcayear);
    }

    /**
     * 新增学年管理
     * 
     * @param rxAcayear 学年管理
     * @return 结果
     */
    @Override
    public int insertRxAcayear(RxAcayear rxAcayear)
    {
        return rxAcayearMapper.insertRxAcayear(rxAcayear);
    }

    /**
     * 修改学年管理
     * 
     * @param rxAcayear 学年管理
     * @return 结果
     */
    @Override
    public int updateRxAcayear(RxAcayear rxAcayear)
    {
        return rxAcayearMapper.updateRxAcayear(rxAcayear);
    }

    /**
     * 批量删除学年管理
     * 
     * @param yearIds 需要删除的学年管理主键
     * @return 结果
     */
    @Override
    public int deleteRxAcayearByYearIds(Long[] yearIds)
    {
        return rxAcayearMapper.deleteRxAcayearByYearIds(yearIds);
    }

    /**
     * 删除学年管理信息
     * 
     * @param yearId 学年管理主键
     * @return 结果
     */
    @Override
    public int deleteRxAcayearByYearId(Long yearId)
    {
        return rxAcayearMapper.deleteRxAcayearByYearId(yearId);
    }
}
