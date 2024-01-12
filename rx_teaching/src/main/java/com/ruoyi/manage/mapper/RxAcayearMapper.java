package com.ruoyi.manage.mapper;

import java.util.List;
import com.ruoyi.manage.domain.RxAcayear;

/**
 * 学年管理Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
public interface RxAcayearMapper 
{
    /**
     * 查询学年管理
     * 
     * @param yearId 学年管理主键
     * @return 学年管理
     */
    public RxAcayear selectRxAcayearByYearId(Long yearId);

    /**
     * 查询学年管理列表
     * 
     * @param rxAcayear 学年管理
     * @return 学年管理集合
     */
    public List<RxAcayear> selectRxAcayearList(RxAcayear rxAcayear);

    /**
     * 新增学年管理
     * 
     * @param rxAcayear 学年管理
     * @return 结果
     */
    public int insertRxAcayear(RxAcayear rxAcayear);

    /**
     * 修改学年管理
     * 
     * @param rxAcayear 学年管理
     * @return 结果
     */
    public int updateRxAcayear(RxAcayear rxAcayear);

    /**
     * 删除学年管理
     * 
     * @param yearId 学年管理主键
     * @return 结果
     */
    public int deleteRxAcayearByYearId(Long yearId);

    /**
     * 批量删除学年管理
     * 
     * @param yearIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRxAcayearByYearIds(Long[] yearIds);
}
