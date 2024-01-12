package com.ruoyi.manage.service;

import java.util.List;
import com.ruoyi.manage.domain.RxCollege;

/**
 * 学院管理Service接口
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
public interface IRxCollegeService 
{
    /**
     * 查询学院管理
     * 
     * @param id 学院管理主键
     * @return 学院管理
     */
    public RxCollege selectRxCollegeById(Long id);

    /**
     * 查询学院管理列表
     * 
     * @param rxCollege 学院管理
     * @return 学院管理集合
     */
    public List<RxCollege> selectRxCollegeList(RxCollege rxCollege);

    /**
     * 新增学院管理
     * 
     * @param rxCollege 学院管理
     * @return 结果
     */
    public int insertRxCollege(RxCollege rxCollege);

    /**
     * 修改学院管理
     * 
     * @param rxCollege 学院管理
     * @return 结果
     */
    public int updateRxCollege(RxCollege rxCollege);

    /**
     * 批量删除学院管理
     * 
     * @param ids 需要删除的学院管理主键集合
     * @return 结果
     */
    public int deleteRxCollegeByIds(Long[] ids);

    /**
     * 删除学院管理信息
     * 
     * @param id 学院管理主键
     * @return 结果
     */
    public int deleteRxCollegeById(Long id);
}
