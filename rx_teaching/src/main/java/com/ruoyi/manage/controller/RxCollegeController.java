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
import com.ruoyi.manage.domain.RxCollege;
import com.ruoyi.manage.service.IRxCollegeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学院管理Controller
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
@RestController
@RequestMapping("/manage/college")
public class RxCollegeController extends BaseController
{
    @Autowired
    private IRxCollegeService rxCollegeService;

    /**
     * 查询学院管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:college:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxCollege rxCollege)
    {
        startPage();
        List<RxCollege> list = rxCollegeService.selectRxCollegeList(rxCollege);
        return getDataTable(list);
    }

    /**
     * 导出学院管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:college:export')")
    @Log(title = "学院管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxCollege rxCollege)
    {
        List<RxCollege> list = rxCollegeService.selectRxCollegeList(rxCollege);
        ExcelUtil<RxCollege> util = new ExcelUtil<RxCollege>(RxCollege.class);
        util.exportExcel(response, list, "学院管理数据");
    }

    /**
     * 获取学院管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:college:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rxCollegeService.selectRxCollegeById(id));
    }

    /**
     * 新增学院管理
     */
    @PreAuthorize("@ss.hasPermi('manage:college:add')")
    @Log(title = "学院管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxCollege rxCollege)
    {
        return toAjax(rxCollegeService.insertRxCollege(rxCollege));
    }

    /**
     * 修改学院管理
     */
    @PreAuthorize("@ss.hasPermi('manage:college:edit')")
    @Log(title = "学院管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxCollege rxCollege)
    {
        return toAjax(rxCollegeService.updateRxCollege(rxCollege));
    }

    /**
     * 删除学院管理
     */
    @PreAuthorize("@ss.hasPermi('manage:college:remove')")
    @Log(title = "学院管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rxCollegeService.deleteRxCollegeByIds(ids));
    }
}
