<template>
  <div class="app-container">
    <el-collapse v-model="activeNames" @change="handleChange">
      <el-collapse-item title="通识学分" name="1">
        <el-table v-loading="loading" :data="gradeList[0]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>

          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="专业基础必修" name="2">
        <el-table v-loading="loading" :data="gradeList[1]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="专业方向必修" name="3">
        <el-table v-loading="loading" :data="gradeList[2]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="实践实验必修" name="4">
        <el-table v-loading="loading" :data="gradeList[3]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="通识选修" name="5">
        <el-table v-loading="loading" :data="gradeList[4]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="专业基础选修" name="6">
        <el-table v-loading="loading" :data="gradeList[5]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="专业方向选修" name="7">
        <el-table v-loading="loading" :data="gradeList[6]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="实践选修" name="8">
        <el-table v-loading="loading" :data="gradeList[7]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="校选" name="9">
        <el-table v-loading="loading" :data="gradeList[8]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程类型" align="center" prop="type" />
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
      <el-collapse-item title="自主研学" name="10">
        <el-table v-loading="loading" :data="gradeList[9]" >
          <el-table-column label="课程编号" align="center" prop="courseId" />
          <el-table-column label="课程名称" align="center" prop="courseName" />
          <el-table-column label="课程类型" align="center" prop="type" >
            <template slot-scope="scope">
              <dict-tag :options="dict.type.rx_type" :value="scope.row.type"/>
            </template>
          </el-table-column>
          <el-table-column label="课程学分" align="center" prop="credit" />
          <el-table-column label="总成绩" align="center" prop="grade" />
          <el-table-column label="绩点" align="center" prop="gpa" />
          <el-table-column label="状态" align="center" prop="state">
            <template slot-scope="scope">
              <dict-tag :options="dict.type.sc_state" :value="scope.row.state"/>
            </template>
          </el-table-column>
        </el-table>
      </el-collapse-item>
    </el-collapse>

<!--    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">-->
<!--      <el-form-item label="学生编号" prop="stuId">-->
<!--        <el-input-->
<!--          v-model="queryParams.stuId"-->
<!--          placeholder="请输入学生编号"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="通识学分" prop="compulsoryGeneraleduCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.compulsoryGeneraleduCredit"-->
<!--          placeholder="请输入通识学分"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="专业基础必修" prop="compulsoryMajorbasicCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.compulsoryMajorbasicCredit"-->
<!--          placeholder="请输入专业基础必修"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="专业方向必修" prop="compulsoryMajordirectCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.compulsoryMajordirectCredit"-->
<!--          placeholder="请输入专业方向必修"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="实践实验必修" prop="compulsoryPracticeCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.compulsoryPracticeCredit"-->
<!--          placeholder="请输入实践实验必修"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="通识选修" prop="electiveGeneraleduCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.electiveGeneraleduCredit"-->
<!--          placeholder="请输入通识选修"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="专业基础选修" prop="electiveMajorbasicCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.electiveMajorbasicCredit"-->
<!--          placeholder="请输入专业基础选修"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="专业方向选修" prop="electiveMajordirectCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.electiveMajordirectCredit"-->
<!--          placeholder="请输入专业方向选修"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="实践选修" prop="electivePracticeCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.electivePracticeCredit"-->
<!--          placeholder="请输入实践选修"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="校选" prop="electiveSchoolCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.electiveSchoolCredit"-->
<!--          placeholder="请输入校选"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="自主研学" prop="independentStudyCredit">-->
<!--        <el-input-->
<!--          v-model="queryParams.independentStudyCredit"-->
<!--          placeholder="请输入自主研学"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item>-->
<!--        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>-->
<!--        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>-->
<!--      </el-form-item>-->
<!--    </el-form>-->

<!--    <el-row :gutter="10" class="mb8">-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="primary"-->
<!--          plain-->
<!--          icon="el-icon-plus"-->
<!--          size="mini"-->
<!--          @click="handleAdd"-->
<!--          v-hasPermi="['info:credit:add']"-->
<!--        >新增</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="success"-->
<!--          plain-->
<!--          icon="el-icon-edit"-->
<!--          size="mini"-->
<!--          :disabled="single"-->
<!--          @click="handleUpdate"-->
<!--          v-hasPermi="['info:credit:edit']"-->
<!--        >修改</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="danger"-->
<!--          plain-->
<!--          icon="el-icon-delete"-->
<!--          size="mini"-->
<!--          :disabled="multiple"-->
<!--          @click="handleDelete"-->
<!--          v-hasPermi="['info:credit:remove']"-->
<!--        >删除</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="warning"-->
<!--          plain-->
<!--          icon="el-icon-download"-->
<!--          size="mini"-->
<!--          @click="handleExport"-->
<!--          v-hasPermi="['info:credit:export']"-->
<!--        >导出</el-button>-->
<!--      </el-col>-->
<!--      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>-->
<!--    </el-row>-->

<!--    <el-table v-loading="loading" :data="creditList" @selection-change="handleSelectionChange">-->
<!--      <el-table-column type="selection" width="55" align="center" />-->
<!--      <el-table-column label="编号" align="center" prop="id" />-->
<!--      <el-table-column label="学生编号" align="center" prop="stuId" />-->
<!--      <el-table-column label="通识学分" align="center" prop="compulsoryGeneraleduCredit" />-->
<!--      <el-table-column label="专业基础必修" align="center" prop="compulsoryMajorbasicCredit" />-->
<!--      <el-table-column label="专业方向必修" align="center" prop="compulsoryMajordirectCredit" />-->
<!--      <el-table-column label="实践实验必修" align="center" prop="compulsoryPracticeCredit" />-->
<!--      <el-table-column label="通识选修" align="center" prop="electiveGeneraleduCredit" />-->
<!--      <el-table-column label="专业基础选修" align="center" prop="electiveMajorbasicCredit" />-->
<!--      <el-table-column label="专业方向选修" align="center" prop="electiveMajordirectCredit" />-->
<!--      <el-table-column label="实践选修" align="center" prop="electivePracticeCredit" />-->
<!--      <el-table-column label="校选" align="center" prop="electiveSchoolCredit" />-->
<!--      <el-table-column label="自主研学" align="center" prop="independentStudyCredit" />-->
<!--      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">-->
<!--        <template slot-scope="scope">-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-edit"-->
<!--            @click="handleUpdate(scope.row)"-->
<!--            v-hasPermi="['info:credit:edit']"-->
<!--          >修改</el-button>-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-delete"-->
<!--            @click="handleDelete(scope.row)"-->
<!--            v-hasPermi="['info:credit:remove']"-->
<!--          >删除</el-button>-->
<!--        </template>-->
<!--      </el-table-column>-->
<!--    </el-table>-->

<!--    <pagination-->
<!--      v-show="total>0"-->
<!--      :total="total"-->
<!--      :page.sync="queryParams.pageNum"-->
<!--      :limit.sync="queryParams.pageSize"-->
<!--      @pagination="getList"-->
<!--    />-->

<!--    &lt;!&ndash; 添加或修改学业情况查询对话框 &ndash;&gt;-->
<!--    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>-->
<!--      <el-form ref="form" :model="form" :rules="rules" label-width="80px">-->
<!--        <el-form-item label="学生编号" prop="stuId">-->
<!--          <el-input v-model="form.stuId" placeholder="请输入学生编号" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="通识学分" prop="compulsoryGeneraleduCredit">-->
<!--          <el-input v-model="form.compulsoryGeneraleduCredit" placeholder="请输入通识学分" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="专业基础必修" prop="compulsoryMajorbasicCredit">-->
<!--          <el-input v-model="form.compulsoryMajorbasicCredit" placeholder="请输入专业基础必修" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="专业方向必修" prop="compulsoryMajordirectCredit">-->
<!--          <el-input v-model="form.compulsoryMajordirectCredit" placeholder="请输入专业方向必修" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="实践实验必修" prop="compulsoryPracticeCredit">-->
<!--          <el-input v-model="form.compulsoryPracticeCredit" placeholder="请输入实践实验必修" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="通识选修" prop="electiveGeneraleduCredit">-->
<!--          <el-input v-model="form.electiveGeneraleduCredit" placeholder="请输入通识选修" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="专业基础选修" prop="electiveMajorbasicCredit">-->
<!--          <el-input v-model="form.electiveMajorbasicCredit" placeholder="请输入专业基础选修" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="专业方向选修" prop="electiveMajordirectCredit">-->
<!--          <el-input v-model="form.electiveMajordirectCredit" placeholder="请输入专业方向选修" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="实践选修" prop="electivePracticeCredit">-->
<!--          <el-input v-model="form.electivePracticeCredit" placeholder="请输入实践选修" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="校选" prop="electiveSchoolCredit">-->
<!--          <el-input v-model="form.electiveSchoolCredit" placeholder="请输入校选" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="自主研学" prop="independentStudyCredit">-->
<!--          <el-input v-model="form.independentStudyCredit" placeholder="请输入自主研学" />-->
<!--        </el-form-item>-->
<!--      </el-form>-->
<!--      <div slot="footer" class="dialog-footer">-->
<!--        <el-button type="primary" @click="submitForm">确 定</el-button>-->
<!--        <el-button @click="cancel">取 消</el-button>-->
<!--      </div>-->
<!--    </el-dialog>-->
  </div>
</template>

<script>
import { listCredit, getCredit, delCredit, addCredit, updateCredit } from "@/api/info/credit";
import {listGrade} from "@/api/info/grade";

export default {
  name: "Credit",
  dicts: ['sc_state','rx_type'],
  data() {
    return {
      activeNames: ['1'],
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
      // 学业情况查询表格数据
      creditList: [],
      gradeList: [[]],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        stuId: null,
        compulsoryGeneraleduCredit: null,
        compulsoryMajorbasicCredit: null,
        compulsoryMajordirectCredit: null,
        compulsoryPracticeCredit: null,
        electiveGeneraleduCredit: null,
        electiveMajorbasicCredit: null,
        electiveMajordirectCredit: null,
        electivePracticeCredit: null,
        electiveSchoolCredit: null,
        independentStudyCredit: null
      },
      queryParams2: {
        pageNum: 1,
        pageSize: 10,
        stuId: null,
        stuName: null,
        courseId: null,
        courseName: null,
        type: null,
        credit: null,
        acaYear: null,
        grade: null,
        gpa: null,
        state: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        stuId: [
          { required: true, message: "学生编号不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.queryParams.stuId = this.$store.getters.name
    this.getList();
    this.queryParams2.stuId = this.$store.getters.name;
    for (let i = 0;i<10;i++){
      this.queryParams2.type = i
      listGrade(this.queryParams2).then(response => {
        this.gradeList[i] = response.rows;
      });
    }

  },
  methods: {

    handleChange(val) {
      console.log(val);
    },

    /** 查询学业情况查询列表 */
    getList() {
      this.loading = true;
      listCredit(this.queryParams).then(response => {
        this.creditList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    getList2() {
      this.loading = true;
      listCredit(this.queryParams).then(response => {
        this.creditList = response.rows;
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
        id: null,
        stuId: null,
        compulsoryGeneraleduCredit: null,
        compulsoryMajorbasicCredit: null,
        compulsoryMajordirectCredit: null,
        compulsoryPracticeCredit: null,
        electiveGeneraleduCredit: null,
        electiveMajorbasicCredit: null,
        electiveMajordirectCredit: null,
        electivePracticeCredit: null,
        electiveSchoolCredit: null,
        independentStudyCredit: null
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
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加学业情况查询";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getCredit(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改学业情况查询";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateCredit(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addCredit(this.form).then(response => {
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
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除学业情况查询编号为"' + ids + '"的数据项？').then(function() {
        return delCredit(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('info/credit/export', {
        ...this.queryParams
      }, `credit_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
