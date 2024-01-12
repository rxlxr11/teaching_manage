import request from '@/utils/request'

// 查询已选课程列表
export function listCourse_select(query) {
  return request({
    url: '/course/course_select/list',
    method: 'get',
    params: query
  })
}

// 查询已选课程详细
export function getCourse_select(id) {
  return request({
    url: '/course/course_select/' + id,
    method: 'get'
  })
}

// 新增已选课程
export function addCourse_select(data) {
  return request({
    url: '/course/course_select',
    method: 'post',
    data: data
  })
}

// 修改已选课程
export function updateCourse_select(data) {
  return request({
    url: '/course/course_select',
    method: 'put',
    data: data
  })
}

// 删除已选课程
export function delCourse_select(id) {
  return request({
    url: '/course/course_select/' + id,
    method: 'delete'
  })
}
