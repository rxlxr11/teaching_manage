import request from '@/utils/request'

// 查询专业学分管理列表
export function listCredit(query) {
  return request({
    url: '/manage/credit/list',
    method: 'get',
    params: query
  })
}

// 查询专业学分管理详细
export function getCredit(id) {
  return request({
    url: '/manage/credit/' + id,
    method: 'get'
  })
}

// 新增专业学分管理
export function addCredit(data) {
  return request({
    url: '/manage/credit',
    method: 'post',
    data: data
  })
}

// 修改专业学分管理
export function updateCredit(data) {
  return request({
    url: '/manage/credit',
    method: 'put',
    data: data
  })
}

// 删除专业学分管理
export function delCredit(id) {
  return request({
    url: '/manage/credit/' + id,
    method: 'delete'
  })
}
