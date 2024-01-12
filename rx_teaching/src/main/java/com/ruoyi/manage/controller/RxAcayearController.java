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
import com.ruoyi.manage.domain.RxAcayear;
import com.ruoyi.manage.service.IRxAcayearService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学年管理Controller
 * 
 * @author rxlxr
 * @date 2024-01-09
 */
@RestController
@RequestMapping("/manage/acayear")
public class RxAcayearController extends BaseController
{
    @Autowired
    private IRxAcayearService rxAcayearService;

    /**
     * 查询学年管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:acayear:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxAcayear rxAcayear)
    {
        startPage();
        List<RxAcayear> list = rxAcayearService.selectRxAcayearList(rxAcayear);
        return getDataTable(list);
    }

    /**
     * 导出学年管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:acayear:export')")
    @Log(title = "学年管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxAcayear rxAcayear)
    {
        List<RxAcayear> list = rxAcayearService.selectRxAcayearList(rxAcayear);
        ExcelUtil<RxAcayear> util = new ExcelUtil<RxAcayear>(RxAcayear.class);
        util.exportExcel(response, list, "学年管理数据");
    }

    /**
     * 获取学年管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:acayear:query')")
    @GetMapping(value = "/{yearId}")
    public AjaxResult getInfo(@PathVariable("yearId") Long yearId)
    {
        return success(rxAcayearService.selectRxAcayearByYearId(yearId));
    }

    /**
     * 新增学年管理
     */
    @PreAuthorize("@ss.hasPermi('manage:acayear:add')")
    @Log(title = "学年管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxAcayear rxAcayear)
    {
        return toAjax(rxAcayearService.insertRxAcayear(rxAcayear));
    }

    /**
     * 修改学年管理
     */
    @PreAuthorize("@ss.hasPermi('manage:acayear:edit')")
    @Log(title = "学年管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxAcayear rxAcayear)
    {
        return toAjax(rxAcayearService.updateRxAcayear(rxAcayear));
    }

    /**
     * 删除学年管理
     */
    @PreAuthorize("@ss.hasPermi('manage:acayear:remove')")
    @Log(title = "学年管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{yearIds}")
    public AjaxResult remove(@PathVariable Long[] yearIds)
    {
        return toAjax(rxAcayearService.deleteRxAcayearByYearIds(yearIds));
    }
}
