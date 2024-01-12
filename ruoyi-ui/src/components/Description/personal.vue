<template>
  <el-descriptions title="个人信息">
    <el-descriptions-item label="姓名">{{ info.name }}</el-descriptions-item>
    <el-descriptions-item label="年龄">{{ info.age }}</el-descriptions-item>
    <el-descriptions-item label="性别">{{ info.gender }}</el-descriptions-item>
    <el-descriptions-item label="籍贯">
      {{ info.born }}
    </el-descriptions-item>
  </el-descriptions>
</template>


<script>
export default {
  name: "personal",
  data () {
    return {
      info: {
        name: null,
        age: null,
        gender: null,
        born: null
      }
    }
  }

}
</script>

<style scoped>

</style>
