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
import com.ruoyi.manage.domain.RxMajorCredit;
import com.ruoyi.manage.service.IRxMajorCreditService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 专业学分管理Controller
 * 
 * @author rxlxr
 * @date 2024-01-10
 */
@RestController
@RequestMapping("/manage/credit")
public class RxMajorCreditController extends BaseController
{
    @Autowired
    private IRxMajorCreditService rxMajorCreditService;

    /**
     * 查询专业学分管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:credit:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxMajorCredit rxMajorCredit)
    {
        startPage();
        List<RxMajorCredit> list = rxMajorCreditService.selectRxMajorCreditList(rxMajorCredit);
        return getDataTable(list);
    }

    /**
     * 导出专业学分管理列表
     */
    @PreAuthorize("@ss.hasPermi('manage:credit:export')")
    @Log(title = "专业学分管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxMajorCredit rxMajorCredit)
    {
        List<RxMajorCredit> list = rxMajorCreditService.selectRxMajorCreditList(rxMajorCredit);
        ExcelUtil<RxMajorCredit> util = new ExcelUtil<RxMajorCredit>(RxMajorCredit.class);
        util.exportExcel(response, list, "专业学分管理数据");
    }

    /**
     * 获取专业学分管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:credit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(rxMajorCreditService.selectRxMajorCreditById(id));
    }

    /**
     * 新增专业学分管理
     */
    @PreAuthorize("@ss.hasPermi('manage:credit:add')")
    @Log(title = "专业学分管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxMajorCredit rxMajorCredit)
    {
        return toAjax(rxMajorCreditService.insertRxMajorCredit(rxMajorCredit));
    }

    /**
     * 修改专业学分管理
     */
    @PreAuthorize("@ss.hasPermi('manage:credit:edit')")
    @Log(title = "专业学分管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxMajorCredit rxMajorCredit)
    {
        return toAjax(rxMajorCreditService.updateRxMajorCredit(rxMajorCredit));
    }

    /**
     * 删除专业学分管理
     */
    @PreAuthorize("@ss.hasPermi('manage:credit:remove')")
    @Log(title = "专业学分管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(rxMajorCreditService.deleteRxMajorCreditByIds(ids));
    }
}
