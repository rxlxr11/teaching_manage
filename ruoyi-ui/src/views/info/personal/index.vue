<template>


  <div class="app-container" >

    <el-collapse v-model="activeNames" @change="handleChange">

      <el-collapse-item title="" name="1">
        <template slot="title">
          <div class="custom-title">个人信息 Personal Information</div>
        </template>
        <el-descriptions title="" label-style="font-size: 16px; font-weight: bold; margin: 10px" content-style="font-size: 16px; margin: 10px" size="mini"  column="1">
          <el-descriptions-item label="姓名">{{ this.personalList[0].name }}</el-descriptions-item>
          <el-descriptions-item label="年龄">{{ this.personalList[0].age }}</el-descriptions-item>
          <el-descriptions-item label="性别">{{ this.personalList[0].gender }}</el-descriptions-item>
          <el-descriptions-item label="籍贯">
            {{ this.personalList[0].born }}
          </el-descriptions-item>
        </el-descriptions>
      </el-collapse-item>
      <el-collapse-item title="" name="2">
        <template slot="title">
          <div class="custom-title">在校信息 School Information</div>
        </template>
        <el-descriptions title="" label-style="font-size: 16px; font-weight: bold; margin: 10px" content-style="font-size: 16px; margin: 10px" size="mini" style="" column="1">
          <el-descriptions-item label="编号">kooriookami</el-descriptions-item>
          <el-descriptions-item label="学院">18100000000</el-descriptions-item>
          <el-descriptions-item v-if="role == 'student'" label="专业">苏州市</el-descriptions-item>
          <el-descriptions-item v-if="role == 'student'" label="班级">苏州市</el-descriptions-item>
          <el-descriptions-item v-if="role == 'teacher'" label="薪水">苏州市</el-descriptions-item>
          <el-descriptions-item v-if="role == 'teacher'" label="职位">
            <el-tag size="small">学校</el-tag>
          </el-descriptions-item>
        </el-descriptions>
      </el-collapse-item>
    </el-collapse>

  </div>
</template>

<script>
import { listPersonal, getPersonal, delPersonal, addPersonal, updatePersonal } from "@/api/info/personal";

export default {
  name: "Personal",
  dicts: ['sys_user_sex'],
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
      // 个人信息表格数据
      personalList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        stuId: null,
        name: null,
        age: null,
        gender: null,
        born: null,
        role: null
      },
      // 表单参数
      form: {},
      role: null,
      // 表单校验
      rules: {
        stuId: [
          { required: true, message: "编号不能为空", trigger: "blur" }
        ],
        name: [
          { required: true, message: "姓名不能为空", trigger: "blur" }
        ],
        role: [
          { required: true, message: "角色不能为空", trigger: "blur" }
        ]
      }
    };
  },
  created() {
    this.queryParams.stuId = this.$store.getters.name
    this.role = this.$store.getters.roles[0]
    this.getList();
  },
  methods: {
    handleChange(val) {
      console.log(val);
    },
    /** 查询个人信息列表 */
    getList() {
      this.loading = true;
      listPersonal(this.queryParams).then(response => {
        this.personalList = response.rows;
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
        name: null,
        age: null,
        gender: null,
        born: null,
        role: null
      };
      this.resetForm("form");
    },
    // /** 搜索按钮操作 */
    // handleQuery() {
    //   this.queryParams.pageNum = 1;
    //   this.getList();
    // },
    // /** 重置按钮操作 */
    // resetQuery() {
    //   this.resetForm("queryForm");
    //   this.handleQuery();
    // },
    // // 多选框选中数据
    // handleSelectionChange(selection) {
    //   this.ids = selection.map(item => item.stuId)
    //   this.single = selection.length!==1
    //   this.multiple = !selection.length
    // },
    // /** 新增按钮操作 */
    // handleAdd() {
    //   this.reset();
    //   this.open = true;
    //   this.title = "添加个人信息";
    // },
    // /** 修改按钮操作 */
    // handleUpdate(row) {
    //   this.reset();
    //   const stuId = row.stuId || this.ids
    //   getPersonal(stuId).then(response => {
    //     this.form = response.data;
    //     this.open = true;
    //     this.title = "修改个人信息";
    //   });
    // },
    // /** 提交按钮 */
    // submitForm() {
    //   this.$refs["form"].validate(valid => {
    //     if (valid) {
    //       if (this.form.stuId != null) {
    //         updatePersonal(this.form).then(response => {
    //           this.$modal.msgSuccess("修改成功");
    //           this.open = false;
    //           this.getList();
    //         });
    //       } else {
    //         addPersonal(this.form).then(response => {
    //           this.$modal.msgSuccess("新增成功");
    //           this.open = false;
    //           this.getList();
    //         });
    //       }
    //     }
    //   });
    // },
    // /** 删除按钮操作 */
    // handleDelete(row) {
    //   const stuIds = row.stuId || this.ids;
    //   this.$modal.confirm('是否确认删除个人信息编号为"' + stuIds + '"的数据项？').then(function() {
    //     return delPersonal(stuIds);
    //   }).then(() => {
    //     this.getList();
    //     this.$modal.msgSuccess("删除成功");
    //   }).catch(() => {});
    // },
    // /** 导出按钮操作 */
    // handleExport() {
    //   this.download('info/personal/export', {
    //     ...this.queryParams
    //   }, `personal_${new Date().getTime()}.xlsx`)
    // }
  }
};
</script>

<style scoped>

.custom-title {
  font-size: 18px; /* 修改字体大小 */
  font-weight: bold; /* 修改字体粗细 */
  /* 其他样式属性... */
}

/*.app-container {*/
/*  width: 100%;*/
/*  height: 100vh;*/
/*  display: flex;*/
/*  justify-content: center;*/
/*  align-items: center;*/
/*  background-image: linear-gradient(to top, #71c4ef 0%, #2e8b57 100%);*/
/*}*/

/*.rx {*/
/*  display: flex;*/
/*  justify-content: center;*/
/*  align-items: center;*/
/*}*/

</style>
