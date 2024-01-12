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
import com.ruoyi.info.domain.StuGrade;
import com.ruoyi.info.service.IStuGradeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 成绩查询Controller
 * 
 * @author rxlxr
 * @date 2024-01-12
 */
@RestController
@RequestMapping("/info/grade")
public class StuGradeController extends BaseController
{
    @Autowired
    private IStuGradeService stuGradeService;

    /**
     * 查询成绩查询列表
     */
    @PreAuthorize("@ss.hasPermi('info:grade:list')")
    @GetMapping("/list")
    public TableDataInfo list(StuGrade stuGrade)
    {
        startPage();
        List<StuGrade> list = stuGradeService.selectStuGradeList(stuGrade);
        return getDataTable(list);
    }

    /**
     * 导出成绩查询列表
     */
    @PreAuthorize("@ss.hasPermi('info:grade:export')")
    @Log(title = "成绩查询", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StuGrade stuGrade)
    {
        List<StuGrade> list = stuGradeService.selectStuGradeList(stuGrade);
        ExcelUtil<StuGrade> util = new ExcelUtil<StuGrade>(StuGrade.class);
        util.exportExcel(response, list, "成绩查询数据");
    }

    /**
     * 获取成绩查询详细信息
     */
    @PreAuthorize("@ss.hasPermi('info:grade:query')")
    @GetMapping(value = "/{stuId}")
    public AjaxResult getInfo(@PathVariable("stuId") String stuId)
    {
        return success(stuGradeService.selectStuGradeByStuId(stuId));
    }

    /**
     * 新增成绩查询
     */
    @PreAuthorize("@ss.hasPermi('info:grade:add')")
    @Log(title = "成绩查询", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StuGrade stuGrade)
    {
        return toAjax(stuGradeService.insertStuGrade(stuGrade));
    }

    /**
     * 修改成绩查询
     */
    @PreAuthorize("@ss.hasPermi('info:grade:edit')")
    @Log(title = "成绩查询", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StuGrade stuGrade)
    {
        return toAjax(stuGradeService.updateStuGrade(stuGrade));
    }

    /**
     * 删除成绩查询
     */
    @PreAuthorize("@ss.hasPermi('info:grade:remove')")
    @Log(title = "成绩查询", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stuIds}")
    public AjaxResult remove(@PathVariable String[] stuIds)
    {
        return toAjax(stuGradeService.deleteStuGradeByStuIds(stuIds));
    }
}
