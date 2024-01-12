import request from '@/utils/request'

// 查询教授课程列表
export function listTeach(query) {
  return request({
    url: '/course/teach/list',
    method: 'get',
    params: query
  })
}

// 查询教授课程详细
export function getTeach(id) {
  return request({
    url: '/course/teach/' + id,
    method: 'get'
  })
}

// 新增教授课程
export function addTeach(data) {
  return request({
    url: '/course/teach',
    method: 'post',
    data: data
  })
}

// 修改教授课程
export function updateTeach(data) {
  return request({
    url: '/course/teach',
    method: 'put',
    data: data
  })
}

// 删除教授课程
export function delTeach(id) {
  return request({
    url: '/course/teach/' + id,
    method: 'delete'
  })
}
