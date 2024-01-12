package com.ruoyi.info.mapper;

import java.util.List;
import com.ruoyi.info.domain.RxStuCredit;

/**
 * 学业情况查询Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public interface RxStuCreditMapper 
{
    /**
     * 查询学业情况查询
     * 
     * @param id 学业情况查询主键
     * @return 学业情况查询
     */
    public RxStuCredit selectRxStuCreditById(Integer id);

    /**
     * 查询学业情况查询列表
     * 
     * @param rxStuCredit 学业情况查询
     * @return 学业情况查询集合
     */
    public List<RxStuCredit> selectRxStuCreditList(RxStuCredit rxStuCredit);

    /**
     * 新增学业情况查询
     * 
     * @param rxStuCredit 学业情况查询
     * @return 结果
     */
    public int insertRxStuCredit(RxStuCredit rxStuCredit);

    /**
     * 修改学业情况查询
     * 
     * @param rxStuCredit 学业情况查询
     * @return 结果
     */
    public int updateRxStuCredit(RxStuCredit rxStuCredit);

    /**
     * 删除学业情况查询
     * 
     * @param id 学业情况查询主键
     * @return 结果
     */
    public int deleteRxStuCreditById(Integer id);

    /**
     * 批量删除学业情况查询
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRxStuCreditByIds(Integer[] ids);
}
