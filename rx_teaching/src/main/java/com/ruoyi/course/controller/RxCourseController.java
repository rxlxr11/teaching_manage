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
import com.ruoyi.course.domain.RxCourse;
import com.ruoyi.course.service.IRxCourseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教授课程Controller
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/course/teach")
public class RxCourseController extends BaseController
{
    @Autowired
    private IRxCourseService rxCourseService;

    /**
     * 查询教授课程列表
     */
    @PreAuthorize("@ss.hasPermi('course:teach:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxCourse rxCourse)
    {
        startPage();
        List<RxCourse> list = rxCourseService.selectRxCourseList(rxCourse);
        return getDataTable(list);
    }

    /**
     * 导出教授课程列表
     */
    @PreAuthorize("@ss.hasPermi('course:teach:export')")
    @Log(title = "教授课程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxCourse rxCourse)
    {
        List<RxCourse> list = rxCourseService.selectRxCourseList(rxCourse);
        ExcelUtil<RxCourse> util = new ExcelUtil<RxCourse>(RxCourse.class);
        util.exportExcel(response, list, "教授课程数据");
    }

    /**
     * 获取教授课程详细信息
     */
    @PreAuthorize("@ss.hasPermi('course:teach:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rxCourseService.selectRxCourseById(id));
    }

    /**
     * 新增教授课程
     */
    @PreAuthorize("@ss.hasPermi('course:teach:add')")
    @Log(title = "教授课程", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxCourse rxCourse)
    {
        return toAjax(rxCourseService.insertRxCourse(rxCourse));
    }

    /**
     * 修改教授课程
     */
    @PreAuthorize("@ss.hasPermi('course:teach:edit')")
    @Log(title = "教授课程", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxCourse rxCourse)
    {
        return toAjax(rxCourseService.updateRxCourse(rxCourse));
    }

    /**
     * 删除教授课程
     */
    @PreAuthorize("@ss.hasPermi('course:teach:remove')")
    @Log(title = "教授课程", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rxCourseService.deleteRxCourseByIds(ids));
    }
}
