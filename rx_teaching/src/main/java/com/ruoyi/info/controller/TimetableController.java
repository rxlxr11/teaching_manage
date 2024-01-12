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
import com.ruoyi.info.domain.Timetable;
import com.ruoyi.info.service.ITimetableService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程表Controller
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/info/timetable")
public class TimetableController extends BaseController
{
    @Autowired
    private ITimetableService timetableService;

    /**
     * 查询课程表列表
     */
    @PreAuthorize("@ss.hasPermi('info:timetable:list')")
    @GetMapping("/list")
    public TableDataInfo list(Timetable timetable)
    {
        startPage();
        List<Timetable> list = timetableService.selectTimetableList(timetable);
        return getDataTable(list);
    }

    /**
     * 导出课程表列表
     */
    @PreAuthorize("@ss.hasPermi('info:timetable:export')")
    @Log(title = "课程表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Timetable timetable)
    {
        List<Timetable> list = timetableService.selectTimetableList(timetable);
        ExcelUtil<Timetable> util = new ExcelUtil<Timetable>(Timetable.class);
        util.exportExcel(response, list, "课程表数据");
    }

    /**
     * 获取课程表详细信息
     */
    @PreAuthorize("@ss.hasPermi('info:timetable:query')")
    @GetMapping(value = "/{stuId}")
    public AjaxResult getInfo(@PathVariable("stuId") String stuId)
    {
        return success(timetableService.selectTimetableByStuId(stuId));
    }

    /**
     * 新增课程表
     */
    @PreAuthorize("@ss.hasPermi('info:timetable:add')")
    @Log(title = "课程表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Timetable timetable)
    {
        return toAjax(timetableService.insertTimetable(timetable));
    }

    /**
     * 修改课程表
     */
    @PreAuthorize("@ss.hasPermi('info:timetable:edit')")
    @Log(title = "课程表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Timetable timetable)
    {
        return toAjax(timetableService.updateTimetable(timetable));
    }

    /**
     * 删除课程表
     */
    @PreAuthorize("@ss.hasPermi('info:timetable:remove')")
    @Log(title = "课程表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stuIds}")
    public AjaxResult remove(@PathVariable String[] stuIds)
    {
        return toAjax(timetableService.deleteTimetableByStuIds(stuIds));
    }
}
