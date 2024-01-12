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
import com.ruoyi.course.domain.RxCourse2;
import com.ruoyi.course.service.IRxCourse2Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 自主选课Controller
 * 
 * @author rxlxr
 * @date 2024-01-11
 */
@RestController
@RequestMapping("/course/select")
public class RxCourse2Controller extends BaseController
{
    @Autowired
    private IRxCourse2Service rxCourse2Service;

    /**
     * 查询自主选课列表
     */
    @PreAuthorize("@ss.hasPermi('course:select:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxCourse2 rxCourse2)
    {
        startPage();
        List<RxCourse2> list = rxCourse2Service.selectRxCourse2List(rxCourse2);
        return getDataTable(list);
    }

    /**
     * 导出自主选课列表
     */
    @PreAuthorize("@ss.hasPermi('course:select:export')")
    @Log(title = "自主选课", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxCourse2 rxCourse2)
    {
        List<RxCourse2> list = rxCourse2Service.selectRxCourse2List(rxCourse2);
        ExcelUtil<RxCourse2> util = new ExcelUtil<RxCourse2>(RxCourse2.class);
        util.exportExcel(response, list, "自主选课数据");
    }

    /**
     * 获取自主选课详细信息
     */
    @PreAuthorize("@ss.hasPermi('course:select:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rxCourse2Service.selectRxCourse2ById(id));
    }

    /**
     * 新增自主选课
     */
    @PreAuthorize("@ss.hasPermi('course:select:add')")
    @Log(title = "自主选课", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxCourse2 rxCourse2)
    {
        return toAjax(rxCourse2Service.insertRxCourse2(rxCourse2));
    }

    /**
     * 修改自主选课
     */
    @PreAuthorize("@ss.hasPermi('course:select:edit')")
    @Log(title = "自主选课", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxCourse2 rxCourse2)
    {
        return toAjax(rxCourse2Service.updateRxCourse2(rxCourse2));
    }

    /**
     * 删除自主选课
     */
    @PreAuthorize("@ss.hasPermi('course:select:remove')")
    @Log(title = "自主选课", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rxCourse2Service.deleteRxCourse2ByIds(ids));
    }
}
