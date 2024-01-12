package com.ruoyi.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.RxMajorMapper;
import com.ruoyi.manage.domain.RxMajor;
import com.ruoyi.manage.service.IRxMajorService;

/**
 * 专业管理Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
@Service
public class RxMajorServiceImpl implements IRxMajorService 
{
    @Autowired
    private RxMajorMapper rxMajorMapper;

    /**
     * 查询专业管理
     * 
     * @param id 专业管理主键
     * @return 专业管理
     */
    @Override
    public RxMajor selectRxMajorById(Long id)
    {
        return rxMajorMapper.selectRxMajorById(id);
    }

    /**
     * 查询专业管理列表
     * 
     * @param rxMajor 专业管理
     * @return 专业管理
     */
    @Override
    public List<RxMajor> selectRxMajorList(RxMajor rxMajor)
    {
        return rxMajorMapper.selectRxMajorList(rxMajor);
    }

    /**
     * 新增专业管理
     * 
     * @param rxMajor 专业管理
     * @return 结果
     */
    @Override
    public int insertRxMajor(RxMajor rxMajor)
    {
        return rxMajorMapper.insertRxMajor(rxMajor);
    }

    /**
     * 修改专业管理
     * 
     * @param rxMajor 专业管理
     * @return 结果
     */
    @Override
    public int updateRxMajor(RxMajor rxMajor)
    {
        return rxMajorMapper.updateRxMajor(rxMajor);
    }

    /**
     * 批量删除专业管理
     * 
     * @param ids 需要删除的专业管理主键
     * @return 结果
     */
    @Override
    public int deleteRxMajorByIds(Long[] ids)
    {
        return rxMajorMapper.deleteRxMajorByIds(ids);
    }

    /**
     * 删除专业管理信息
     * 
     * @param id 专业管理主键
     * @return 结果
     */
    @Override
    public int deleteRxMajorById(Long id)
    {
        return rxMajorMapper.deleteRxMajorById(id);
    }
}
