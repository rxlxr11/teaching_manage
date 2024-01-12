package com.ruoyi.manage.controller;

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
import com.ruoyi.manage.domain.RxTeacher;
import com.ruoyi.manage.service.IRxTeacherService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教师管理Controller
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
@RestController
@RequestMapping("/manage/teacher")
public class RxTeacherController extends BaseController
{
    @Autowired
    private IRxTeacherService rxTeacherService;

    /**
     * 查询教师管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:teacher:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxTeacher rxTeacher)
    {
        startPage();
        List<RxTeacher> list = rxTeacherService.selectRxTeacherList(rxTeacher);
        return getDataTable(list);
    }

    /**
     * 导出教师管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:teacher:export')")
    @Log(title = "教师管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxTeacher rxTeacher)
    {
        List<RxTeacher> list = rxTeacherService.selectRxTeacherList(rxTeacher);
        ExcelUtil<RxTeacher> util = new ExcelUtil<RxTeacher>(RxTeacher.class);
        util.exportExcel(response, list, "教师管理数据");
    }

    /**
     * 获取教师管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:teacher:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rxTeacherService.selectRxTeacherById(id));
    }

    /**
     * 新增教师管理
     */
    @PreAuthorize("@ss.hasPermi('manage:teacher:add')")
    @Log(title = "教师管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxTeacher rxTeacher)
    {
        return toAjax(rxTeacherService.insertRxTeacher(rxTeacher));
    }

    /**
     * 修改教师管理
     */
    @PreAuthorize("@ss.hasPermi('manage:teacher:edit')")
    @Log(title = "教师管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxTeacher rxTeacher)
    {
        return toAjax(rxTeacherService.updateRxTeacher(rxTeacher));
    }

    /**
     * 删除教师管理
     */
    @PreAuthorize("@ss.hasPermi('manage:teacher:remove')")
    @Log(title = "教师管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rxTeacherService.deleteRxTeacherByIds(ids));
    }
}
