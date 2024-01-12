package com.ruoyi.info.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.info.domain.PersonalInfo;
import com.ruoyi.info.service.IPersonalInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 个人信息Controller
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/info/personal")
public class PersonalInfoController extends BaseController
{
    @Autowired
    private IPersonalInfoService personalInfoService;

    /**
     * 查询个人信息列表
     */
    @PreAuthorize("@ss.hasPermi('info:personal:list')")
    @GetMapping("/list")
    public TableDataInfo list(PersonalInfo personalInfo)
    {
        startPage();
        List<PersonalInfo> list = personalInfoService.selectPersonalInfoList(personalInfo);
        return getDataTable(list);
    }

    /**
     * 导出个人信息列表
     */
    @PreAuthorize("@ss.hasPermi('info:personal:export')")
    @Log(title = "个人信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PersonalInfo personalInfo)
    {
        List<PersonalInfo> list = personalInfoService.selectPersonalInfoList(personalInfo);
        ExcelUtil<PersonalInfo> util = new ExcelUtil<PersonalInfo>(PersonalInfo.class);
        util.exportExcel(response, list, "个人信息数据");
    }

    /**
     * 获取个人信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('info:personal:query')")
    @GetMapping(value = "/{stuId}")
    public AjaxResult getInfo(@PathVariable("stuId") String stuId)
    {
        return success(personalInfoService.selectPersonalInfoByStuId(stuId));
    }

    /**
     * 新增个人信息
     */
    @PreAuthorize("@ss.hasPermi('info:personal:add')")
    @Log(title = "个人信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PersonalInfo personalInfo)
    {
        return toAjax(personalInfoService.insertPersonalInfo(personalInfo));
    }

    /**
     * 修改个人信息
     */
    @PreAuthorize("@ss.hasPermi('info:personal:edit')")
    @Log(title = "个人信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PersonalInfo personalInfo)
    {
        return toAjax(personalInfoService.updatePersonalInfo(personalInfo));
    }

    /**
     * 删除个人信息
     */
    @PreAuthorize("@ss.hasPermi('info:personal:remove')")
    @Log(title = "个人信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stuIds}")
    public AjaxResult remove(@PathVariable String[] stuIds)
    {
        return toAjax(personalInfoService.deletePersonalInfoByStuIds(stuIds));
    }
}
