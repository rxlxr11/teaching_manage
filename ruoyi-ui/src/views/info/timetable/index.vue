<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="学生编号" prop="stuId">
        <el-input
          v-model="queryParams.stuId"
          placeholder="请输入学生编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="学生姓名" prop="stuName">
        <el-input
          v-model="queryParams.stuName"
          placeholder="请输入学生姓名"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程编号" prop="courseId">
        <el-input
          v-model="queryParams.courseId"
          placeholder="请输入课程编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程名称" prop="courseName">
        <el-input
          v-model="queryParams.courseName"
          placeholder="请输入课程名称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程学年" prop="acaYear">
        <el-input
          v-model="queryParams.acaYear"
          placeholder="请输入课程学年"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程开始周" prop="startWeek">
        <el-input
          v-model="queryParams.startWeek"
          placeholder="请输入课程开始周"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程结束周" prop="endWeek">
        <el-input
          v-model="queryParams.endWeek"
          placeholder="请输入课程结束周"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程开始节" prop="start">
        <el-input
          v-model="queryParams.start"
          placeholder="请输入课程开始节"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程结束节" prop="end">
        <el-input
          v-model="queryParams.end"
          placeholder="请输入课程结束节"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="课程周几" prop="weekday">
        <el-input
          v-model="queryParams.weekday"
          placeholder="请输入课程周几"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="0无1单2双" prop="special">
        <el-input
          v-model="queryParams.special"
          placeholder="请输入0无1单2双"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['info:timetable:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['info:timetable:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['info:timetable:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['info:timetable:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="timetableList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="学生编号" align="center" prop="stuId" />
      <el-table-column label="学生姓名" align="center" prop="stuName" />
      <el-table-column label="课程编号" align="center" prop="courseId" />
      <el-table-column label="课程名称" align="center" prop="courseName" />
      <el-table-column label="课程学年" align="center" prop="acaYear" />
      <el-table-column label="课程开始周" align="center" prop="startWeek" />
      <el-table-column label="课程结束周" align="center" prop="endWeek" />
      <el-table-column label="课程开始节" align="center" prop="start" />
      <el-table-column label="课程结束节" align="center" prop="end" />
      <el-table-column label="课程周几" align="center" prop="weekday" />
      <el-table-column label="0无1单2双" align="center" prop="special" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['info:timetable:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['info:timetable:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改课程表对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="学生编号" prop="stuId">
          <el-input v-model="form.stuId" placeholder="请输入学生编号" />
        </el-form-item>
        <el-form-item label="学生姓名" prop="stuName">
          <el-input v-model="form.stuName" placeholder="请输入学生姓名" />
        </el-form-item>
        <el-form-item label="课程编号" prop="courseId">
          <el-input v-model="form.courseId" placeholder="请输入课程编号" />
        </el-form-item>
        <el-form-item label="课程名称" prop="courseName">
          <el-input v-model="form.courseName" placeholder="请输入课程名称" />
        </el-form-item>
        <el-form-item label="课程学年" prop="acaYear">
          <el-input v-model="form.acaYear" placeholder="请输入课程学年" />
        </el-form-item>
        <el-form-item label="课程开始周" prop="startWeek">
          <el-input v-model="form.startWeek" placeholder="请输入课程开始周" />
        </el-form-item>
        <el-form-item label="课程结束周" prop="endWeek">
          <el-input v-model="form.endWeek" placeholder="请输入课程结束周" />
        </el-form-item>
        <el-form-item label="课程开始节" prop="start">
          <el-input v-model="form.start" placeholder="请输入课程开始节" />
        </el-form-item>
        <el-form-item label="课程结束节" prop="end">
          <el-input v-model="form.end" placeholder="请输入课程结束节" />
        </el-form-item>
        <el-form-item label="课程周几" prop="weekday">
          <el-input v-model="form.weekday" placeholder="请输入课程周几" />
        </el-form-item>
        <el-form-item label="0无1单2双" prop="special">
          <el-input v-model="form.special" placeholder="请输入0无1单2双" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listTimetable, getTimetable, delTimetable, addTimetable, updateTimetable } from "@/api/info/timetable";

export default {
  name: "Timetable",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 课程表表格数据
      timetableList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        stuId: null,
        stuName: null,
        courseId: null,
        courseName: null,
        acaYear: null,
        startWeek: null,
        endWeek: null,
        start: null,
        end: null,
        weekday: null,
        special: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        stuId: [
          { required: true, message: "学生编号不能为空", trigger: "blur" }
        ],
        stuName: [
          { required: true, message: "学生姓名不能为空", trigger: "blur" }
        ],
        courseId: [
          { required: true, message: "课程编号不能为空", trigger: "blur" }
        ],
        acaYear: [
          { required: true, message: "课程学年不能为空", trigger: "blur" }
        ],
        start: [
          { required: true, message: "课程开始节不能为空", trigger: "blur" }
        ],
        end: [
          { required: true, message: "课程结束节不能为空", trigger: "blur" }
        ],
        weekday: [
          { required: true, message: "课程周几不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.queryParams.stuId = this.$store.getters.name
    this.getList();
  },
  methods: {
    /** 查询课程表列表 */
    getList() {
      this.loading = true;
      listTimetable(this.queryParams).then(response => {
        this.timetableList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        stuId: null,
        stuName: null,
        courseId: null,
        courseName: null,
        acaYear: null,
        startWeek: null,
        endWeek: null,
        start: null,
        end: null,
        weekday: null,
        special: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.stuId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加课程表";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const stuId = row.stuId || this.ids
      getTimetable(stuId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改课程表";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.stuId != null) {
            updateTimetable(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addTimetable(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const stuIds = row.stuId || this.ids;
      this.$modal.confirm('是否确认删除课程表编号为"' + stuIds + '"的数据项？').then(function() {
        return delTimetable(stuIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('info/timetable/export', {
        ...this.queryParams
      }, `timetable_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
