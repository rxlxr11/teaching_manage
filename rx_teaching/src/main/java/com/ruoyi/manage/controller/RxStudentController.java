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
import com.ruoyi.manage.domain.RxStudent;
import com.ruoyi.manage.service.IRxStudentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生管理Controller
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
@RestController
@RequestMapping("/manage/student")
public class RxStudentController extends BaseController
{
    @Autowired
    private IRxStudentService rxStudentService;

    /**
     * 查询学生管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxStudent rxStudent)
    {
        startPage();
        List<RxStudent> list = rxStudentService.selectRxStudentList(rxStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:student:export')")
    @Log(title = "学生管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxStudent rxStudent)
    {
        List<RxStudent> list = rxStudentService.selectRxStudentList(rxStudent);
        ExcelUtil<RxStudent> util = new ExcelUtil<RxStudent>(RxStudent.class);
        util.exportExcel(response, list, "学生管理数据");
    }

    /**
     * 获取学生管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:student:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rxStudentService.selectRxStudentById(id));
    }

    /**
     * 新增学生管理
     */
    @PreAuthorize("@ss.hasPermi('manage:student:add')")
    @Log(title = "学生管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxStudent rxStudent)
    {
        return toAjax(rxStudentService.insertRxStudent(rxStudent));
    }

    /**
     * 修改学生管理
     */
    @PreAuthorize("@ss.hasPermi('manage:student:edit')")
    @Log(title = "学生管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxStudent rxStudent)
    {
        return toAjax(rxStudentService.updateRxStudent(rxStudent));
    }

    /**
     * 删除学生管理
     */
    @PreAuthorize("@ss.hasPermi('manage:student:remove')")
    @Log(title = "学生管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rxStudentService.deleteRxStudentByIds(ids));
    }
}
