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
import com.ruoyi.course.domain.RxSelectCourse;
import com.ruoyi.course.service.IRxSelectCourseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 已选课程Controller
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/course/course_select")
public class RxSelectCourseController extends BaseController
{
    @Autowired
    private IRxSelectCourseService rxSelectCourseService;

    /**
     * 查询已选课程列表
     */
    @PreAuthorize("@ss.hasPermi('course:course_select:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxSelectCourse rxSelectCourse)
    {
        startPage();
        List<RxSelectCourse> list = rxSelectCourseService.selectRxSelectCourseList(rxSelectCourse);
        return getDataTable(list);
    }

    /**
     * 导出已选课程列表
     */
    @PreAuthorize("@ss.hasPermi('course:course_select:export')")
    @Log(title = "已选课程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxSelectCourse rxSelectCourse)
    {
        List<RxSelectCourse> list = rxSelectCourseService.selectRxSelectCourseList(rxSelectCourse);
        ExcelUtil<RxSelectCourse> util = new ExcelUtil<RxSelectCourse>(RxSelectCourse.class);
        util.exportExcel(response, list, "已选课程数据");
    }

    /**
     * 获取已选课程详细信息
     */
    @PreAuthorize("@ss.hasPermi('course:course_select:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(rxSelectCourseService.selectRxSelectCourseById(id));
    }

    /**
     * 新增已选课程
     */
//    @PreAuthorize("@ss.hasPermi('course:select:add')")
    @Log(title = "已选课程", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxSelectCourse rxSelectCourse)
    {
        return toAjax(rxSelectCourseService.insertRxSelectCourse(rxSelectCourse));
    }

    /**
     * 修改已选课程
     */
    @PreAuthorize("@ss.hasPermi('course:course_select:edit')")
    @Log(title = "已选课程", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxSelectCourse rxSelectCourse)
    {
        return toAjax(rxSelectCourseService.updateRxSelectCourse(rxSelectCourse));
    }

    /**
     * 删除已选课程
     */
    @PreAuthorize("@ss.hasPermi('course:course_select:remove')")
    @Log(title = "已选课程", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(rxSelectCourseService.deleteRxSelectCourseByIds(ids));
    }
}
