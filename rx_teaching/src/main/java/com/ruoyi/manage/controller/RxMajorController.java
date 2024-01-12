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
import com.ruoyi.manage.domain.RxMajor;
import com.ruoyi.manage.service.IRxMajorService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 专业管理Controller
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
@RestController
@RequestMapping("/manage/major")
public class RxMajorController extends BaseController
{
    @Autowired
    private IRxMajorService rxMajorService;

    /**
     * 查询专业管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:major:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxMajor rxMajor)
    {
        startPage();
        List<RxMajor> list = rxMajorService.selectRxMajorList(rxMajor);
        return getDataTable(list);
    }

    /**
     * 导出专业管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:major:export')")
    @Log(title = "专业管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxMajor rxMajor)
    {
        List<RxMajor> list = rxMajorService.selectRxMajorList(rxMajor);
        ExcelUtil<RxMajor> util = new ExcelUtil<RxMajor>(RxMajor.class);
        util.exportExcel(response, list, "专业管理数据");
    }

    /**
     * 获取专业管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:major:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rxMajorService.selectRxMajorById(id));
    }

    /**
     * 新增专业管理
     */
    @PreAuthorize("@ss.hasPermi('manage:major:add')")
    @Log(title = "专业管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxMajor rxMajor)
    {
        return toAjax(rxMajorService.insertRxMajor(rxMajor));
    }

    /**
     * 修改专业管理
     */
    @PreAuthorize("@ss.hasPermi('manage:major:edit')")
    @Log(title = "专业管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxMajor rxMajor)
    {
        return toAjax(rxMajorService.updateRxMajor(rxMajor));
    }

    /**
     * 删除专业管理
     */
    @PreAuthorize("@ss.hasPermi('manage:major:remove')")
    @Log(title = "专业管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rxMajorService.deleteRxMajorByIds(ids));
    }
}
