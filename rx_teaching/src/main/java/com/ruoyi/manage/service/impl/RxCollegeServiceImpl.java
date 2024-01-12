package com.ruoyi.manage.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.RxCollegeMapper;
import com.ruoyi.manage.domain.RxCollege;
import com.ruoyi.manage.service.IRxCollegeService;

/**
 * 学院管理Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
@Service
public class RxCollegeServiceImpl implements IRxCollegeService 
{
    @Autowired
    private RxCollegeMapper rxCollegeMapper;

    /**
     * 查询学院管理
     * 
     * @param id 学院管理主键
     * @return 学院管理
     */
    @Override
    public RxCollege selectRxCollegeById(Long id)
    {
        return rxCollegeMapper.selectRxCollegeById(id);
    }

    /**
     * 查询学院管理列表
     * 
     * @param rxCollege 学院管理
     * @return 学院管理
     */
    @Override
    public List<RxCollege> selectRxCollegeList(RxCollege rxCollege)
    {
        return rxCollegeMapper.selectRxCollegeList(rxCollege);
    }

    /**
     * 新增学院管理
     * 
     * @param rxCollege 学院管理
     * @return 结果
     */
    @Override
    public int insertRxCollege(RxCollege rxCollege)
    {
        return rxCollegeMapper.insertRxCollege(rxCollege);
    }

    /**
     * 修改学院管理
     * 
     * @param rxCollege 学院管理
     * @return 结果
     */
    @Override
    public int updateRxCollege(RxCollege rxCollege)
    {
        return rxCollegeMapper.updateRxCollege(rxCollege);
    }

    /**
     * 批量删除学院管理
     * 
     * @param ids 需要删除的学院管理主键
     * @return 结果
     */
    @Override
    public int deleteRxCollegeByIds(Long[] ids)
    {
        return rxCollegeMapper.deleteRxCollegeByIds(ids);
    }

    /**
     * 删除学院管理信息
     * 
     * @param id 学院管理主键
     * @return 结果
     */
    @Override
    public int deleteRxCollegeById(Long id)
    {
        return rxCollegeMapper.deleteRxCollegeById(id);
    }
}
