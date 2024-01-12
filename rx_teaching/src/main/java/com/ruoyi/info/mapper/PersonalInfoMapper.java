package com.ruoyi.info.mapper;

import java.util.List;
import com.ruoyi.info.domain.PersonalInfo;

/**
 * 个人信息Mapper接口
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
public interface PersonalInfoMapper 
{
    /**
     * 查询个人信息
     * 
     * @param stuId 个人信息主键
     * @return 个人信息
     */
    public PersonalInfo selectPersonalInfoByStuId(String stuId);

    /**
     * 查询个人信息列表
     * 
     * @param personalInfo 个人信息
     * @return 个人信息集合
     */
    public List<PersonalInfo> selectPersonalInfoList(PersonalInfo personalInfo);

    /**
     * 新增个人信息
     * 
     * @param personalInfo 个人信息
     * @return 结果
     */
    public int insertPersonalInfo(PersonalInfo personalInfo);

    /**
     * 修改个人信息
     * 
     * @param personalInfo 个人信息
     * @return 结果
     */
    public int updatePersonalInfo(PersonalInfo personalInfo);

    /**
     * 删除个人信息
     * 
     * @param stuId 个人信息主键
     * @return 结果
     */
    public int deletePersonalInfoByStuId(String stuId);

    /**
     * 批量删除个人信息
     * 
     * @param stuIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePersonalInfoByStuIds(String[] stuIds);
}
