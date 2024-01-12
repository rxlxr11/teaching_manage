package com.ruoyi.manage.mapper;

import java.util.List;
import com.ruoyi.manage.domain.RxMajor;

/**
 * 专业管理Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
public interface RxMajorMapper 
{
    /**
     * 查询专业管理
     * 
     * @param id 专业管理主键
     * @return 专业管理
     */
    public RxMajor selectRxMajorById(Long id);

    /**
     * 查询专业管理列表
     * 
     * @param rxMajor 专业管理
     * @return 专业管理集合
     */
    public List<RxMajor> selectRxMajorList(RxMajor rxMajor);

    /**
     * 新增专业管理
     * 
     * @param rxMajor 专业管理
     * @return 结果
     */
    public int insertRxMajor(RxMajor rxMajor);

    /**
     * 修改专业管理
     * 
     * @param rxMajor 专业管理
     * @return 结果
     */
    public int updateRxMajor(RxMajor rxMajor);

    /**
     * 删除专业管理
     * 
     * @param id 专业管理主键
     * @return 结果
     */
    public int deleteRxMajorById(Long id);

    /**
     * 批量删除专业管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRxMajorByIds(Long[] ids);
}
