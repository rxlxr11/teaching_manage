import request from '@/utils/request'

// 查询课程表列表
export function listTimetable(query) {
  return request({
    url: '/info/timetable/list',
    method: 'get',
    params: query
  })
}

// 查询课程表详细
export function getTimetable(stuId) {
  return request({
    url: '/info/timetable/' + stuId,
    method: 'get'
  })
}

// 新增课程表
export function addTimetable(data) {
  return request({
    url: '/info/timetable',
    method: 'post',
    data: data
  })
}

// 修改课程表
export function updateTimetable(data) {
  return request({
    url: '/info/timetable',
    method: 'put',
    data: data
  })
}

// 删除课程表
export function delTimetable(stuId) {
  return request({
    url: '/info/timetable/' + stuId,
    method: 'delete'
  })
}
