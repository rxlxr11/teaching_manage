package com.ruoyi.manage.mapper;

import java.util.List;
import com.ruoyi.manage.domain.RxMajorCredit;

/**
 * 专业学分管理Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
public interface RxMajorCreditMapper 
{
    /**
     * 查询专业学分管理
     * 
     * @param id 专业学分管理主键
     * @return 专业学分管理
     */
    public RxMajorCredit selectRxMajorCreditById(Long id);

    /**
     * 查询专业学分管理列表
     * 
     * @param rxMajorCredit 专业学分管理
     * @return 专业学分管理集合
     */
    public List<RxMajorCredit> selectRxMajorCreditList(RxMajorCredit rxMajorCredit);

    /**
     * 新增专业学分管理
     * 
     * @param rxMajorCredit 专业学分管理
     * @return 结果
     */
    public int insertRxMajorCredit(RxMajorCredit rxMajorCredit);

    /**
     * 修改专业学分管理
     * 
     * @param rxMajorCredit 专业学分管理
     * @return 结果
     */
    public int updateRxMajorCredit(RxMajorCredit rxMajorCredit);

    /**
     * 删除专业学分管理
     * 
     * @param id 专业学分管理主键
     * @return 结果
     */
    public int deleteRxMajorCreditById(Long id);

    /**
     * 批量删除专业学分管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRxMajorCreditByIds(Long[] ids);
}
