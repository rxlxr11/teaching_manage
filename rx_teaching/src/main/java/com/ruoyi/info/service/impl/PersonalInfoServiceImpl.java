package com.ruoyi.info.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.info.mapper.PersonalInfoMapper;
import com.ruoyi.info.domain.PersonalInfo;
import com.ruoyi.info.service.IPersonalInfoService;

/**
 * 个人信息Service业务层处理
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@Service
public class PersonalInfoServiceImpl implements IPersonalInfoService 
{
    @Autowired
    private PersonalInfoMapper personalInfoMapper;

    /**
     * 查询个人信息
     * 
     * @param stuId 个人信息主键
     * @return 个人信息
     */
    @Override
    public PersonalInfo selectPersonalInfoByStuId(String stuId)
    {
        return personalInfoMapper.selectPersonalInfoByStuId(stuId);
    }

    /**
     * 查询个人信息列表
     * 
     * @param personalInfo 个人信息
     * @return 个人信息
     */
    @Override
    public List<PersonalInfo> selectPersonalInfoList(PersonalInfo personalInfo)
    {
        return personalInfoMapper.selectPersonalInfoList(personalInfo);
    }

    /**
     * 新增个人信息
     * 
     * @param personalInfo 个人信息
     * @return 结果
     */
    @Override
    public int insertPersonalInfo(PersonalInfo personalInfo)
    {
        return personalInfoMapper.insertPersonalInfo(personalInfo);
    }

    /**
     * 修改个人信息
     * 
     * @param personalInfo 个人信息
     * @return 结果
     */
    @Override
    public int updatePersonalInfo(PersonalInfo personalInfo)
    {
        return personalInfoMapper.updatePersonalInfo(personalInfo);
    }

    /**
     * 批量删除个人信息
     * 
     * @param stuIds 需要删除的个人信息主键
     * @return 结果
     */
    @Override
    public int deletePersonalInfoByStuIds(String[] stuIds)
    {
        return personalInfoMapper.deletePersonalInfoByStuIds(stuIds);
    }

    /**
     * 删除个人信息信息
     * 
     * @param stuId 个人信息主键
     * @return 结果
     */
    @Override
    public int deletePersonalInfoByStuId(String stuId)
    {
        return personalInfoMapper.deletePersonalInfoByStuId(stuId);
    }
}
