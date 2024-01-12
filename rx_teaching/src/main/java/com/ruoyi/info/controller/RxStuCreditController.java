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
import com.ruoyi.info.domain.RxStuCredit;
import com.ruoyi.info.service.IRxStuCreditService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学业情况查询Controller
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/info/credit")
public class RxStuCreditController extends BaseController
{
    @Autowired
    private IRxStuCreditService rxStuCreditService;

    /**
     * 查询学业情况查询列表
     */
    @PreAuthorize("@ss.hasPermi('info:credit:list')")
    @GetMapping("/list")
    public TableDataInfo list(RxStuCredit rxStuCredit)
    {
        startPage();
        List<RxStuCredit> list = rxStuCreditService.selectRxStuCreditList(rxStuCredit);
        return getDataTable(list);
    }

    /**
     * 导出学业情况查询列表
     */
    @PreAuthorize("@ss.hasPermi('info:credit:export')")
    @Log(title = "学业情况查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RxStuCredit rxStuCredit)
    {
        List<RxStuCredit> list = rxStuCreditService.selectRxStuCreditList(rxStuCredit);
        ExcelUtil<RxStuCredit> util = new ExcelUtil<RxStuCredit>(RxStuCredit.class);
        util.exportExcel(response, list, "学业情况查询数据");
    }

    /**
     * 获取学业情况查询详细信息
     */
    @PreAuthorize("@ss.hasPermi('info:credit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return success(rxStuCreditService.selectRxStuCreditById(id));
    }

    /**
     * 新增学业情况查询
     */
    @PreAuthorize("@ss.hasPermi('info:credit:add')")
    @Log(title = "学业情况查询", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RxStuCredit rxStuCredit)
    {
        return toAjax(rxStuCreditService.insertRxStuCredit(rxStuCredit));
    }

    /**
     * 修改学业情况查询
     */
    @PreAuthorize("@ss.hasPermi('info:credit:edit')")
    @Log(title = "学业情况查询", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RxStuCredit rxStuCredit)
    {
        return toAjax(rxStuCreditService.updateRxStuCredit(rxStuCredit));
    }

    /**
     * 删除学业情况查询
     */
    @PreAuthorize("@ss.hasPermi('info:credit:remove')")
    @Log(title = "学业情况查询", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(rxStuCreditService.deleteRxStuCreditByIds(ids));
    }
}
