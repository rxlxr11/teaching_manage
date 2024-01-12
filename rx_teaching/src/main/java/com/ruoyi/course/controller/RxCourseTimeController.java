package com.ruoyi.course.controller;

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
import com.ruoyi.course.domain.RxCourseTime;
import com.ruoyi.course.service.IRxCourseTimeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程时间Controller
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/course/time")
public class RxCourseTimeController extends BaseController
{
    @Autowired
    private IRxCourseTimeService rxCourseTimeService;

    /**
     * 查询课程时间列表
     */
    @PreAuthorize("@ss.hasPermi('course:time:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxCourseTime rxCourseTime)
    {
        startPage();
        List<RxCourseTime> list = rxCourseTimeService.selectRxCourseTimeList(rxCourseTime);
        return getDataTable(list);
    }

    /**
     * 导出课程时间列表
     */
    @PreAuthorize("@ss.hasPermi('course:time:export')")
    @Log(title = "课程时间", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxCourseTime rxCourseTime)
    {
        List<RxCourseTime> list = rxCourseTimeService.selectRxCourseTimeList(rxCourseTime);
        ExcelUtil<RxCourseTime> util = new ExcelUtil<RxCourseTime>(RxCourseTime.class);
        util.exportExcel(response, list, "课程时间数据");
    }

    /**
     * 获取课程时间详细信息
     */
    @PreAuthorize("@ss.hasPermi('course:time:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rxCourseTimeService.selectRxCourseTimeById(id));
    }

    /**
     * 新增课程时间
     */
    @PreAuthorize("@ss.hasPermi('course:time:add')")
    @Log(title = "课程时间", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxCourseTime rxCourseTime)
    {
        return toAjax(rxCourseTimeService.insertRxCourseTime(rxCourseTime));
    }

    /**
     * 修改课程时间
     */
    @PreAuthorize("@ss.hasPermi('course:time:edit')")
    @Log(title = "课程时间", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxCourseTime rxCourseTime)
    {
        return toAjax(rxCourseTimeService.updateRxCourseTime(rxCourseTime));
    }

    /**
     * 删除课程时间
     */
    @PreAuthorize("@ss.hasPermi('course:time:remove')")
    @Log(title = "课程时间", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rxCourseTimeService.deleteRxCourseTimeByIds(ids));
    }
}
