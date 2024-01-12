import request from '@/utils/request'

// 查询课程时间列表
export function listTime(query) {
  return request({
    url: '/course/time/list',
    method: 'get',
    params: query
  })
}

// 查询课程时间详细
export function getTime(id) {
  return request({
    url: '/course/time/' + id,
    method: 'get'
  })
}

// 新增课程时间
export function addTime(data) {
  return request({
    url: '/course/time',
    method: 'post',
    data: data
  })
}

// 修改课程时间
export function updateTime(data) {
  return request({
    url: '/course/time',
    method: 'put',
    data: data
  })
}

// 删除课程时间
export function delTime(id) {
  return request({
    url: '/course/time/' + id,
    method: 'delete'
  })
}
