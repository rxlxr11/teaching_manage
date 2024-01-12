import request from '@/utils/request'

// 查询成绩查询列表
export function listGrade(query) {
  return request({
    url: '/info/grade/list',
    method: 'get',
    params: query
  })
}

// 查询成绩查询详细
export function getGrade(stuId) {
  return request({
    url: '/info/grade/' + stuId,
    method: 'get'
  })
}

// 新增成绩查询
export function addGrade(data) {
  return request({
    url: '/info/grade',
    method: 'post',
    data: data
  })
}

// 修改成绩查询
export function updateGrade(data) {
  return request({
    url: '/info/grade',
    method: 'put',
    data: data
  })
}

// 删除成绩查询
export function delGrade(stuId) {
  return request({
    url: '/info/grade/' + stuId,
    method: 'delete'
  })
}
